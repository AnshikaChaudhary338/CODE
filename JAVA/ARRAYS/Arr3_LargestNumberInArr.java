package JAVA.ARRAYS;

public class Arr3_LargestNumberInArr {
    public static int GetLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;// infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println(" The smallest value is " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 6, 7, 8, 9, 4 };
        System.out.println("The Largest value is " + GetLargest(numbers));
    }

}
