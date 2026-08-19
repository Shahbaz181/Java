import java.util.Scanner;

// public class typeconversion{
    // public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextFloat();
//         System.out.println(number);
    // }
// }

// output: PS C:\Users\Syed shahbaz\Desktop\JAVA\src> javac typeconversion.java
// typeconversion.java:6: error: incompatible types: possible lossy conversion from float to int
        // int number = sc.nextFloat();
//                                  ^
// 1 error

// public class typeconversion{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        // float number = sc.nextInt();
        // System.out.println(number);
        // float a = 10.5f;
        // int b = (int) a;
        // System.out.println(b);
//     }
// }


public class typeconversion{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       char a = 'a';
       char b= 'b';
       
       System.out.println(b-a);
       sc.close();
    }
}