//5. WAP Enter three angles & check if it is a triangle
import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three angles of a triangle:");
        System.out.print("Angle 1: ");
        int angle1 = scanner.nextInt();
        System.out.print("Angle 2: ");
        int angle2 = scanner.nextInt();
        System.out.print("Angle 3: ");
        int angle3 = scanner.nextInt();
        
        if (isValidTriangle(angle1, angle2, angle3)) {
            System.out.println("Yes, the angles form a valid triangle.");
        } else {
            System.out.println("No, the angles do not form a valid triangle.");
        }
        
        scanner.close();
    }
    
    public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
        return (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0);
    }
}
