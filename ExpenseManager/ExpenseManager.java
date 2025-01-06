package ExpenseManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseManager {

    private static List<Expense> expenses = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n ========== Personal Expenses Manager =========");
            System.out.println("1. Add Expenses");
            System.out.println("2. Generate Report");
            System.out.println("3. Save & Exit");
            System.out.print("Your Response: ");
            int choice = scanner.nextInt();

            // consume newline or enter
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    generateReport();
                    break;
                case 3:
                    saveAndExit();
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    public static void addExpense() {
        System.out.println("Enter date: ");
        String date = scanner.nextLine();
        System.out.println("Enter category: ");
        String category = scanner.nextLine();
        System.out.println("Enter description: ");
        String description = scanner.nextLine();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();     // consume new line
    }

    public static void generateReport() {
        System.out.print("Enter category for report (or All): ");
        String category = scanner.nextLine();
        double total = 0;
        System.out.println("\nDate         |  Category  |  Description  |  Amount");
        System.out.println("------------------------------------------------------");

        for (Expense expense : expenses) {
            if (category.equalsIgnoreCase("ALL") || expense.getCategory().equalsIgnoreCase(category)) {
                System.out.println(expense);
                total += expense.getAmount();
            }

            System.out.println("----------------------------------------------------");
        }

        System.out.println("Total Amount: " + total);
    }

    public static void saveAndExit() {
        try {
            FileHandler.saveExpenses(expenses);
            System.out.println("Data saved. GoodBye !");

        } catch (Exception e) {
            System.out.println("Fail to save data.");
            e.printStackTrace();
        }
        System.exit(0);
    }
}
