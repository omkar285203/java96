//1. WAP to Check number is less than 20
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number < 20) {
            System.out.println("The number is less than 20.");
        } else {
            System.out.println("The number is not less than 20.");
        }
        
        scanner.close();
    }
}
