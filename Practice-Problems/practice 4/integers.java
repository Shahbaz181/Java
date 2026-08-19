import java.util.Scanner;

public class integers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       int num ;
       int count;
       int evensum = 0;
       int oddsum = 0;

       do {
        System.out.print("Enter the number: ");
        num =sc.nextInt();


        if(num%2==0){
            evensum+= num;
        }else{
            oddsum+= num;
        }


        System.out.println("Do you want to continue? Press 1 for yes or 0 for no");

        count = sc.nextInt();
       } while (count == 1);

       System.out.println("Sum of even numbers: "+evensum);
       System.out.println("Sum of odd numbers: "+oddsum);
       sc.close();
    }
}


// output:
// Enter the number: 12
// Do you want to continue? Press 1 for yes or 0 for no
// 1
// Enter the number: 5
// Do you want to continue? Press 1 for yes or 0 for no
// 1
// Enter the number: 3
// Do you want to continue? Press 1 for yes or 0 for no
// 0
// Sum of even numbers: 12
// Sum of odd numbers: 8