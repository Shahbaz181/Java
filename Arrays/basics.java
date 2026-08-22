import java.util.*;

public class basics { 
    public static void main(String[] args) {
        // int marks[]= new int[50];
        // int numbers[] = {1,2,3};
        // int morenumbers[]={4,5,6};
        // String same[]= {"apple","mango", "orange"};
        arrays();
    }
    
    public static void arrays(){
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

        marks[0] =  sc.nextInt(); //phy
        marks[1] =  sc.nextInt(); //chem
        marks[2] =  sc.nextInt(); //math

        System.out.println("physics : " + marks[0]);
        System.out.println("chemistry : " + marks[1]);
        System.out.println("mathematics : " + marks[2]);

        // marks[2] = 50;
        // System.out.println("mathematics : " + marks[2]);

        // marks[2] = marks[2] + 2;
        // System.out.println("mathematics : " + marks[2]);


        // int percentage = (marks[0] + marks[1] + marks[2])/ 3;
        // System.out.println("Percentage = " + percentage + "%");
        // System.out.println("length of array = " + marks.length);
        
        sc.close();
    }
}