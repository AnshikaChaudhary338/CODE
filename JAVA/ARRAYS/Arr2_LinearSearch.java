package JAVA.ARRAYS;

public class Arr2_LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 5;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(" The key is at index " + index);
        }

    }

}
