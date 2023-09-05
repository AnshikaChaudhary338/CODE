import java.util.*;
public class Whileloop {
public static void main (String ags[]) {

    // PROGRAM : TO PRINT NUMBER FROM 1 TO 10.

 /* int counter = 1;
while (counter <= 10) {
    System.out.println(counter +" ");
    counter++;
}
System.out.println( ); */

// PROGRAM : TO PRINT NUMBER 1 TO N.

Scanner sc = new Scanner(System.in);
int range = sc.nextInt();
int counter = 1;

while (counter <= range) {
    System.out.println(counter + " ");
    counter ++;
}
System.out.println( );

}
    
}
