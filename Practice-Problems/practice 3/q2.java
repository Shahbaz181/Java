import java.util.*;

public class q2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your temperature : ");
        double temp = sc.nextDouble();
        if(temp > 100.0){
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
        sc.close();
    }
}