import java.util.*;
public class Schol8 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr [][] = new int [n][n];
        for(int i = 0 ;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j && arr[i][j] != 0)
                {
                   System.out.println("not diagonal matrix");
                   return;
                }
                
                }
            }
            System.out.println("Diagonal matrix");
        }
        

    }
    
