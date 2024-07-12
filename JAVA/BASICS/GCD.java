import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int rem;
        System.out.println("Enter your first number");
        num1 = sc.nextInt();
        System.out.println("Enter your SECOND number");
        num2 = sc.nextInt();
        // METHOD 1
        // while(num1%num2!=0){
        // rem = num1%num2;
        // num1=num2;
        // num2=rem;
        // }
        // System.out.println(" GCD of the numbers is "+ num2);

        // METHOD 2
        int n = Math.min(num1, num2);
        int gcd = 1;

        for (int i = 2; i <= n; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(" Gcd of two numbers is " + gcd);

    }
}
