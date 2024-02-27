//19.WAP to perform Sum of first n even numbers
import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            int evenNumber = 2 * i;
            sum += evenNumber;
        }
        
        System.out.println("Sum of the first " + n + " even numbers: " + sum);
        
        scanner.close();
    }
}
