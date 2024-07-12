package JAVA.PRACTICE;

import javax.swing.event.SwingPropertyChangeSupport;

public class jjjj {
    public static void BinToDec(int B) {
        
        int pow = 0;
        int dec = 0;

        while( B > 0){
            
        int lastdigit = B%10;
        dec = dec + ( lastdigit * (int )Math.pow(2, pow));
        pow++;
        B = B/10;
        }
        System.out.println( dec);
    }
    

    public static void main(String[] args) {
       BinToDec(10010);
    }

}
