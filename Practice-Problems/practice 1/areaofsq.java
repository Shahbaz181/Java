import java.util.*;

public class areaofsq{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the square: ");
        int length = sc.nextInt();
        System.out.println("The length of the square is : " + length);
        
        int area = length * length;
        System.out.println("Area of the square is : " + area);

        sc.close();
    }
}