import java.util.*;
public class FindEven {
    public static  void main (String [] args)  {
        Scanner sc = new Scanner(System.in);
        int num ;

        System.out.println("Enter an integer");
        num = sc.nextInt();

        if(IsEven(num)) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }    

    }
        public static boolean IsEven (int number ) {
            if (number % 2 == 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }
    

