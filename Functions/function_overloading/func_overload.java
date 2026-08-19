public class func_overload {
    // function to calculate sum of 2 numbers
    public static int sum (int a ,int b){
        return a+b;
    }
    // function to calculate sum of 3 numbers
     
    public static int sum(int a ,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println(sum(2, 04));
        System.out.println(sum(2, 2, 2));
    }

}
