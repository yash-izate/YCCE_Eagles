import java.util.Scanner;

public class Problem2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the no. of test cases: ");
    int cases = sc.nextInt(); 

    System.out.println("Enter marks of Dragon (DSA-TOC-DM): ");
    int d1 = sc.nextInt();
    int d2 = sc.nextInt();
    int d3 = sc.nextInt();

    System.out.println("Enter marks of Sloth (DSA-TOC-DM): ");
    int s1 = sc.nextInt();
    int s2 = sc.nextInt();
    int s3 = sc.nextInt();

    int tot_D = d1 + d2 + d3;
    int tot_S = s1 + s2 + s3;

    if (tot_D < tot_S) {
      System.out.println("Sloth");
    } else if (tot_S < tot_D) {
      System.out.println("Dragon");
    } else if (tot_S == tot_D) {

      if (d1 < s1) {
        System.out.println("Sloth");
      } else if (s1 < d1) {
        System.out.println("Dragon");
      } else if (s1 == d1) {

        if (d2 < s2) {
          System.out.println("Sloth");

        } else if (s2 < d2) {
          System.out.println("Dragon");
        } else if (s2 == d2) {

          if (d3 < s3) {
            System.out.println("Sloth");
          } else if (s3 < d3) {
            System.out.println("Dragon");
          } else if (s3 == d3) {
            System.out.println("Tie");
          }
        }
      }
    }

    sc.close();
  }
}
