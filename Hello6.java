import java.util.*;
public class Hello6{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
int largest = 0 ;      
while(n>0){
int digit = n% 10; // extract last digit
            if (digit > largest) {
                largest = digit;
            }
            n /= 10; // remove last digit
        } 
System.out.println("largest digit:"+ largest);          
       
}
}