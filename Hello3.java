import java.util.*;
public class Hello3{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                   
        String result = Integer.toString(n); // Convert int to String
        
        System.out.println(result.length());          
    }
}