package Project_Work;

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
    private Item[] items;
    private int itemCount;

    // Constructor
    public BillingSystem(int itemCount) {
        items = new Item[itemCount];
        this.itemCount = itemCount;
    }

    // Method to add items to the billing system
    public void addItem(int index, Item item) {
        items[index] = item;
    }

    // Method to calculate total price before tax
    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getTotalPrice();
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
        System.out.println("\n------- BILL -------");
        System.out.println("Item Name\tPrice\tQuantity\tTotal");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].getName() + "\t\t" + items[i].getPrice() + "\t" + items[i].getQuantity() + "\t\t" + items[i].getTotalPrice());
        }

        System.out.println("\nTotal Price (Before Tax): " + calculateTotalPrice());
        System.out.println("Tax (18%): " + calculateTax());
        System.out.println("Total Amount (After Tax): " + calculateTotalAmount());
    }
}

// Main class to drive the program
public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Number of items
        System.out.print("Enter the number of items: ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create a BillingSystem object
        BillingSystem billingSystem = new BillingSystem(numberOfItems);

        // Get details for each item and add them to the billing system
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("\nEnter details for item " + (i + 1) + ":");

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
            billingSystem.addItem(i, item);
        }

        // Print the bill
        billingSystem.printBill();

        // Close the scanner object
        scanner.close();
    }
}
