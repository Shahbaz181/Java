public class characters {
    public static void main(String[] args) {
        
        int n = 5;
        char ch ='A';
        for(int i=1; i<=n; i++){
            //innerloop
            for(int chars=1; chars<=i;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}



// output
// A
// BC
// DEF
// GHIJ
// KLMNO