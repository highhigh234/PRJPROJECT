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
import model.RoomType;

/**
 *
 * @author admin
 */
public class BookingDBContext extends DBContext{
    public void insertBooking(Booking b){
        
        String sql = "INSERT INTO [Booking]\n" +
                    "           ([rid]\n" +
                    "           ,[checkInDate]\n" +
                    "           ,[checkOutDate]\n" +
                    "           ,[guestusename])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?)";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, b.getRid().getRid());
            stm.setDate(2, b.getCheckinDate());
            stm.setDate(3, b.getCheckoutDate());
            stm.setString(4, b.getGuestusename());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BookingDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            if(stm != null)
                try {
                    stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookingDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(connection != null)
                try {
                    connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookingDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ArrayList<Booking> getAllBooking(String guestusename){
        ArrayList<Booking> bookings = new ArrayList<>();
        try {
            
            String sql = "SELECT B.bid, R.rtype, B.checkInDate, B.checkOutDate, B.guestusename\n" +
                        "FROM Booking B INNER JOIN Room_Type R\n" +
                        "ON B.rid = R.rid\n" +
                        "WHERE guestusename LIKE ?";
            
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1,"%" + guestusename+ "%");
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Booking b = new Booking();
                RoomType r = new RoomType();
                b.setBid(rs.getInt("bid"));
                b.setCheckinDate(rs.getDate("checkInDate"));
                b.setCheckoutDate(rs.getDate("checkOutDate"));
                b.setGuestusename(rs.getString("guestusename"));
                r.setRtype(rs.getString("rtype"));
                b.setRid(r);
                bookings.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookingDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookings;
    }
    
    public Booking getBooking(int bid){
        try {
            String sql = "SELECT B.bid,B.rid, R.rtype, B.checkInDate, B.checkOutDate, B.guestusename\n" +
                    "FROM Booking B INNER JOIN Room_Type R\n" +
                    "ON B.rid = R.rid\n" +
                    "WHERE bid = ? ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, bid);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                Booking b = new Booking();
                RoomType r = new RoomType();
                b.setBid(rs.getInt("bid"));
                b.setCheckinDate(rs.getDate("checkInDate"));
                b.setCheckoutDate(rs.getDate("checkOutDate"));
                b.setGuestusename(rs.getString("guestusename"));
                r.setRtype(rs.getString("rtype"));
                r.setRid(rs.getInt("rid"));
                b.setRid(r);
                return b;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookingDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
}
    
     public void updateBooking(Booking b){
        String sql = "UPDATE [Booking]\n" +
                "   SET [rid] = ?\n" +
                "      ,[checkInDate] = ?\n" +
                "      ,[checkOutDate] = ?\n" +
                "      ,[guestusename] = ?\n" +
                " WHERE [bid] = ?";
        
        PreparedStatement stm = null;
        
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(5, b.getBid());
            stm.setInt(1, b.getRid().getRid());
            stm.setDate(2, b.getCheckinDate());
            stm.setDate(3, b.getCheckoutDate());
            stm.setString(4, b.getGuestusename());
            stm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(BookingDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stm!=null)
                try {
                    stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookingDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }if(connection!=null)
                try {
                    connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookingDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }
}