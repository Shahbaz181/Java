import java.util.*;
public class exact{
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            if(n %10 == 0){
                System.out.println("*");
                continue;
            }
            sc.close();
        } while(true);
        
    }
}
