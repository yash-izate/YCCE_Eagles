package ExpenseManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseManager {

    private static List<Expense> expenses = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Load expenses from the file on startup
        try {
            expenses = FileHandler.loadExpenses();
            System.out.println("Expenses loaded successfully.");
        } catch (Exception e) {
            System.out.println("No existing data found. Starting fresh...");
        }

        while (true) {
            System.out.println("\n========== Personal Expenses Manager ==========");
            System.out.println("1. Add Expenses");
            System.out.println("2. Generate Report");
            System.out.println("3. Save & Exit");
            System.out.print("Your Response: ");
            int choice;

            // Handle invalid inputs for choice
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    generateReport();
                    break;
                case 3:
                    saveAndExit();
                    return; // Exit loop after saving
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    public static void addExpense() {
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount;

        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Expense not added.");
            return;
        }

        Expense expense = new Expense(date, category, description, amount);
        expenses.add(expense); // Add to list
        System.out.println("Expense added successfully!");
    }

    public static void generateReport() {
        System.out.print("Enter category for report (or All): ");
        String category = scanner.nextLine();
        double total = 0;
        System.out.println("\nDate         | Category      | Description         | Amount");
        System.out.println("---------------------------------------------------------------");

        for (Expense expense : expenses) {
            if (category.equalsIgnoreCase("ALL") || expense.getCategory().equalsIgnoreCase(category)) {
                System.out.println(String.format("%-12s | %-12s | %-18s | %.2f",
                        expense.getDate(), expense.getCategory(), expense.getDescription(), expense.getAmount()));
                total += expense.getAmount();
            }
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("Total Amount: " + total);
    }

    public static void saveAndExit() {
        try {
            FileHandler.saveExpenses(expenses);
            System.out.println("Data saved successfully. Goodbye!");
        } catch (Exception e) {
            System.out.println("Failed to save data. Exiting without saving.");
            e.printStackTrace();
        }
    }
}
