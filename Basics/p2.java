public class p2{
    public static void main(String args[]){
        int[]arr ={3,6,9,12};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0 && i%2==0){
                sum+=arr[i];
            }
                
        }
        System.out.println(sum);

    }
}