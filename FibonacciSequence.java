import java.util.*;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            // print nothing
            sc.close();
            return;
        }

        int a = 0, b = 1;
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i > 0) out.append(' ');
            if (i == 0) {
                out.append(0);
            } else if (i == 1) {
                out.append(1);
            } else {
                int c = a + b;
                out.append(c);
                a = b;
                b = c;
            }
        }

        System.out.println(out.toString());
        sc.close();
    }
}


