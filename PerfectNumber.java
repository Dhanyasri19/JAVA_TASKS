import java.util.*;

public class PerfectNumber {
    private static int sumOfProperDivisors(int n) {
        if (n <= 1) return 0;

        int sum = 1; // 1 is a proper divisor for n > 1
        int sqrt = (int) Math.sqrt(n);

        for (int d = 2; d <= sqrt; d++) {
            if (n % d == 0) {
                int other = n / d;

                sum += d;
                if (other != d && other != n) {
                    sum += other;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = sumOfProperDivisors(n);
        System.out.println(sum == n);

        sc.close();
    }
}

