/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

/**
 *
 * @author MahBo
 */
public class MyApp {
public static void main(String[] args) {
Product product = new Product("Edam", 3.3, 120);
System.out.println("Product value is " + product.countValue());
product.printProduct();

product.changePrice(4.1);
System.out.println("\nProduct value is " + product.countValue());

product.changeAmount(245);
System.out.println("\nProduct value is " + product.countValue());

}
}
class Product {
private String name;
private double price;
private int amount; //Amount in storage
public Product(String name, double price, int amount) {
this.name = name;
this.price = price;
this.amount = amount;
}
public double countValue() {
return(amount * price);
}

public void changeAmount(int newvalue)
{
    amount = newvalue;
}
public void printProduct() {
System.out.printf("Product %s, price %4.1f and balance %d pcs",
name,price,amount);
}

public void changePrice(double newPrice)
{
    price = newPrice;
}

}
