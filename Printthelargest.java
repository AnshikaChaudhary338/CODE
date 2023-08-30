import java.util.Scanner;

public class Printthelargest {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();
 
//int A = 5, B = 7, C = 10 ;

if ( A>=B && A>=C) {
System.out.print("A is largest");
}
else if ( B >= C) {
System.out.print("B is the largest");
}
else  {
System.out.print("C is largest");
}
}   
}
