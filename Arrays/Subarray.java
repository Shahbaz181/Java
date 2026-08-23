//subarray = a contiguous part of array (2,4,8) yes , (2, 4, 8) not a subarray
public class Subarray {

    public static void printsubarray(int numbers[]){
        int total = 0;
        for(int i=0; i<numbers.length; i++){
            int start =  i;  //numbers[i];
            for (int j=i;j<numbers.length;j++){
                int end = j;    // numbers[j];
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+ " ");
                }
                System.out.println();
                total++;
            }
            System.out.println();
        }
            System.out.println("Total subarrays = "+total);

    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printsubarray(numbers);
    }
}


// time complexicity O(n^2) 
