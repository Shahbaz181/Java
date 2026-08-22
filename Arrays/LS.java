// Linear Search by using array
public class LS {
    public static int LinearSearch(int numbers[], int key){
        
            for(int i=0;i<numbers.length;i++){
                if(numbers[i] == key){
                // System.out.println("key is at index : " + i);
                    return i;
                }
            }
        return -1;
    }

    public static int LinearSearch(String menu[],String value){

            for(int n=0;n<menu.length;n++){
                if(menu[n].equals(value)){
                    return n;
                }
            }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        String menu[] = {"burger","pizza", "sandwich", "hotdog"};
        String value = "hotdog";

        int index = LinearSearch(numbers, key);
        if(index == -1){
            System.out.println("NOT Found");
        }else{
        System.out.println("key is at index : " + index);
        }

        int size = LinearSearch(menu,value);
        if(size == -1){
            System.out.println("NOT Found");
        }else{
        System.out.println("Menu item is at index : " + size);
        }
    }
}


// time complexicity of linear search is O(n) 
// time complexicity is directly proportional to loops