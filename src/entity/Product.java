package entity;

import java.io.Serializable;
import java.util.List;


public class Product implements Serializable{ //сериализация переводит в байты
    private String productName;
    private List<Seller> seller;
    private double price;
    
    
    public Product() {
    }

    public String getCaption() {
        return productName;
    }

    public void setCaption(String productName) {
        this.productName = productName;
    }

    public List<Seller> getSeller() {
        return seller;
    }

    public void setSeller(List<Seller> seller) {
        this.seller = seller;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products: " + productName + ", price = " + price ;
    }
    
}