package myclasses;

import entity.Customer;
import entity.Product;
import entity.Seller;
import entity.History;
import interfaces.Keeping;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


import java.util.List;
import java.util.Scanner;
import keeper.FileKeeper;

/**
 *
 * @seller pupil
 */
public class App {
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();
    List<Seller> sellers = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();
    List<History> histories = new ArrayList<>();
    Keeping keeper = new FileKeeper(); //ctrl + r чтобы изменить везде в программе название переменной 
    //Keeping keeper = new BaseKeeper(); //изменим реализацию кипера
    
    public App() {//constructor
        products = keeper.loadProducts(); //подгружаем книги из файла
        histories = keeper.loadHistories();
        customers = keeper.loadCustomers();
        sellers = keeper.loadSellers();
    }
    public void run(){
        String repeat = "y";
        do{
            System.out.println("Выберите задачу");
            System.out.println("0: закончить программу");
            System.out.println("1: добавить продукт");
            System.out.println("2: Вывести список продуктов");
            System.out.println("3: Добавить покупателя");
            System.out.println("4: Список покупателей");
            System.out.println("5: Добавить продавца");
            System.out.println("6: Список продавцов");
            System.out.println("7: Продать товар");
            System.out.println("8: Список проданных товаров");
            
            int task = scanner.nextInt();
            scanner.nextLine();
            switch(task){
                case 0: 
                    repeat ="q"; // в конце проверяется, равна ли эта строка "y". если не равна, то программа заканчивается
                    System.out.println("Программа закончена");
                    break;
               
                case 1: 
                    System.out.println("Добавление продукта");
                    products.add(addProduct());//добавление в список
                    keeper.saveProducts(products);
                    break;
                case 2:
               
                    System.out.println("Список продуктов:");
                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i)!=null){//во избежание ошибки nullpointerexception, когда печатаешь массив из 10 ячеек, но только 2 заполнены
                           System.out.println((i+1)+ " " + products.get(i).toString()); 
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("Добавлениe покупателя");
                    customers.add(addCustomer());
                    keeper.saveCustomers(customers);
                    break;
                    
                case 4:
                    System.out.println("Список покупателей");
                    for (int i = 0; i < customers.size(); i++) {
                        if (customers.get(i)!=null){
                           System.out.println(customers.get(i).toString()); 
                        }
                    }
                    break;
                    
                    case 5:
                    System.out.println("Добавлениe продавца");
                    sellers.add(addSeller());
                    keeper.saveSellers(sellers);
                    break;
                    
                case 6:
                    System.out.println("Список продавцов");
                    for (int i = 0; i < sellers.size(); i++) {
                        if (sellers.get(i)!=null){
                           System.out.println(sellers.get(i).toString()); 
                        }
                    }
                    break;
                
                case 7:
                    System.out.println("Продажа товара");
                    histories.add(addHistory());
                    keeper.saveHistories(histories);
                    break;
                case 8:
                    printGivenProducts();
                    break;

            }
        }while("y".equals(repeat));
    }
    
   
    
    private History addHistory(){
        History history = new History();
       
        
        System.out.println("Список товаров:");
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i)!=null){
                System.out.printf("%d. %s%n", (i+1), products.get(i).toString()); 
            }
        }
        System.out.print("Номер товара: ");
        int productNumber = scanner.nextInt(); scanner.nextLine();
        history.setProduct(products.get(productNumber-1));
        
        System.out.println("Список покупателей");
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i)!=null){
                System.out.printf("%d. %s%n", (i+1), customers.get(i).toString()); 
            }
        }
        System.out.print("Номер покупателя: ");
        int customerNumber = scanner.nextInt(); scanner.nextLine();
        history.setCustomer(customers.get(customerNumber-1));
        
         
        
        System.out.println("Список продавцов");
        for (int i = 0; i < sellers.size(); i++) {
            if (sellers.get(i)!=null){
                System.out.printf("%d. %s%n", (i+1), sellers.get(i).toString()); 
            }
        }
        System.out.print("Номер продавца: ");
        int sellerNumber = scanner.nextInt(); scanner.nextLine();
        history.setSeller(sellers.get(sellerNumber-1));
        
        
        //задать сегодняшнюю дату
        Calendar c = new GregorianCalendar();
        history.setDate(c.getTime());
        
        
        return history;
    }
    
    private Seller addSeller(){
        Seller seller = new Seller();
            System.out.print("Имя продавца: ");
            seller.setFname(scanner.nextLine());
            System.out.print("Фамилия автора: ");
            seller.setLname(scanner.nextLine());
            return seller;
    }
    
    
    private Product addProduct(){
        Product product = new Product();
        System.out.print("Название товара: ");
        product.setCaption(scanner.nextLine());
        System.out.print("Цена товара: ");
        product.setPrice(scanner.nextInt());
        scanner.nextLine();
        return product; 

    }
            
    private Customer addCustomer(){
        Customer customer = new Customer();
        System.out.print("Имя покупателя: ");
        customer.setFname(scanner.nextLine());
        System.out.println("Фамилия покупателя: ");
        customer.setLname(scanner.nextLine());
        System.out.println("телефон покупателя: ");
        customer.setPhone(scanner.nextLine());
        return customer;
    }
    
    private void printGivenProducts(){
        System.out.println("Проданные товары");
                    for (int i = 0; i < histories.size(); i++) {
                        if (histories.get(i)!=null){
                            System.out.printf("%d. Товар %s продан кому: %s %s кем: %s %s %n ",
                                (i+1),
                                histories.get(i).getProduct().getCaption(), 
                           
                                histories.get(i).getCustomer().getLname(),
                                histories.get(i).getCustomer().getFname(),
                                histories.get(i).getSeller().getLname(),
                                histories.get(i).getSeller().getFname());
                               
                        }
                    }
    }
}