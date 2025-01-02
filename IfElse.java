import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int choice = 0;

    while (choice != 5) {
      System.out.println("Choose following operation");
      System.out.println(" 1.Add\n 2.Sub\n 3.Multi\n 4.Div\n 5.Exit\n");
      System.out.print("Your Response: ");
      choice = sc.nextInt();

      if (choice == 5) {
        break;
      }

      System.out.print("Enter 1st number: ");
      int a = sc.nextInt();
      System.out.print("Enter 2nd number: ");
      int b = sc.nextInt();

      System.out.println("\nYour answer is : ");
      if (choice == 1) {
        System.out.println(a + b);
      } else if (choice == 2) {
        System.out.println(a - b);
      } else if (choice == 3) {
        System.out.println(a * b);
      } else if (choice == 4) {
        System.out.println(a / b);
      }
      System.out.println();
    }

    sc.close();

  }

}
