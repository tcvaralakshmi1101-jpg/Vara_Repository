public class LongestSubArraySumK {
    public static void longestSubarray(int[] arr, int k) {
        int start = 0;
        int sum = 0;
        int maxLen = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
                while (sum > k) {
                    sum -= arr[start];
                    start++;
                }
                if (sum == k) {
                    int len = end - start + 1;
                    if (len > maxLen) {
                        maxLen = len;
                        ansStart = start;
                        ansEnd = end;
                    }
                }
            }
            if (ansStart != -1) {
                System.out.print("Longest subarray with sum " + k + " : ");
                for (int i = ansStart; i <= ansEnd; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                System.out.println("No subarray found");
            }
        }
        public static void main(String[] args) {
            int[] nums = {2, 3, 1, 1, 1, 5, 2};
            int k = 5;

            longestSubarray(nums, k);
        }
    }