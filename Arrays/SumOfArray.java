import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of elements in an array is:" + sum);
    }
}



