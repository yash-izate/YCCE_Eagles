
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
public class BillManagementSystem {
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








// package Project_Work;

// import java.util.ArrayList;
// import java.util.Scanner;

// class Item{
// 	private String name;
// 	private double price;
// 	private int quantity;
	
// 	public Item(String name, double price, int quantity) {
// 		this.name=name;
// 		this.price=price;
// 		this.quantity=quantity;
// 	}
// 	public String getName() {return name;}
// 	public double getPrice() {return price;}
// 	public int getQuantity() {return quantity;}
// 	public double getTotalPrice() {return price*quantity;}
// }
// class BillingSystem{
// 	private ArrayList<Item> items;
// 	private static final double DISCOUNT_THRESHOLD=500;
// 	private static final double DISCOUNT_RATE=0.1; //10% discount
// 	public BillingSystem() {
// 		items=new ArrayList<>();
// 	}
// 	public void addItem(String name, double price, int quantity) {
// 		items.add(new Item(name, price, quantity));
// 		System.out.println("Item added to the bill");
// 	}
// 	public void generateBill() {
// 		double totalAmount=0.0;
// 		System.out.println("\n---Bill Summary---");
// 		System.out.printf("%-20s %-10s %-10s %-10s\n", "Item.Name", "Price", "Quanity", "Total");
// 		System.out.println("-------------------------------");
// 		for(Item item:items) {
// 			double itemTotal = item.getTotalPrice();
// 			totalAmount+=itemTotal;
// 			System.out.printf("%-20s %-10s %-10s %-10s\n", item.getName(), item.getPrice(), item.getQuantity(), item.getTotalPrice());
// 		}
// 		System.out.println("-------------------------------");
// 		System.out.printf("%-30s %-10.2f\n", "Subtotal:", totalAmount);
// 		if(totalAmount>DISCOUNT_THRESHOLD) {
// 			double discount = totalAmount*DISCOUNT_RATE;
// 			totalAmount -=discount;
// 			System.out.printf("%-30s %-10.2f\n", "Disount(10%):", discount);
// 		}
// 		else {
// 			System.out.printf("%-30s %-10.2f\n", "Disount:","Not Applicable");
// 		}
// 		System.out.printf("%-30s %-10.2f\n", "Total Amount:", totalAmount);
// 		System.out.println("----------Thank you!---------------");
// 	}
// 	}

// public class Main{
// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 		BillingSystem billingSystem = new BillingSystem();
// 		int choice;
// 		do {
// 			System.out.println("\nBilling System");
// 			System.out.println("1. Add Item");
// 			System.out.println("2. Generate Bill");
// 			System.out.println("3. Exit");
// 			System.out.print("Enter your choice :");
// 			choice = scanner.nextInt();
// 			scanner.nextLine();//consume new line character
// 			switch(choice) {
// 			case 1:
// 				System.out.print("Enter item name : ");
// 				String name = scanner.nextLine();
// 				System.out.print("Enter item price : ");
// 				double price = scanner.nextDouble();
// 				System.out.print("Enter item quantity: ");
// 				int quantity = scanner.nextInt();
// 				billingSystem.addItem(name, price, quantity);
// 				break;
// 			case 2:
// 				billingSystem.generateBill(); break;
// 			case 3: 
// 				System.out.println("Exiting Thank you!"); break;
// 			default:System.out.println("invalid choice. Try again!");
// 			}}while(choice!=3);
// 		scanner.close();
// 		}
// 	}