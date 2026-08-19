import java.util.*;

public class avg

 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();   
        System.out.println("The First number is : " + a);
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.println("The  Second number is  :" + b);
        System.out.print("Enter the Third number: ");
        int c = sc.nextInt();
        System.out.println("The Third number is : " + c);
        double avg = (double)(a+b+c)/3;
        System.out.println("Average of a, b and c is : " + avg);
        sc.close();
    }
}