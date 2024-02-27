//11.WAP to accept basic salary 20000/- and daily allowance, traveling allowance, house rent and Print gross salary of employee
import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        final double BASIC_SALARY = 20000.0;
        double dailyAllowance, travelingAllowance, houseRent;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Daily Allowance: ");
        dailyAllowance = scanner.nextDouble();
        
        System.out.print("Enter Traveling Allowance: ");
        travelingAllowance = scanner.nextDouble();
        
        System.out.print("Enter House Rent: ");
        houseRent = scanner.nextDouble();
        
        double grossSalary = BASIC_SALARY + dailyAllowance + travelingAllowance + houseRent;
        
        System.out.println("Gross Salary: " + grossSalary);
        
        scanner.close();
    }
}
