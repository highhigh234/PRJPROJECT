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
public class Customer {

    protected int cid;
    protected String cfirstname;
    protected String clastname;
    protected Date dob;
    protected String address;
    protected int phonenumber;
    protected String guestusename;

    public Customer() {
    }

    public Customer(int cid, String cfirstname, String clastname, Date dob, String address, int phonenumber, String guestusename) {
        this.cid = cid;
        this.cfirstname = cfirstname;
        this.clastname = clastname;
        this.dob = dob;
        this.address = address;
        this.phonenumber = phonenumber;
        this.guestusename = this.guestusename;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCfirstname() {
        return cfirstname;
    }

    public void setCfirstname(String cfirstname) {
        this.cfirstname = cfirstname;
    }

    public String getClastname() {
        return clastname;
    }

    public void setClastname(String clastname) {
        this.clastname = clastname;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGuestusename() {
        return guestusename;
    }

    public void setGuestusename(String guestusename) {
        this.guestusename = guestusename;
    }
    
}
