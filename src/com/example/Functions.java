package com.example;

/**
 * Create function received a price and return the price with the tax amount included
 */
public class Functions {
    public static void main(String[] args) {
        System.out.println(getPriceWithTax(100));
        System.out.println(getPriceWithTax(200));
    }
    static double getPriceWithTax(double price){
        return price + (price * 0.1);
    }
}
