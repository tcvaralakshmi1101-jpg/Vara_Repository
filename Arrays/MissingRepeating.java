import java.util.Scanner;
public class MissingRepeating {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int repeating = -1;
            int missing = -1;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        repeating = a[i];
                    }
                }
            }
            for (int i = 1; i <= n; i++) {
                boolean found = false;

                for (int j = 0; j < n; j++) {
                    if (a[j] == i) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    missing = i;
                }
            }

            System.out.println("Repeating number: " + repeating);
            System.out.println("Missing number: " + missing);
        }
    }

