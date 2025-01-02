package Java_Program;
import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    
    int i = 1;
    int sum = 0;

    while(i != 0) {
      i = sc.nextInt();
      sum += i;
      System.out.println("Sum is " + sum);

    }

    System.out.println("Thank You");

    sc.close();

  }
  
}
