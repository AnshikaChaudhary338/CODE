package JAVA.PRACTICE;

import  java.util.*;

public class rev {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int org = n;
        int rev = 0;
        while ( n >0){

         int lastdigit = n%10;

            rev = (rev * 10) + lastdigit;
        //System.out.print(lastdigit);
        n= n/10;
        }
        
       // System.out.println(rev);
        if ( rev == org ) {
            System.out.println(" The number is p");
        }
        else {
            System.out.println(" no");
        }
    }
}

