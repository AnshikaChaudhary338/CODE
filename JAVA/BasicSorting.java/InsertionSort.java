package JAVA.util,*;


public class InsertionSort {
    public static  void insertionsort( int arr[]){
        for( int i=0;i<arr.length;i++){
            int curr = i;
            int prev = i-1;
            while( prev >=0 && arr[prev] > curr){
                arr[prev +1] = arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5,4,3,6,2,1};
        insertionsort(arr);
    }
    
}
