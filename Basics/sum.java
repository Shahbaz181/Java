import java.util.*;

public class sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n = sc.nextInt();
        System.out.println("The First number is : "+ n);
        System.out.print("Enter the Second number: ");
        int m = sc.nextInt();
        System.out.println("The  Second number is  :"+ m);
        
        int sum = n+m;
        System.out.println("Sum of n and m : " + sum);



        sc.close();
    }
}