package ExpenseManager;

import java.io.Serializable;

public class Expense implements Serializable {
    private String date;
    private String category;
    private String description;
    private double amount;

    public Expense(String date, String category, String description, double amount) {
        this.date = date;
        this.category = category;
        this.description = description;
        this.amount = amount;

    }

    //  to fetch the value of each field
    public String getDate() { return date; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public double getAmount() {return amount; }
    public String toString() {return date + " | " + category + " | " + description + " | " + amount;}
 
}
