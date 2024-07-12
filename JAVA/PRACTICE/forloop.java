package JAVA.PRACTICE;

import java.util.*;

public class forloop {
    public static void main(String[] args) {
    // for(int i =1; i <=10 ; i++) {
     //   System.out.println("anshika");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number:");
     int n = sc.nextInt();
     //while(n >0){
    // int lastdigit = n%10;
    // System.out.print(lastdigit);
     // n = n/10;
     int rev =0 ;
     while ( n > 0) {
        int lastdigit = n%10;
         rev = (rev * 10) + lastdigit;
         n = n/10;
     }
     System.out.println(rev);
     }

    }
    
    

