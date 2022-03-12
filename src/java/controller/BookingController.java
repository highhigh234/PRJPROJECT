/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.BookingDBContext;
import dal.CustomerDBContext;
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
import model.Customer;
import model.RoomType;

/**
 *
 * @author admin
 */
public class BookingController extends HttpServlet {

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
        ArrayList<RoomType> roomtypesss = db.getRoomType();
        request.setAttribute("roomtypesss", roomtypesss);

        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet uest
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //customer data
        String raw_cfirstname = request.getParameter("cfirstname");
        String raw_clastname = request.getParameter("clastname");
        String raw_dob = request.getParameter("dob");
        String raw_address = request.getParameter("address");
        String raw_phonenum = request.getParameter("phonenumber");
        String raw_guestusename = request.getParameter("guestusename");
        
        String cfirstname = raw_cfirstname;
        String lastname = raw_clastname;
        Date dob = Date.valueOf(raw_dob);
        String address = raw_address;
        int phonenumber = Integer.parseInt(raw_phonenum);
        String guestusename = raw_guestusename;

        //insert customer's information
        

        Customer c = new Customer();
        c.setCfirstname(cfirstname);
        c.setClastname(lastname);
        c.setDob(dob);
        c.setAddress(address);
        c.setPhonenumber(phonenumber);
        c.setGuestusename(guestusename);

        CustomerDBContext cdb = new CustomerDBContext();
        cdb.insertCustomer(c);
        
        response.sendRedirect("roompick");
        
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
