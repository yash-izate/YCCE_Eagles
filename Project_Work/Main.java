package Project_Work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class to represent an item
class Item {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate the total price of the item
    public double getTotalPrice() {
        return price * quantity;
    }
}

// Class to represent the billing system
class BillingSystem {
    private List<Item> items;

    // Constructor
    public BillingSystem() {
        items = new ArrayList<>();
    }

    // Method to add items to the billing system
    public void addItem(Item item) {
        items.add(item);
    }

    // Method to calculate total price before tax
    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    // Method to calculate tax (18%)
    public double calculateTax() {
        return 0.18 * calculateTotalPrice();
    }

    // Method to calculate the total amount after tax
    public double calculateTotalAmount() {
        return calculateTotalPrice() + calculateTax();
    }

    // Method to print the bill
    public void printBill() {
        if (items.isEmpty()) {
            System.out.println("No items to display.");
            return;
        }

        System.out.println("\n------- BILL -------");
        System.out.println("Item Name\tPrice\tQuantity\tTotal");
        for (Item item : items) {
            System.out.println(item.getName() + "\t\t" + item.getPrice() + "\t" + item.getQuantity() + "\t\t" + item.getTotalPrice());
        }

        System.out.println("\nTotal Price (Before Tax): " + calculateTotalPrice());
        System.out.println("Tax (18%): " + calculateTax());
        System.out.println("Total Amount (After Tax): " + calculateTotalAmount());
    }
}

// Main class to drive the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Billing System!");

        // Create an instance of BillingSystem
        BillingSystem billingSystem = new BillingSystem();

        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. View Bill");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    // Add Item
                    System.out.println("\nEnter details for the item:");

                    // Get item name
                    System.out.print("Item name: ");
                    String name = scanner.nextLine();

                    // Get item price
                    System.out.print("Price of " + name + ": ");
                    double price = scanner.nextDouble();

                    // Get item quantity
                    System.out.print("Quantity of " + name + ": ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character

                    // Create an Item object and add it to the billing system
                    Item item = new Item(name, price, quantity);

                    // Add item to the system
                    billingSystem.addItem(item);
                    System.out.println("Item added successfully!");
                    break;

                case 2:
                    // View Bill
                    billingSystem.printBill();
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Thank you for using the Billing System. Goodbye!");
                    continueRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        // Close the scanner object
        scanner.close();
    }
}
