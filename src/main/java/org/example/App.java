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
        int numItem1 = Integer.parseInt(quantity1);
        double priceItem2 = Double.parseDouble(price2);
        int numItem2 = Integer.parseInt(quantity2);
        double priceItem3 = Double.parseDouble(price3);
        int numItem3 = Integer.parseInt(quantity3);

        // calculations
        double item1Total = priceItem1 * numItem1;
        double item2Total = priceItem2 * numItem2;
        double item3Total = priceItem3 * numItem3;

        double subtotal = item1Total + item2Total + item3Total;
        double tax = subtotal * 0.055;
        double total = subtotal + tax;

        System.out.println("Item 1: quantity = " + quantity1 + ", total = $" + String.format("%.2f", item1Total));
        System.out.println("Item 2: quantity = " + quantity2 + ", total = $" + String.format("%.2f", item2Total));
        System.out.println("Item 3: quantity = " + quantity3 + ", total = $" + String.format("%.2f", item3Total));

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal) + "\nTax: $" + String.format("%.2f", tax) + "\nTotal: $" + String.format("%.2f", total));
    }
}
