package JAVA.RECURSION;

public class FriendPairingProblem {
    public static int friendPair(int n){
        if( n==1 || n==2){
            return n;
        }
        // choice 
        //single
        int fnm1 = friendPair(n-1);

        //pair 
        int fnm2 = friendPair(n-2);
        int pairWays = (n-1)* fnm2;

        //total ways
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
       System.out.println(friendPair(3));;
    }
    
}
