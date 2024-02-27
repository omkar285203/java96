//7. WAP to accept any character from the keyboard and check that entered character is in upper, lower, digit or special character using ASCII code
import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("The entered character is an alphabet.");
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("The alphabet is in uppercase.");
            } else {
                System.out.println("The alphabet is in lowercase.");
            }
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("The entered character is a digit.");
        } else {
            System.out.println("The entered character is a special character.");
        }

        scanner.close();
    }
}
