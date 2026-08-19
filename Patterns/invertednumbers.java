import java.util.Scanner;

public class invertednumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        // int n = 4;
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();

    }
}


// output
// Enter the number : 5
// 12345
// 1234
// 123
// 12
// 1
