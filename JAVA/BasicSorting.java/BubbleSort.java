import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort( int arr[]) {
        for( int turn = 0;turn<arr.length-1;turn++){
            for( int j = 0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void printarr( int arr[]) {
        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,3,4};
        bubbleSort(arr);
        printarr(arr);
    }
    
    
}
