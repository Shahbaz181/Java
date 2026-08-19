import java.util.*;

public class avgofthreeno {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        double x= sc.nextDouble();

        System.out.print("Enter second integer : ");
        double y= sc.nextDouble();

        System.out.print("Enter third integer : ");
        double z= sc.nextDouble();

        System.out.print("The average value is " +(int)avg(x,y,z)+"\n");
        sc.close();
    }

    public static double avg( double x, double y,double z){
        return (x+y+z)/3;
    }
}
