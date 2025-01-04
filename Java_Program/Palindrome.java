package Java_Program;

public class Palindrome {
    public static void main(String[] args) {
        int number = 121; // Example number
        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

    private static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        } else {
            return reverse(n / 10, rev * 10 + n % 10);
        }
    }
}