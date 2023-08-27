//java automatically promotes each byte,short or char as int when evaluating a expression. 
//if operand is long,float and double the whole expression converted to long, float and double respectively.

public class TypePromotionExpressions {
public static void main (String args[]){
    /*byte a = 4;
    byte b = (byte) (a/2);
    System.out.print(b);*/
long a = 4000;
double b = 6000;
float c = 70.5f;
double answer = (double) a + b + c;
System.out.println(answer);
} 
}


    
    

