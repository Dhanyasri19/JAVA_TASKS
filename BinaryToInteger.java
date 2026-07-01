import java.util.Scanner;

public class BinaryToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().trim();

        long value = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '1') {
                // invalid character; ignore and continue
                continue;
            }
            value = value * 2 + (c - '0');
        }

        System.out.println(value);
        sc.close();
    }
}

