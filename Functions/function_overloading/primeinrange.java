public class primeinrange {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
         if(n%i == 0 ){
            return false;
         }   
        }
        return true;
    }


    public static void primerange(int n){
        for (int i=2; i<=n; i++){
            if(isPrime(i)) {//true
            System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primerange(55); //2 to 55  
        // output: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53
    }
    
} 
