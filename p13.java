//13.WAP to Check if student scored distinction
import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's percentage: ");
        double percentage = scanner.nextDouble();

        if (percentage >= 80) {
            System.out.println("Congratulations! The student scored a distinction.");
        } else {
            System.out.println("The student did not score a distinction.");
        }

        scanner.close();
    }
}
