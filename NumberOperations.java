import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        int length = 0;
        int largest = 0;

        while (temp > 0) {
            int digit = temp % 10;   // Get last digit

            sum += digit;            // Sum of digits
            length++;                // Count digits

            if (digit > largest) {   // Find largest digit
                largest = digit;
            }

            temp = temp / 10;        // Remove last digit
        }

        System.out.println("Sum of digits = " + sum);
        System.out.println("Length of number = " + length);
        System.out.println("Largest digit = " + largest);

        sc.close();
    }
}