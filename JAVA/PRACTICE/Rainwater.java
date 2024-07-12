package JAVA.PRACTICE;

public class Rainwater {
    public static int rainwater( int height[]){
        //calculate left max boundary
        int leftmax[]=  new int[height.length];
        leftmax[0] = height[0];
        for ( int i = 1;i<height.length;i++){
            leftmax[i]= Math.max(height[i], leftmax[i-1]);

        }
        //calculate right boundary 
        int rightmax[] = new int[height.length-1];
        rightmax[height.length-1]= height[height.length-1];
        for( int i = height.length-2;i>=0;i--){
            rightmax[i]= Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater =0;
        for( int i=0;i<height.length;i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            trappedwater = trappedwater + (waterlevel - height[i]);
        }
        return trappedwater;


    }
    public static void main(String[] args) {
        int height[]={1,2,3,4,5};
        System.out.print(rainwater(height));
    }
    
}
