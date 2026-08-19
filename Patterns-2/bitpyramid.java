public class bitpyramid{
    public static void zero_one_trinangle(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zero_one_trinangle(4);
    }
}

// output
// 1
// 01
// 101
// 0101
// 10101