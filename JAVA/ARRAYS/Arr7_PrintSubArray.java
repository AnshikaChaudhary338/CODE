package JAVA.ARRAYS;

public class Arr7_PrintSubArray {
    public static void PrintSubArr(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 };
        PrintSubArr(number);
    }

}
