//Basic Arrays(Iterative logical thinking)

//1.input n and take n integers into an array .print them

/*import java.util.Scanner;
public class Level14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the required array is");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*/

//2.find the sum of all elements in an array

/*import java.util.Scanner;
public class Level14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the sum of the array elements:");
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum is:"+sum);
    }
}*/

//3.find average of array elements

/*import java.util.Scanner;
public class Level14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        double average=(double)sum/n;
        System.out.println("the average is:"+average);

    }
}*/

//4.find maximum in an array


/*import java.util.Scanner;
public class Level14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maximum=a[0];
        for(int i=0;i<n;i++) {
            if (a[i] > maximum) {
                maximum = a[i];
            }
        }
        System.out.println("the max is:"+maximum);
    }
}*/

//5.find minimum element in an array

/*import java.util.Scanner;
public class Level14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i=1;i<n;i++) {
            if (a[i] < min) {
                min= a[i];
            }
        }
        System.out.println("the min is:"+min);
    }
}*/

//6.count how many elements are positive,negative and zero

/*public class Level14 {
    public static void main(String[] args){
        int[] arr={-1,0,7,8,9};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int posCount=0;
        int negCount=0;
        int zeroCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posCount++;
            } else if (arr[i]<0) {
                negCount++;
            }
            else{
               zeroCount++;
            }
        }
        System.out.println("the pos count is"+posCount);
        System.out.println("the  neg count is"+negCount);
        System.out.println("the zero count is"+zeroCount);
    }
}*/

//7.count how many elements are even and odd


/*import java.util.Scanner;
public class Level14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("array is:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int oddCount=0;
        int evenCount=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("the even count is:"+evenCount);
        System.out.println("the odd count is:"+oddCount);
    }
}*/

//8.find the index of the maximum element


/*import java.util.Scanner;
public class Level14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("array is:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int max=a[0];
        int index=0;
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
                index=i;
            }
        }
        System.out.println("the max ele is:"+max);
        System.out.println("the index is:"+index);
    }
}*/

//9.find min index in an array


/*import java.util.Scanner;
public class Level14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("array is:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int min=a[0];
        int index=0;
        for(int i=1;i<n;i++){
            if(a[i]<min){
                min=a[i];
                index=i;
            }
        }
        System.out.println("the min ele is:"+min);
        System.out.println("the index is:"+index);
    }
}*/

//10.take n elements and print only those greater than a given value k

/*import java.util.Scanner;
public class Level14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("array is:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("enter value:");
        int value=sc.nextInt();
        System.out.println("array greater than given value is:");
        for(int i=0;i<n;i++){
            if(a[i]>value){
                System.out.print(a[i]+" ");
            }
        }
    }
}*/
