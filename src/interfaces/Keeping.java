package interfaces;

import entity.Product;
import entity.History;
import entity.Customer;
import entity.Seller;
import java.util.List;


public interface Keeping {
    public void saveProducts(List<Product> products);
    public List<Product> loadProducts();
    public void saveCustomers(List<Customer> customres);
    public List<Customer> loadCustomers();
    public void saveSellers(List<Seller> sellers);
    public List<Seller> loadSellers();
    public void saveHistories(List<History> histories); //ctrl + shift для множественного курсора
    public List<History> loadHistories();
}