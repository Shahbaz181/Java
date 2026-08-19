import java.util.Scanner;

public class nnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        
        System.out.println("The first " + n + " numbers are:");
        // Loop from 1 to N and print each number
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();
        
        // Close the scanner
        // sc.close();
    }
}