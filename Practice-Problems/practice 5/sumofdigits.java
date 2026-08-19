import java.util.*;

public class sumofdigits {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Input an Integer : ");
    int digits = sc.nextInt();
    System.out.println("The sum is " + sumDigits(digits));
    sc.close();
    }


    public static int sumDigits(int n){
        int sumofDigits = 0;
        while (n>0) {
            int lastdigit = n%10;
            sumofDigits += lastdigit;
            n /= 10;
        }
        return sumofDigits;
    }
}
