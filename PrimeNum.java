import java.util.Scanner;

public class PrimeNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = sc.nextInt();

    int x = 2;
    while (x<num) {

      if (num%x != 0) {
        System.out.println("Prime");  
        break;      
      } else {
        System.out.println("not Prime");
      }

      x++;
    }

    sc.close();
    
  }
  
}
