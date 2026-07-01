public class Gcd12_6 {
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
        int a = 12;
        int b = 6;
        System.out.println(gcd(a, b));
    }
}

