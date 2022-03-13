/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class RoomType {
    protected int rid;
    protected String rtype;
    protected int maxallowed;
    protected float pricepernight;
    protected String description;
    protected String facilities;
    protected String rpic;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
    
    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public int getMaxallowed() {
        return maxallowed;
    }

    public void setMaxallowed(int maxallowed) {
        this.maxallowed = maxallowed;
    }

    public float getPricepernight() {
        return pricepernight;
    }

    public void setPricepernight(float pricepernight) {
        this.pricepernight = pricepernight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getRpic() {
        return rpic;
    }

    public void setRpic(String rpic) {
        this.rpic = rpic;
    }

    public RoomType(String rtype, int maxallowed, float pricepernight, String description, String facilities, String rpic) {
        this.rtype = rtype;
        this.maxallowed = maxallowed;
        this.pricepernight = pricepernight;
        this.description = description;
        this.facilities = facilities;
        this.rpic = rpic;
    }

    public RoomType() {
    }
    
    
}
