import java.util.*;

public class passorfail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();

        String result = marks>= 33 ? "Pass" : "Fail";
        System.out.println("You are " + result);

        
        sc.close();
    }

}