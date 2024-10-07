package JAVA.RECURSION;

public class sumOfFirstNatural {
    public static int calSum(int n){
        if( n==1){
            return 1;
        }
        int sumn1 = calSum(n-1);
        int sum = n + sumn1;
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(calSum(n));
    }
    
}
