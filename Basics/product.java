import java.util.*;

public class product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("The First number is : "  + a);
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.println("The  Second number is  :" + b);
        
        int prod = a*b;
        System.out.println("Product  of a and b : "  + prod);

        sc.close();
    }
}