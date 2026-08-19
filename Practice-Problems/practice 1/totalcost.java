import java.util.*;

public class totalcost {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       float pen = sc.nextFloat();
       float pencil = sc.nextFloat();   
       float eraser = sc.nextFloat();
       float total = (float)(pen + pencil + eraser);
       System.out.println("Total cost of items is: " + total); 

       sc.close();
    }
}