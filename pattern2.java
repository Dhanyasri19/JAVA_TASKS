import java.util.*;

public class pattern2 {
    public static void main(String[] args)
    {
        int ip = 5;
        for (int i = 1;i<=5;i++)
        {
            for(int sp=ip-1;sp>=i;sp--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
