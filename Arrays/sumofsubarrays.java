public class sumofsubarrays {
    public static void printSubarraySums(int numbers[]) {
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0; 

                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k]; // Add element to sum
                }
            
                System.out.println(" = " + sum); 
                total++;
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + total);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarraySums(numbers);
    }
}


// time complexity O(n^3) and space complexity O(1)