import java.util.*;

public class multiple {
     public static void main (String[] args){
       Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter a number : ");
            int n = input.nextInt();

            if(n %10 ==0){
                System.out.println(+n + " Number is multiple of 10");
                break;
            }
        } while(true);
        input.close();
    }
}
