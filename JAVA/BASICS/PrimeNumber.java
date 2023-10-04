public class PrimeNumber {
    public static boolean Prime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }

        }
        return true;
    }
   // public static void main(String[] args) {
     //   System.out.println(Prime(25));

     //Primes In Range 

     public static void PrimeInRange (int n )  {
        for (int i=2; i <= n; i++) {
            if(Prime(i)) {
                System.out.print(i +" ");
            }
        }
        System.out.println();
     }
     public static void main(String[] args) {
        PrimeInRange(100);
     }
    }
    

