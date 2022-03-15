/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.RoomTypeDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RoomType;

/**
 *
 * @author admin
 */
public class InsertController extends BaseAuthController {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InsertController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InsertController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("insert.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String raw_rid = request.getParameter("rid");
        String raw_rtype = request.getParameter("rtype");
        String raw_allowance = request.getParameter("maxallowed");
        String raw_price = request.getParameter("pricepernight");
        String raw_description = request.getParameter("description");
        String raw_facilities = request.getParameter("facilities");
        String raw_rpic = request.getParameter("rpic");
        
        int rid = Integer.parseInt(raw_rid);
        String rtype = raw_rtype;
        int maxallowed = Integer.parseInt(raw_allowance);
        float pricepernight = Float.parseFloat(raw_price);
        String description = raw_description;
        String facilities = raw_facilities;
        String rpic = raw_rpic;
        
        RoomType r = new RoomType();
        r.setRid(rid);
        r.setRtype(rtype);
        r.setMaxallowed(maxallowed);
        r.setPricepernight(pricepernight);
        r.setDescription(description);
        r.setFacilities(facilities);
        r.setRpic(rpic);
        
        RoomTypeDBContext rtdb = new RoomTypeDBContext();
        rtdb.insertRoomType(r);
        response.sendRedirect("room");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
