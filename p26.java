//26.Print all palindrome numbers from 1 to 9999
public class p26 {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers between 1 and 9999:");
        for (int i = 1; i <= 9999; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return originalNumber == reverse;
    }
}
