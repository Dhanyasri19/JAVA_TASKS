public class Gcd56_98 {
    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        System.out.println(gcd(a, b));
    }
}

