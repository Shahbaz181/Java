import java.util.*;

// public class area{
//     public static void main(String args[]){
//         Scanner user = new Scanner(System.in);
//         // System.out.print("Enter the radius value:");
//         int r = user.nextInt();
//         System.out.println("The radius value is : " + r);

//         double pi = 3.14;
//         double aoc = pi*r*r;
//         System.out.println("Area of a circle is : " + aoc);
//         }
// }


        public class area{
            public static void main (String args[]){
                 Scanner sc = new Scanner(System.in);
                 float r = sc.nextInt();
                 float area = 3.14f * r * r;
                 System.out.println(area);

                 sc.close();
    }
}