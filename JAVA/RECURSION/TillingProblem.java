package JAVA.RECURSION;

public class TillingProblem {
    public static int TillingProblem1(int n){ // 2*n (floor size)
        //base case
        if( n==0 || n==1){
            return 1;
        }
        // vertical choice 
        int fnm1 = TillingProblem1(n-1);
        //horizontal choice
        int fnm2 = TillingProblem1(n-2);

        //total ways 
        int totalWays = fnm1 + fnm2;
        return totalWays;

    }
    public static void main(String[] args) {
       System.out.println(TillingProblem1(3)); 
    }
    
}
