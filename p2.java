//2. WAP to check entered year is a leap year or not using nested if else
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year and a century leap year.");
                } else {
                    System.out.println(year + " is a leap year but not a century leap year.");
                }
            } else {
                System.out.println(year + " is a leap year and not a century leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        scanner.close();
    }
}
