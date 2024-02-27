//6. WAP to accept 5 paper marks from user and find total marks & percentage
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int[] marks = new int[5];
        
        System.out.println("Enter marks for 5 papers:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for paper " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        double percentage = ((double)totalMarks / (5 * 100)) * 100;
        
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        
        scanner.close();
    }
}
