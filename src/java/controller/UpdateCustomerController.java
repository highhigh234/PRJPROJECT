/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CustomerDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;

/**
 *
 * @author admin
 */
public class UpdateCustomerController extends BaseAuthController {

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
            out.println("<title>Servlet UpdateCustomerController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateCustomerController at " + request.getContextPath() + "</h1>");
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
        int cid = Integer.parseInt(request.getParameter("cid"));
        CustomerDBContext cdb = new CustomerDBContext();
        Customer customer = cdb.getCustomer(cid);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("updatecustomer.jsp").forward(request, response);
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
        String raw_cid = request.getParameter("cid");
        String raw_cfirstname = request.getParameter("cfirstname");
        String raw_clastname = request.getParameter("clastname");
        String raw_dob = request.getParameter("dob");
        String raw_address = request.getParameter("address");
        String raw_phonenum = request.getParameter("phonenumber");
        String raw_guestusename = request.getParameter("guestusename");
        
        int cid = Integer.parseInt(raw_cid);
        String cfirstname = raw_cfirstname;
        String clastname = raw_clastname;
        Date dob = Date.valueOf(raw_dob);
        String address = raw_address;
        int phonenumber = Integer.parseInt(raw_phonenum);
        String guestusename = raw_guestusename;
        
        Customer c = new Customer();
        c.setCid(cid);
        c.setCfirstname(cfirstname);
        c.setClastname(clastname);
        c.setDob(dob);
        c.setAddress(address);
        c.setPhonenumber(phonenumber);
        c.setGuestusename(guestusename);
        
        CustomerDBContext cdb = new CustomerDBContext();
        cdb.updateCustomer(c);
        response.sendRedirect("listallcustomer");
        
        
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
