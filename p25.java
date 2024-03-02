//25. Print all armstrong numbers from 1 to 10000
public class p25 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 10000:");
        for (int i = 1; i <= 10000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int digits = 0;
        int result = 0;

        while (originalNumber != 0) {
            originalNumber /= 10;
            digits++;
        }

        originalNumber = num;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += Math.pow(digit, digits);
            originalNumber /= 10;
        }

        return num == result;
    }
}
