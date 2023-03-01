package application;

import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        
        Product p = new Product(name, price, quantity);
        p.showDataProduct();
        
        System.out.println();
        
        System.out.print("Enter the number of products to be added in stock: ");
        int n = sc.nextInt();
        p.addProducts(n);
        p.showDataProduct();
        
        System.out.println();
        
        System.out.print("Enter the number of products to be removed in stock: ");
        n = sc.nextInt();
        p.removeProducts(n);
        p.showDataProduct();
        
        sc.close();
    }

}
