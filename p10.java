//10.WAP to Print grade of students
import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks obtained: ");
        int marks = scanner.nextInt();
        
        char grade;
        
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else if (marks >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
