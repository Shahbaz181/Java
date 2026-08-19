import java.util.*;
class multitable{

    public static void printmultitable(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + " * " +i+ " = " + n*i);
        }
        sc.close();
    }
    public static void main(String s[]) {
        printmultitable(5);

    }
}

// Output:
// Enter number:5
// 5 * 1 = 5
// 5 * 2 = 10
// 5 * 3 = 15
// 5 * 4 = 20
// 5 * 5 = 25
// 5 * 6 = 30
// 5 * 7 = 35
// 5 * 8 = 40
// 5 * 9 = 45
// 5 * 10 = 50