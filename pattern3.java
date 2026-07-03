import java.util.*;
import java.lang.*;

public class pattern3 {
    public static void main(String[] args)
    {
        int ip = 5;
        for (int i = 1;i<=5;i++)
        {
            for(int sp=1;sp<i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
