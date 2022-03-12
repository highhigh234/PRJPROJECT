/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class Booking {
    protected int bnum;
    protected RoomType rid;
    protected Date checkinDate;
    protected Date checkoutDate;
    protected String guestusename;
    public Booking() {
    }

    
    public Booking(int bnum, RoomType rid, Date checkinDate, Date checkoutDate, String guestusename) {
        this.bnum = bnum;
        this.rid = rid;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public int getBnum() {
        return bnum;
    }

    public void setBnum(int bnum) {
        this.bnum = bnum;
    }

    public RoomType getRid() {
        return rid;
    }

    public void setRid(RoomType rid) {
        this.rid = rid;
    }
    
    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getGuestusename() {
        return guestusename;
    }

    public void setGuestusename(String guestusename) {
        this.guestusename = guestusename;
    }

    
    
    
}
