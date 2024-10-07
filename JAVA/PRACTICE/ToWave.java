import java.util.*;

public class ToWave {
    public static void convertToWave(int n, int[] arr) {
        // code here
         for(int i=0;i<n-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
    }
}
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int n =  arr.length;
}
}
    

