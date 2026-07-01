import java.util.*;

public class CountFactors {
    private static int countDivisors(int n) {
        if (n <= 0) return 0;
        int count = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int d = 1; d <= sqrt; d++) {
            if (n % d == 0) {
                int other = n / d;
                if (d == other) count++; // perfect square
                else count += 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDivisors(n));
        sc.close();
    }
}

