import java.util.*;

public class NotMultipleOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);

        } while (true);

    }
}