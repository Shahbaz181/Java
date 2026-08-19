import java.util.Scanner;

public class eventestmethod {
    public static boolean isEven(int a){
        if(a%2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter an Integer : ");
        num =sc.nextInt();

        if(isEven(num)){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
        sc.close();

    }
}
