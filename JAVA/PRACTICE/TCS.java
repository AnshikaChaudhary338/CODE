package JAVA.PRACTICE;

import java.util.Scanner;

public class TCS {
    public static void main(String[] args) {
        System.out.println(" Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        if( n % 9 == 0){
            System.out.println("Is divisible by 9");
        }
        else{
            System.out.println("Not divisible by 9");
        }

}
}

