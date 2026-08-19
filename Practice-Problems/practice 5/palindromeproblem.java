import java.util.*;

public class palindromeproblem {

    public static boolean isPalindrome(int num){
        int palindrome = num;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
            if(num == reverse){
                return true;
            }
        return false;
    }
    
    public static void main(String[] args) {

        System.out.print("Enter a Palindrome Integer : ");
        Scanner sc = new Scanner(System.in);
       
        int palindrome = sc.nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Number : " +palindrome+ " is Palindrome");
        }else{
            System.out.println("Number : " +palindrome+ " is not Palindrome");
        }

        sc.close();
    }
}
