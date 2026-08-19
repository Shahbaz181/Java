public class binarytodecimal {
    public static void binTodec(int binNum){
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit *(int)Math.pow(2,pow ));

            pow++;
            binNum = binNum/10;
        }

            System.out.println("Decimal of " + mynum+" = " +decNum);
    }

    public static void main(String[] args) {
        binTodec(0);
        binTodec(01);
        binTodec(10);
        binTodec(11);
        binTodec(100);
        binTodec(101);
        binTodec(111);
        binTodec(110);
        binTodec(1000);
        binTodec(1001);
        binTodec(1010);
        binTodec(1011);
    }

    
}

