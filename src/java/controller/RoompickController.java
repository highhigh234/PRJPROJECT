/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.BookingDBContext;
import dal.RoomTypeDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Booking;
import model.RoomType;

/**
 *
 * @author admin
 */
public class RoompickController extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RoomTypeDBContext db = new RoomTypeDBContext();
        ArrayList<RoomType> rtypes = db.getRoomType();
        request.setAttribute("rtypes", rtypes);
        request.getRequestDispatcher("roompick.jsp").forward(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String raw_rid = request.getParameter("rid");
        String raw_checkinDate = request.getParameter("checkinDate");
        String raw_checkoutDate = request.getParameter("checkoutDate");
        String raw_guestusename = request.getParameter("guestusename");
        
        
        
        int rid = Integer.parseInt(raw_rid);
        Date checkinDate = Date.valueOf(raw_checkinDate);
        Date checkoutDate = Date.valueOf(raw_checkoutDate);
        String guestusename = raw_guestusename;
        
        RoomType r = new RoomType();
        r.setRid(rid);
        Booking b = new Booking();
        b.setRid(r);
        b.setCheckinDate(checkinDate);
        b.setCheckoutDate(checkoutDate);
        b.setGuestusename(guestusename);
        
        BookingDBContext bdb = new BookingDBContext();
        bdb.insertBooking(b);
        
        response.sendRedirect("index.jsp");
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
