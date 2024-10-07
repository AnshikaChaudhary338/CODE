package JAVA.RECURSION;

public class FirstOccurrence {
    public static int firstOccur( int arr[], int key , int i){
        if( i == arr.length){
            return -1;
        }
        if( arr[i] == key){
            return i;
        }
        return firstOccur( arr , key , i+1);
    }

    // Last Occurrence 

    public static int lastOccurr( int arr[] , int key , int i){
        if( i == arr.length){
            return -1;
        }
        int isFind = lastOccurr(arr, key, i+1);
            if( isFind == -1 && arr[i] == key){
                return i;
            }
            return isFind;
        }
    
    public static void main(String[] args) {
        int arr[] = { 1,4,6,7,8,7,9};
       System.out.println( " First occurrence : " + firstOccur(arr,7,0));
       System.out.println( " Last  occurrence : "  + lastOccurr(arr, 7, 0));
    }
    
}
