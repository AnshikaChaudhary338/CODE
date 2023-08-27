import java.util.*;
public class sum {
public static void main (String args[]) {
Scanner sc=new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
/*  int sum = a+b;
System.out.print(sum);
*/

//program for area of a circle

// int product = a*b;
// System.out.print(product);
/*float r = sc.nextFloat();
float  area = 3.14f * r * r ;
System.out.print(area);
*/

//program for average of the three numbers by input

/*int n = 3;
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int average = a+b+c;
int N = average / n;
System.out.println("Average of the numbers is "+N);*/

float a = sc.nextFloat(); // price of item a
float b = sc.nextFloat(); // price of item b
float c = sc.nextFloat(); // price of item c
float bill =  a + b + c ;
float billwithgst = bill + (float)0.18;
System.out.println(bill);
System.out.println(billwithgst);

}
}
