package JAVA.PRACTICE;

import java.util.Scanner;

public class Question {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income:");
        int income = sc.nextInt();
        int tax = 0;

        if( income < 500000) {
            System.out.println( " No tax " );
            tax = 0;
        }
        else if ( income <= 100000) {
            System.out.println(" 20 % tax " );
            tax =  (int )(income * 0.2);
        }
        else {
            tax = (int )(income * 0.3);
        }

        //float pencil = sc.nextFloat();
       // System.out.println("Enter the cost of pen :");
       // float pen = sc.nextFloat();
       // System.out.println("Enter the cost of eraser :");
       // float eraser = sc.nextFloat();

       // float total = pencil + pen + eraser ;
         
       // float bill = total + ( 0.18f * total);
     //  int side = sc.nextInt();
      // int area = side*side;
      // int b = sc.nextInt();
      // int c = sc.nextInt();
      // int average = a+b+c / 3;
       System.out.println(" your tax: " + tax);
        
        }

    }


