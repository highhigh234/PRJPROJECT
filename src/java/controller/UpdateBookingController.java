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
public class UpdateBookingController extends HttpServlet {

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
            out.println("<title>Servlet UpdateBookingController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateBookingController at " + request.getContextPath() + "</h1>");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int bid = Integer.parseInt(request.getParameter("bid"));
        BookingDBContext bdb = new BookingDBContext();
        Booking booking = bdb.getBooking(bid);
        request.setAttribute("booking", booking);
                
                
        RoomTypeDBContext db = new RoomTypeDBContext();
        ArrayList<RoomType> roomtypes = db.getRoomType();
        request.setAttribute("roomtypes", roomtypes);
        
        request.getRequestDispatcher("updatebooking.jsp").forward(request, response);
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
        String raw_bid = request.getParameter("bid");
        String raw_rid = request.getParameter("rid");
        String raw_checkInDate = request.getParameter("checkinDate");
        String raw_checkOutDate = request.getParameter("checkoutDate");
        String raw_guestusename = request.getParameter("guestusename");
        
        int bid = Integer.parseInt(raw_bid);
        int rid = Integer.parseInt(raw_rid);
        Date checkInDate = Date.valueOf(raw_checkInDate);
        Date checkOutDate = Date.valueOf(raw_checkOutDate);
        String guestusename = raw_guestusename;
        
        RoomType r = new RoomType();
        r.setRid(rid);
        Booking b = new Booking();
        b.setBid(bid);
        b.setRid(r);
        b.setCheckinDate(checkInDate);
        b.setCheckoutDate(checkOutDate);
        b.setGuestusename(guestusename);
        
        BookingDBContext bdb = new BookingDBContext();
        bdb.updateBooking(b);
        response.sendRedirect("listallbooking?guestusename="+guestusename);

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
