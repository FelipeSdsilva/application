package application;

import entities.Product;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Welcome the market!");
        Scanner sc = new Scanner(System.in);
        ;
        System.out.println("enter Produtc data? ");
        
        System.out.print("Name: ");
        String name =sc.nextLine();
        System.out.print("Price: ");
        double price =sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity=sc.nextInt();
        Product product= new Product(name,price, quantity);
        
        System.out.println(product);
        System.out.print("Enter the number of products to be added in stock: ");
        quantity =sc.nextInt();
        product.AddProducts(quantity);
        System.out.println("Update: "+product);
        System.out.print("Enter the number of product to be remove in stock: ");
        quantity = sc.nextInt();
        product.RemoveProduct(quantity);
        System.out.println("Updade: "+product);
        
        
        sc.close();
    }
}
