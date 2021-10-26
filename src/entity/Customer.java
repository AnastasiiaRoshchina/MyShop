package entity;

import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Customer implements Serializable{
    String fname;
    String lname;
    String phone;
    
    
    public Customer(){
        
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


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    

    @Override
    public String toString() {
        return "Buyer:\n" + "firstname: "  + fname + ", lastname: " + lname +  ", phone: " + phone;
    }
    
    
}