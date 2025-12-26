import java.util.Scanner;
public class ArrayRotate {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int[] a = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int last = a[n - 1];
            for (int i = n - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = last;

            System.out.println("Array after rotation:");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }

