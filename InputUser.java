import java.util.Scanner;

public class InputUser {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String scanned = sc.next();
    System.out.println("String" + scanned);

    int in = sc.nextInt();
    System.out.println("Int" + in);

    sc.close();
  }
  
}
