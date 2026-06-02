import java.util.*;

public class Hello2{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a,b,c,d;
      a = n%10;
      b = n/10;
      c = b%10;
      d = b/10;
      int sum = a+c+d;
      System.out.println("the sum is : " + sum);
         }
}