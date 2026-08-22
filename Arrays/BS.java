public class BS {
    
    public static int BinarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            //comparision
            if(numbers[mid] == key){ //keyfound
                return mid;
            }
            
            if(numbers[mid] < key){  // right
                start = mid+1;
            }else{
                end = mid-1; //left
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("The key is fount at index : " +BinarySearch(numbers, key));
    }
}
