package Java_Program;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int result = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + result);
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
}