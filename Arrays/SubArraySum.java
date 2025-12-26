public class SubArraySum {
     public static int MaxSubArray( int[] arr,int k){
         int maxsum=0;
         int windowsum=0;
         for(int i=0;i<k;i++){
             maxsum+=arr[i];
         }
         maxsum=windowsum;
         for(int i=k;i<arr.length;i++){
             windowsum=windowsum+arr[i]-arr[i-k];
             maxsum=Math.max(maxsum,windowsum);
         }
         return maxsum;
     }
     public static void main(String[] args){
         int[] nums={1,2,3,4,5,6,7,8,9,10};
         int k=3;
         int result=MaxSubArray(nums,k);
         System.out.println("maximum sum of a sub array is:"+k+result);
     }
}
