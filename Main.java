import java.util.*;
public class Main {
    public static void main(String[] args) {
      int arr[][] = {
        {1,2,3},  // 00 01 02
        {4,5,6},  // 10 11 12
        {7,8,9}   // 20 21 22
      };
      // 7 8 9    20 21 22
      // 4 5 6    10 11 12
      // 1 2 3    00 01 02
      
      for(int i=arr.length-1;i>=0;i--){
        for(int j=arr.length-1;j>=0;j--){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println();
      for(int i=0;i<arr.length;i++){
        for(int j=arr.length-1;j>=0;j--){
          System.out.print(arr[j][i]+" ");
        }
        System.out.println();
      }
      System.out.println();
      for(int i=0;i<arr.length;i++){
        for(int j=arr.length-1;j>=0;j--){
          System.out.print(arr[j][i]+" ");
        }
        System.out.println();
      }
      System.out.println();
      for(int i=arr.length-1;i>=0;i--){
        for(int j=arr.length-1;j>=0;j--){
          System.out.print(arr[j][i]+" ");
        }
        System.out.println();
      }
    }
}