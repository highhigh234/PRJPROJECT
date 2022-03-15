/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Booking;
import model.Customer;
import model.RoomType;

public class CustomerDBContext extends DBContext{
    public void insertCustomer(Customer c){
        String sql = "INSERT INTO [Customer]\n" +
                    "           ([cfirstname]\n" +
                    "           ,[clastname]\n" +
                    "           ,[dob]\n" +
                    "           ,[address]\n" +
                    "           ,[phonenumber]\n" +
                    "           ,[guestusename])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?)";
        
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, c.getCfirstname());
            stm.setString(2, c.getClastname());
            stm.setDate(3, c.getDob());
            stm.setString(4, c.getAddress());
            stm.setInt(5, c.getPhonenumber());
            stm.setString(6, c.getGuestusename());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(stm!=null)
                try {
                    stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(connection !=null)
                try {
                    connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Customer getCustomer(String cfirstname){
        try {
            String sql = "SELECT C.cfirstname, C.clastname, C.cid, C.dob, C.address, B.checkInDate,B.checkOutDate, R.rtype\n" +
                    "FROM Customer C INNER JOIN Booking B\n" +
                    "ON C.guestusename = B.guestusename\n" +
                    "INNER JOIN Room_Type R\n" +
                    "ON B.rid = R.rid\n" +
                    "WHERE C.cfirstname LIKE ?";
            
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + cfirstname + "%");
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                RoomType r = new RoomType();
                Customer c = new Customer();
                Booking b = new Booking();
                c.setCfirstname(rs.getString("cfirstname"));
                c.setClastname(rs.getString("clastname"));
                c.setCid(rs.getInt("cid"));
                c.setDob(rs.getDate("dob"));
                c.setAddress(rs.getString("address"));
                b.setCheckinDate(rs.getDate("checkInDate"));
                b.setCheckoutDate(rs.getDate("checkOutDate"));
                r.setRtype(rs.getString("rtype"));
                return c;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public ArrayList<Customer> getAllCustomer(){
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM Customer";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Customer c = new Customer();
                c.setCid(rs.getInt("cid"));
                c.setCfirstname(rs.getString("cfirstname"));
                c.setClastname(rs.getString("clastname"));
                c.setDob(rs.getDate("dob"));
                c.setAddress(rs.getString("address"));
                c.setPhonenumber(rs.getInt("phonenumber"));
                c.setGuestusename(rs.getString("guestusename"));
                customers.add(c);
            }
        }catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
         
    }
    public Customer getCustomer(int cid){
        try {
            String sql = "SELECT * FROM Customer WHERE cid = ? ";
            
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, cid);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                Customer c = new Customer();
                c.setCid(rs.getInt("cid"));
                c.setCfirstname(rs.getString("cfirstname"));
                c.setClastname(rs.getString("clastname"));
                c.setDob(rs.getDate("dob"));
                c.setAddress(rs.getString("address"));
                c.setPhonenumber(rs.getInt("phonenumber"));
                c.setGuestusename(rs.getString("guestusename"));
                return c;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void updateCustomer(Customer c){
        String sql = "UPDATE [Customer]\n" +
                    "   SET [cfirstname] = ?\n" +
                    "      ,[clastname] = ?\n" +
                    "      ,[dob] = ?\n" +
                    "      ,[address] = ?\n" +
                    "      ,[phonenumber] = ?\n" +
                    "      ,[guestusename] = ?\n" +
                    " WHERE [cid] = ? ";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(7, c.getCid());
            stm.setString(1, c.getCfirstname());
            stm.setString(2, c.getClastname());
            stm.setDate(3, c.getDob());
            stm.setString(4, c.getAddress());
            stm.setInt(5, c.getPhonenumber());
            stm.setString(6, c.getGuestusename());
            stm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stm!=null)
                try {
                    stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(connection!=null)
                try {
                    connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
