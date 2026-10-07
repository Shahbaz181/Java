public class Counting_sort {

    public static void countingsort(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingsort(nums);
        printArr(nums);
    }
}

// The exact time complexity of the corrected algorithm is O(N+K) and the
// exact space complexity is O(K),
// where N is the number of elements in the array and K is the maximum value in
// the array.

// For your specific input array {1, 4, 1, 3, 2, 4, 3, 7}:
// • Exact Time Taken: The algorithm performs roughly 24 principal operations
// (N + N + K + N, where N = 8 and K = 7).
// • Exact Space Used: The algorithm allocates exactly 8 integers of extra
// memory for the count array (indices 0 to 7).