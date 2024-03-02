//24. Print all prime numbers from 1 to 5555
public class p24 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 5555:");
        for (int i = 2; i <= 5555; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
