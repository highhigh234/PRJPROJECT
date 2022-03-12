/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Booking;

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
}
