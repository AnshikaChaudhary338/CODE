import java.util.*;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do {
            System.out.println("Enter the number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }
            System.out.println("Do you want to continue? Press 1 for yes and Press 0 for no");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("The sum of even numbers " + evensum);
        System.out.println("The sum of odd numbers " + oddsum);
    }
}
