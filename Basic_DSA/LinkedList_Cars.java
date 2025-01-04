package Basic_DSA;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Cars {

    // LinkedList to store cars
    private static LinkedList<String> cars = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("---------- Welcome to Car Showroom ----------");

        // Main loop
        while (running) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add a car
                    addCar(sc);
                    break;

                case 2: // Remove a car
                    removeCar();
                    break;

                case 3: // Display all cars
                    displayCars();
                    break;

                case 4: // Exit
                    running = exitShowroom();
                    break;

                default: // Invalid input
                    System.out.println("Invalid input. Please try again.");
            }
        }

        sc.close();
    }

    // Function to display the menu
    private static void showMenu() {
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Add Car");
        System.out.println("2. Remove Car");
        System.out.println("3. Display Cars");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Function to add a car
    private static void addCar(Scanner sc) {
        System.out.print("Enter car to add: ");
        String car = sc.nextLine();
        cars.add(car);
        System.out.println(car + " added to the list.");
    }

    // Function to remove the last car
    private static void removeCar() {
        if (!cars.isEmpty()) {
            String removedCar = cars.removeLast();
            System.out.println(removedCar + " removed from the list.");
        } else {
            System.out.println("No cars to remove. The list is empty.");
        }
    }

    // Function to display all cars
    private static void displayCars() {
        if (!cars.isEmpty()) {
            System.out.println("Cars in the showroom: " + cars);
        } else {
            System.out.println("No cars in the showroom.");
        }
    }

    // Function to exit the showroom
    private static boolean exitShowroom() {
        System.out.println("Exiting the showroom. Thank you!");
        return false; // Return false to stop the main loop
    }
}








// package Basic_DSA;

// import java.util.LinkedList;
// import java.util.Scanner;

// public class LinkedList_Cars {
//     public static void main(String[] args) {
//         LinkedList<String> cars = new LinkedList<>();
//         Scanner sc = new Scanner(System.in);
//         boolean running = true;

//         System.out.println("---------- Welcome to Car Showroom ----------");

//         while (running) {
//             System.out.println("\nWhat do you want to do?");
//             System.out.println("1. Add Car");
//             System.out.println("2. Remove Car");
//             System.out.println("3. Display Cars");
//             System.out.println("4. Exit");
//             System.out.print("Enter your choice: ");

//             int choice = sc.nextInt();
//             sc.nextLine(); // Consume newline

//             switch (choice) {
//                 case 1: // Add car
//                     System.out.print("Enter car to add: ");
//                     String car = sc.nextLine();
//                     cars.add(car);
//                     System.out.println(car + " added to the list.");
//                     break;

//                 case 2: // Remove last car
//                     if (!cars.isEmpty()) {
//                         String removedCar = cars.removeLast();
//                         System.out.println(removedCar + " removed from the list.");
//                     } else {
//                         System.out.println("No cars to remove. The list is empty.");
//                     }
//                     break;

//                 case 3: // Display cars
//                     if (!cars.isEmpty()) {
//                         System.out.println("Cars in the showroom: " + cars);
//                     } else {
//                         System.out.println("No cars in the showroom.");
//                     }
//                     break;

//                 case 4: // Exit
//                     System.out.println("Exiting the showroom. Thank you!");
//                     running = false;
//                     break;

//                 default: // Invalid input
//                     System.out.println("Invalid input. Please try again.");
//             }
//         }

//         sc.close();
//     }
// }
