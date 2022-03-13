package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.RoomType;


public class RoomTypeDBContext extends DBContext{
    
    public ArrayList<RoomType> getRoomType(){
        ArrayList<RoomType> roty = new ArrayList<>();
        try {
            
            
            String sql = "SELECT * FROM Room_Type";
            PreparedStatement stm = connection.prepareStatement(sql);
            
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                RoomType rtypes = new RoomType();
                rtypes.setRid(rs.getInt("rid"));
                rtypes.setRtype(rs.getString("rtype"));
                rtypes.setMaxallowed(rs.getInt("maxallowance"));
                rtypes.setPricepernight(rs.getFloat("pricepernight"));
                rtypes.setDescription(rs.getString("description"));
                rtypes.setFacilities(rs.getString("facilities"));
                rtypes.setRpic(rs.getString("rpic"));
                roty.add(rtypes);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return roty;
    }
    
    public RoomType getRoomType(int rid){
        try {
            String sql = "SELECT * FROM Room_Type WHERE rid = ?";
            
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, rid);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                RoomType r = new RoomType();
                r.setRid(rs.getInt("rid"));
                r.setRtype(rs.getString("rtype"));
                r.setMaxallowed(rs.getInt("maxallowance"));
                r.setPricepernight(rs.getFloat("pricepernight"));
                r.setDescription(rs.getString("description"));
                r.setFacilities(rs.getString("facilities"));
                r.setRpic(rs.getString("rpic"));
                return r;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void updateRoom(RoomType r){
        String sql = "UPDATE [Room_Type]\n" +
                    "   SET [rtype] = ?\n" +
                    "      ,[maxallowance] = ?\n" +
                    "      ,[pricepernight] = ?\n" +
                    "      ,[description] = ?\n" +
                    "      ,[facilities] = ?\n" +
                    "      ,[rpic] = ?\n" +
                    " WHERE [rid] = ? ";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(7, r.getRid());
            stm.setString(1, r.getRtype());
            stm.setInt(2, r.getMaxallowed());
            stm.setFloat(3, r.getPricepernight());
            stm.setString(4, r.getDescription());
            stm.setString(5, r.getFacilities());
            stm.setString(6, r.getRpic());
            stm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(stm!=null)
                try {
                    stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(connection !=null)
                try {
                    connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void insertRoomType(RoomType r){
        String sql = "INSERT INTO [Room_Type]\n" +
                    "           ([rid]\n" +
                    "           ,[rtype]\n" +
                    "           ,[maxallowance]\n" +
                    "           ,[pricepernight]\n" +
                    "           ,[description]\n" +
                    "           ,[facilities]\n" +
                    "           ,[rpic])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?)" ;
        
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, r.getRid());
            stm.setString(2, r.getRtype());
            stm.setInt(3, r.getMaxallowed());
            stm.setFloat(4, r.getPricepernight());
            stm.setString(5, r.getDescription());
            stm.setString(6, r.getFacilities());
            stm.setString(7, r.getRpic());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(stm!=null)
                try {
                    stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }if(connection != null)
                try {
                    connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void deleteRoomType(RoomType r){
        String sql = "DELETE FROM [Room_Type] WHERE [rid] = ?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, r.getRid());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stm!=null)
                try {
                    stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }if(connection!=null)
                try {
                    connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}