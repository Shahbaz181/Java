import java.util.*;

public class ternary{
    public static void main (String args[]){

        //ternary operator
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String type =(num%2 == 0) ? "even" : "odd";
        System.out.println("The number is " + type);


    sc.close();
    }
}