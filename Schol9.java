import java.util.*;
public class Schol9 {
    public static void main(String[] args) {

    String s = "Hello";


        for (int i = 0; i <= s.length(); i++) {
            
            String s1 = s.substring(0, i);
            System.out.println(s1);
        }
    System.out.println();
    //remove vowels
    String s1 = s.replaceAll("[AEIOUaeiou]"," ");
    System.out.println(s);

    System.out.println(s1);
}
}

