public class halfpyramid {
    public static void main(String[] args) {
        int n=5;
        for (int line=1; line <=n; line++){
            for(int number=1; number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}


// output
// 1
// 12
// 123
// 1234
// 12345