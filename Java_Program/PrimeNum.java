package Java_Program;
import java.util.Scanner;

public class PrimeNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int i = 2;
    boolean flag = false;

    while (i < num) {

      if (num % i == 0) {
        flag = true;
        break;
      }
      i++;
    }

    if (flag == false) {
      System.out.println("Prime");
    } else {
      System.out.println("not Prime");
    }
    sc.close();
  }
}
