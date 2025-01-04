package Basic_DSA;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Cars {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("---------- Welcome to Car Showroom ----------");

        while (running) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Add Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Display Cars");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add car
                    System.out.print("Enter car to add: ");
                    String car = sc.nextLine();
                    cars.add(car);
                    System.out.println(car + " added to the list.");
                    break;

                case 2: // Remove last car
                    if (!cars.isEmpty()) {
                        String removedCar = cars.removeLast();
                        System.out.println(removedCar + " removed from the list.");
                    } else {
                        System.out.println("No cars to remove. The list is empty.");
                    }
                    break;

                case 3: // Display cars
                    if (!cars.isEmpty()) {
                        System.out.println("Cars in the showroom: " + cars);
                    } else {
                        System.out.println("No cars in the showroom.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting the showroom. Thank you!");
                    running = false;
                    break;

                default: // Invalid input
                    System.out.println("Invalid input. Please try again.");
            }
        }

        sc.close();
    }
}
