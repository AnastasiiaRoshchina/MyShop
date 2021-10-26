package keeper;

import entity.Customer;
import entity.Seller;
import entity.History;
import entity.Product;
import interfaces.Keeping;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pupil
 */
public class FileKeeper implements Keeping{

    public static List<Product> loadProducts(List<Product> products) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void saveProducts(List<Product> products){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("products");//использование текущей директории, букс будет создан в папке проекта
            oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.flush();//проталкивание данных на жесткий диск
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "file products not found", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "input error", ex);
        }
    }
    
    @Override
    public List<Product> loadProducts() {
        List <Product> listProducts = new ArrayList();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("products");
            ois = new ObjectInputStream(fis);
            listProducts = (List<Product>) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "file product not found", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "output error", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "class not found", ex);
        }
        return listProducts;
    }
    
    @Override
    public void saveCustomers(List<Customer> customers) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("customers");//использование текущей директории, букс будет создан в папке проекта
            oos = new ObjectOutputStream(fos);
            oos.writeObject(customers);
            oos.flush();//проталкивание данных на жесткий диск
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "file customers not found", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "input error", ex);
        }
    }

    @Override
    public List<Customer> loadCustomers() {
        List <Customer> listCustomers = new ArrayList();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("customers");
            ois = new ObjectInputStream(fis);
            listCustomers = (List<Customer>) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "file customers not found", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "output error", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "class not found", ex);
        }
        
        return listCustomers;
    }  
    
    @Override
    public void saveSellers(List<Seller> sellers) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("sellers");//использование текущей директории, букс будет создан в папке проекта
            oos = new ObjectOutputStream(fos);
            oos.writeObject(sellers);
            oos.flush();//проталкивание данных на жесткий диск
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "file customers not found", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "input error", ex);
        }
    }

    @Override
    public List<Seller> loadSellers() {
        List <Seller> listSellers = new ArrayList();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("sellers");
            ois = new ObjectInputStream(fis);
            listSellers = (List<Seller>) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "file customers not found", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "output error", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "class not found", ex);
        }
        
        return listSellers;
    }

    @Override
    public void saveHistories(List<History> histories) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("histories");//использование текущей директории, букс будет создан в папке проекта
            oos = new ObjectOutputStream(fos);
            oos.writeObject(histories);
            oos.flush();//проталкивание данных на жесткий диск
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "file histories not found", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "input error", ex);
        }
    }

    @Override
    public List<History> loadHistories() {
        List <History> listHistories = new ArrayList();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("histories");
            ois = new ObjectInputStream(fis);
            listHistories = (List<History>) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "file histories not found", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "output error", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "class not found", ex);
        }
        
       return listHistories;
    }
}