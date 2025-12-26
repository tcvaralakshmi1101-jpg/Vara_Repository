public class PairSumArray {
        public static void main(String[] args) {

            int[] arr = {1, 2, 4, 7, 11, 15};
            int sum = 15;

            int i = 0;
            int j = arr.length - 1;

            while (i < j) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair: " + arr[i] + ", " + arr[j]);
                    return;
                }
                else if (arr[i] + arr[j] < sum) {
                    i++;
                }
                else {
                    j--;
                }
            }

            System.out.println("No pair found");
        }
    }

