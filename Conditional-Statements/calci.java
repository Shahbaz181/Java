import java.util.*;

public class calci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /) : ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println("The sum is : " + (a+b));
                break;
            case '-': System.out.println("The difference is : " + (a-b));
                break;
            case '*': System.out.println("The product is : " + (a*b));
                break;
            case '/': System.out.println("The quotient is : " + (a/b));
                break;
            case '%': System.out.println("The remainder is : " + (a%b));
                break;

            default:
                System.out.println("Invalid operator.");
        }
        sc.close();
    }
}