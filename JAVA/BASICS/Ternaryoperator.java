import java.util.*;

public class Ternaryoperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // int number = 4;

        // Ternary operator
        String type = ((number % 2) == 0) ? "Even" : "Odd";
        System.out.print(type);
    }

}
