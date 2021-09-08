package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        // ask for input
        System.out.print("Enter the price of item 1: ");
        String price1 = se.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String quantity1 = se.nextLine();

        System.out.print("Enter the price of item 2: ");
        String price2 = se.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String quantity2 = se.nextLine();

        System.out.print("Enter the price of item 3: ");
        String price3 = se.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String quantity3 = se.nextLine();

        // convert input string to numerical data
        double priceItem1 = Double.parseDouble(price1);
        double numItem1 = Double.parseDouble(quantity1);
        double priceItem2 = Double.parseDouble(price2);
        double numItem2 = Double.parseDouble(quantity2);
        double priceItem3 = Double.parseDouble(price3);
        double numItem3 = Double.parseDouble(quantity3);

        // calculations
        double subtotal = (priceItem1 * numItem1) + (priceItem2 * numItem2) + (priceItem3 * numItem3);
        double tax = subtotal * 0.055;
        double total = subtotal + tax;

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal) + "\nTax: $" + String.format("%.2f", tax) + "\nTotal: $" + String.format("%.2f", total));
    }
}
