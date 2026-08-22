// LArgest numbers
// import java.util.*;

public class LN {
    public static int LargestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE;  // -infinity(lowest possible value)
        int smallest = Integer.MAX_VALUE;  // infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest Number is : " +smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5}; 
        System.out.println("Largest Number is : " + LargestNumber(numbers));
    }     
}
