package entity;

import java.io.Serializable;

import java.util.Date;


public class History implements Serializable{
    Product product;
    Seller seller;
    Customer customer;
    Date date;
    double price;
    
    public History(){
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
       this.seller = seller;
   }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "History:" + product + ",\n" + seller + ",\n" + customer + ",\ndate: " + date + '}';
    }
    
    
    
}