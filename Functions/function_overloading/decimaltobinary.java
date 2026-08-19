public class decimaltobinary {
    public static void decTobin(int n){
        int mynum = n;
        int pow = 0;
        int bin = 0;

        while (n> 0) {
            int rem = n%2; //remainder
            bin = bin + (rem * (int)Math.pow(10,pow ));
            pow++;
            n = n/2; //quotient
        }

            System.out.println("Binary number of " + mynum +" = " +bin);
    }

    public static void main(String[] args) {
        decTobin(2);
    }
}
