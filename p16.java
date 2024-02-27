//16.WAP to check weekend or holiday, Read a day from user
import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the day (1 for Sunday, 2 for Monday, ..., 7 for Saturday): ");
        int day = scanner.nextInt();

        if (day == 1 || day == 7) {
            System.out.println("It's a weekend.");
        } else {
            System.out.println("It's a weekday.");
        }

        scanner.close();
    }
}
