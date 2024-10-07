import java.util.*;

public class Arr12_KadaneAlgo {
    public static void maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];

            if (currSum <= 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.print("Max Sum " + maxSum);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 7, 8, 6 };
        maxSubArray(nums);

    }

}
