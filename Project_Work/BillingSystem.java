package Project_Work;

import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Number of items
        System.out.print("Enter the number of items: ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Arrays to store item names, prices, and quantities
        String[] itemNames = new String[numberOfItems];
        double[] itemPrices = new double[numberOfItems];
        int[] itemQuantities = new int[numberOfItems];

        // Get details for each item
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("\nEnter details for item " + (i + 1) + ":");

            // Get item name
            System.out.print("Item name: ");
            itemNames[i] = scanner.nextLine();

            // Get item price
            System.out.print("Price of " + itemNames[i] + ": ");
            itemPrices[i] = scanner.nextDouble();

            // Get item quantity
            System.out.print("Quantity of " + itemNames[i] + ": ");
            itemQuantities[i] = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
        }

        // Calculate total price
        double totalPrice = 0;
        for (int i = 0; i < numberOfItems; i++) {
            totalPrice += itemPrices[i] * itemQuantities[i];
        }

        // Calculate tax (e.g., 18%)
        double tax = 0.18 * totalPrice;

        // Calculate total amount (including tax)
        double totalAmount = totalPrice + tax;

        // Print the bill
        System.out.println("\n------- BILL -------");
        System.out.println("Item Name\tPrice\tQuantity\tTotal");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println(itemNames[i] + "\t\t" + itemPrices[i] + "\t" + itemQuantities[i] + "\t\t" + itemPrices[i] * itemQuantities[i]);
        }

        System.out.println("\nTotal Price (Before Tax): " + totalPrice);
        System.out.println("Tax (18%): " + tax);
        System.out.println("Total Amount (After Tax): " + totalAmount);
        
        // Close the scanner object
        scanner.close();
    }
}
