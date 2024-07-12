package JAVA.PRACTICE;
 
import  java.util.*;

public class sort {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
int num1 = 6;
int num2 = 6;
int num3 = 4;
int num4 = 5;
  if ( ( num1 > num2 ) && ( num1 > num3 ) && ( num1 > num4)) {
    System.out.println(num1);
  }
   else if ( ( num2 > num3 ) && ( num2 > num4 ) ) {
    System.out.println(num2);
  }
   else  if  ( num3 > num4 ) {
    System.out.println(num3);
  }
  else {
    System.out.println(num4);
  }

    }
    
}
