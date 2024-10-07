package JAVA.ARRAYS;
import java.util.*;
public class Arr11_MaxSubaaraySum {
    public static void PrintSubarraySum(int num[]){

        int CurrSum =0;
        int MaxSum = Integer.MIN_VALUE;

        for(int i =0;i<num.length;i++){
            int start = i;
            for(int j = i;j<num.length;j++){
                int end = j;
                CurrSum = 0;

                for(int k = start; k<=end;k++){
                    CurrSum = CurrSum + num[k];
                }
                System.out.println( CurrSum);
                if(MaxSum < CurrSum){
                    MaxSum = CurrSum;
                }

            } 
           
        }
        System.out.println("Maximum Subarray Sum:" + MaxSum);

    }
        public static void main(String[] args) {
            int num[] = {2,4,6,8,10};
            PrintSubarraySum(num);  
    }
    
}
