package Java_Program;
import java.util.Scanner;

public class StringArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] names = new String[5];

    for (int i = 0; i < names.length; i++) {
      System.out.println("Input: ");
      String input = sc.nextLine();
      names[i] = input;
    }

    System.out.println();

    int counter = 0;
    for (String name : names) {
      System.out.println(counter + " : " + name);
      counter++;
    }

    sc.close();
  }

}
