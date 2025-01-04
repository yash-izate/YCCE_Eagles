package Java_Program;

public class SumSeries {
    public static void main(String[] args) {
        int number = 10; // Example number
        int result = sum(number);
        System.out.println("Sum of integers up to " + number + " is: " + result);
    }

    public static int sum(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }
}