package JAVA.RECURSION;

public class PowerX {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    //This is optimized Method

    
    public static int optimizedPower( int x,int n){
        if( n==0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        //if n is odd

        if( n % 2 != 0){
           halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(2, 10));
        System.out.println(optimizedPower(2, 5));
    }

}
