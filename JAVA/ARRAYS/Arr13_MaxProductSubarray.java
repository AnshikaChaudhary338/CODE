package JAVA.ARRAYS;

public class Arr13_MaxProductSubarray {
    public static int maximun(int nums[]) {
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];
        for( int i=0;i<nums.length;i++){
            if(leftProduct == 0){
                leftProduct =1;
            }
            if(rightProduct == 0){
                rightProduct =1;
            }
            leftProduct = leftProduct * nums[i];
            rightProduct = rightProduct * nums[nums.length-1-i];
            ans = Math.max(ans,Math.max(leftProduct,rightProduct));
        }
        return ans;
    }

public static void main(String[] args) {
    int nums[]={2,3,-2,4};
    System.out.println(maximun(nums));
}

}
