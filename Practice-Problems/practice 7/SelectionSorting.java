public class SelectionSorting {

    public static void selectionsort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int minpos = turn;
            for (int j = turn + 1; j < arr.length; j++) {
                if (arr[minpos] < arr[j]) {
                    minpos = j;
                }
            }
            // swap
            int temp = arr[turn];
            arr[turn] = arr[minpos];
            arr[minpos] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selectionsort(arr);
        printArr(arr);
    }
}