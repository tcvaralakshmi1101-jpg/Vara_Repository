public class Maxsubarray1 {
    public static int maxsubarray(int[] arr, int k) {
        int maxsum = 0;
        int windowsum =0;
        for (int i = 0; i < k; i++) {
            windowsum += arr[i];
        }
        maxsum = windowsum;
        for (int i = k; i < arr.length; i++) {
            windowsum = windowsum + arr[i] - arr[i - k];
            maxsum = Math.max(maxsum, windowsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9,10};
        int k = 3;

        int result = maxsubarray(nums, k);
        System.out.println("Max sum of subarray of size " + k + " : " + result);
    }
}

