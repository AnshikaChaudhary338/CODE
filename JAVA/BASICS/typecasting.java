//    TYPE CASTING
//a) Widening type casting / casting down / implicit type casting.
//         (automatically) - converting a smaller type to a larger type size
//     byte -> short -> char -> int -> long -> float -> double 

/*  public class typecasting
{  
public static void main(String[] args)  
{  
int x = 7;  
//automatically converts the integer type into long type  
long y = x;  
//automatically converts the long type into float type  
float z = y;  
System.out.println("Before conversion, int value "+x);  
System.out.println("After conversion, long value "+y);  
System.out.println("After conversion, float value "+z);  
}  
}  
*/
//b). Narrowing type casting / casting up / explicit type casting.
//(manually) - converting a larger type to a smaller size type
//            double -> float -> long -> int -> char -> short -> byte  

public class typecasting {
public static void main (String args[]) {
long x = 40009;
//converting the long data type to float data type 
float  f  = (float)x;
//converting float data type to int data type 
int i = (int )f;
System.out.println("value of long data type given is "+x);   
System.out.println("converted value of long dtype to float "+f) ;
System.out.println("value of float dtype to int "+i);
}
}
