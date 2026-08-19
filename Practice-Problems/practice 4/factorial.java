import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int fact =1;

        System.out.print("Enter any Positive integer: ");
        num = sc.nextInt(); 
        
        for (int i=1;i<=num;i++){
            fact *= i;
        }

        System.out.println("Factorial of "+num+" is " +fact);

        sc.close();
    }
}


// Output:
// Enter any Positive integer: 6
// Factorial of 6 is 720