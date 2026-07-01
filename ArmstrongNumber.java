import java.util.Scanner;

public class ArmstrongNumber {

    private static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int digits = 0;

        if (temp == 0) {
            digits = 1;
        } else {
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
        }

        int sum = 0;
        temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            sum += power(digit, digits);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}

