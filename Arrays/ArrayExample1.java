import java.util.Scanner;
class ArrayEample1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();


        }
        System.out.println("reversing an array");
        int rev[]=new int[n];
        for(int i=n-1;i<=0;i--){
            rev[i]=arr[n-i-1];
        }
        System.out.println("reverse elemnts:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
