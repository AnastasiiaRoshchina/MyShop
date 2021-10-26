package entity;

import java.io.Serializable;

public class Seller implements Serializable{
    private String fname;
    private String lname;
    
    public Seller(){
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Seller name: " + fname + ", Seller lastname: " + lname;
    }

   
    
    
}
