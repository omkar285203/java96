// 21.WAP to accept 5 paper marks from user and find total marks & percentage and
// check if percentage greater than 60 and gender is male then
// print msg: you are eligible for admission.
// check if percentage greater than 80 and gender is female then
// print msg: you are eligible for admission.
import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        
        System.out.println("Enter marks for 5 papers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for paper " + (i + 1) + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        
        double percentage = ((double)totalMarks / (5 * 100)) * 100;
        
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        
        System.out.print("Enter your gender (male/female): ");
        String gender = scanner.next();
        
        if (percentage > 60 && gender.equalsIgnoreCase("male")) {
            System.out.println("Congratulations! You are eligible for admission.");
        } else if (percentage > 80 && gender.equalsIgnoreCase("female")) {
            System.out.println("Congratulations! You are eligible for admission.");
        } else {
            System.out.println("Sorry, you are not eligible for admission.");
        }
        
        scanner.close();
    }
}
