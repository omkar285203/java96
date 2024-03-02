//23. WAP to Calculate sum of Fibonacci series
import java.util.Scanner;

public class p23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int sum = fibonacciSum(n);
        System.out.println("Sum of Fibonacci series up to " + n + " terms: " + sum);

        scanner.close();
    }

    public static int fibonacciSum(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int sum = 1;
            int prev = 1;
            int current = 1;

            for (int i = 2; i < n; i++) {
                int next = prev + current;
                sum += next;
                prev = current;
                current = next;
            }

            return sum;
        }
    }
}
