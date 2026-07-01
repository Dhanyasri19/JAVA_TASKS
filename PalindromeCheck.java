import java.util.*;

public class PalindromeCheck {
    private static boolean isPalindrome(int n) {
        if (n < 0) return false;
        int original = n;
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return original == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
    }
}

