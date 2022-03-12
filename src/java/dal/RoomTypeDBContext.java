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
                rtypes.setImageURL(rs.getString("rpic"));
                roty.add(rtypes);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return roty;
    }
    
    public RoomType getRoomType(String rtype){
        try {
            String sql = "SELECT * FROM Room_Type WHERE rtype LIKE ?";
            
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + rtype + "%");
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                RoomType r = new RoomType();
                r.setRid(rs.getInt("rid"));
                r.setRtype(rs.getString("rtype"));
                r.setMaxallowed(rs.getInt("maxallowance"));
                r.setPricepernight(rs.getFloat("pricepernight"));
                r.setDescription(rs.getString("description"));
                r.setFacilities(rs.getString("facilities"));
                return r;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomTypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}