import java.util.*;

public class NegativeORpostiveNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if (y < 0) {
            System.out.println("The number is Negative or Less than Zero.");
        } else {
            System.out.println("The number is positive. ");
        }
    }

}
