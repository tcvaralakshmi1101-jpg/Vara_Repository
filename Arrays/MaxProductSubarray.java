import java.util.Scanner;
public class MaxProductSubarray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int maxProd = a[0];
            int minProd = a[0];
            int result = a[0];
            for (int i = 1; i < n; i++) {

                if (a[i] < 0) {
                    int temp = maxProd;
                    maxProd = minProd;
                    minProd = temp;
                }
                maxProd = Math.max(a[i], maxProd * a[i]);
                minProd = Math.min(a[i], minProd * a[i]);
                result = Math.max(result, maxProd);
            }

            System.out.println("Maximum product of subarray = " + result);
        }
    }

