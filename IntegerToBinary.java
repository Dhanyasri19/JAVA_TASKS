import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n == 0) {
            System.out.println(0);
            sc.close();
            return;
        }

        boolean neg = n < 0;
        if (neg) n = -n;

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }

        if (neg) {
            System.out.print("-");
        }
        System.out.println(sb.reverse().toString());

        sc.close();
    }
}

