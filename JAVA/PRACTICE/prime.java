package JAVA.PRACTICE;

public class prime {
    public static boolean isPrime (int n){
       // boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
               // isPrime = false;
               // break;
               return false;
            }
        }
       // return isPrime;
       return true;
    }
    public static void isPrimeRange(int n) {
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
        System.out.println();

        
    }
    public static void main(String[] args) {
       isPrimeRange(20);
    }
    
}
