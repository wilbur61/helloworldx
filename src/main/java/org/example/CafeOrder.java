package org.example;


public class CafeOrder {

    public static void main(String[] args) {
        // Define product names and prices
        String product1 = "Coffee";
        double price1 = 2.50;
        String product2 = "Cappuccino";
        double price2 = 3.00;
        String product3 = "Espresso";
        double price3 = 4.00;

        // Calculate order quantities
        int quantity1 = 3;
        int quantity2 = 4;
        int quantity3 = 2;

        // Calculate subtotal
        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);

        // Define sales tax
        final double SALES_TAX = 0.07;

        // Calculate total sale
        double totalSale = subtotal + (subtotal * SALES_TAX);

        // Format results to two decimal places
        String formattedSubtotal = String.format("%.2f", subtotal);
        String formattedTotalSale = String.format("%.2f", totalSale);

        // Print order details
        System.out.println("Order Details:");
        System.out.printf("%dx %s: $%.2f each\n", quantity1, product1, price1);
        System.out.printf("%dx %s: $%.2f each\n", quantity2, product2, price2);
        System.out.printf("%dx %s: $%.2f each\n", quantity3, product3, price3);
        System.out.println("Subtotal: $" + formattedSubtotal);
        System.out.println("Sales Tax: $" + SALES_TAX);
        System.out.println("Total Sale: $" + formattedTotalSale);
    }
}