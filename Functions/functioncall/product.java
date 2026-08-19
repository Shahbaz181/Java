package functioncall;
// import java.util.*;
 
// public class product {
//     public static int calculateproduct(int a, int b){
//         int prod = a * b;
//         System.out.println("The Product of " +a+ " and " +b+ " is : " +prod);
//         return prod;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a value : ");
//         int a =sc.nextInt();
//         System.out.print("Enter b value : ");
//         int b = sc.nextInt();

//         calculateproduct(a, b);
//         sc.close();
//     }
// }

public class product {

    public static int multiply(int num1, int num2){
       int prod = num1 * num2;
       return prod;  
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int prod = multiply(a,b);
        System.out.println("a * b = "+prod);
        prod = multiply(5,6);
        System.out.println("a * b = "+prod);

    }
}