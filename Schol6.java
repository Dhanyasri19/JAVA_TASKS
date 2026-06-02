import java.util.*;

public class Schol6 {
    public static void main(String[] args) {
        String s = "abcda";
        int len = s.length();
        int start = 0, end = len - 1;
        boolean ispal = true;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                ispal = false;
                break; 
            }
            start++;
            end--;
        }

        if (ispal) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
