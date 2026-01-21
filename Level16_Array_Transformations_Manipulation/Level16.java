//Array Transformations and Manipulations


//1.create a new array containing squares of all numbers;


/*public class Level16 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] squarr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            squarr[i]=arr[i]*arr[i];
        }
        System.out.println("the original array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the squared array is:");
        for(int i=0;i<squarr.length;i++){
            System.out.print(squarr[i]+" ");
        }
    }
}*/

//2.create a new array containg only even elements

/*public class Level16 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        int[] evenarr=new int[count];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenarr[index]=arr[i];
                index++;
            }
        }
        System.out.println("the original array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the even array is:");
        for(int i=0;i<evenarr.length;i++){
            System.out.print(evenarr[i]+" ");
        }
    }
}*/

//3.replace every negative number with 0

/*public class Level16 {
    public static void main(String[] args){
        int[] arr={1,-2,3,-4,5,-6,7,-8};
        System.out.println("Original array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }
        System.out.println();
        System.out.println("array after replacing the negative numbers with zeros:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

//4.replace all even numbers with 1 and all odd numbers with 0

/*public class Level16 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }
        System.out.println("array after replacing:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

//5.swap the first and last elements of the array

/*import java.util.Scanner;
public class Level16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        if(n<2){
            System.out.println("array must have only 2 elemts to swap");
            return;
        }
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;
        System.out.println("after swapping");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

/*public class Level16 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        if(n<2){
            System.out.println("there is only two elements to swap");
            return;
        }
        int temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;
        System.out.println("Array after swapping");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}*/

//6.reverse an array


/*public class Level16 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        System.out.println("reversed array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

//7.Rotate an array by one position to the left

/*public class Level16 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        System.out.println("Rotated array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/


//8.Rotate an array by one position to the right

/*public class Level16 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println("Original array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        System.out.println("Rotated array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

//9.swap alternate elements(1st<-->2nd<-->3rd<-->4th)

/*public class Level16 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println("original array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println("array after swapping:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

//10.copy one array to another array

public class Level16 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        //int count=0;
        System.out.println("Original array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            //count++;
        }
        System.out.println();
        int[] copyarr=new int[arr.length];//use count
        int index=0;
        for(int i=0;i<arr.length;i++){
            copyarr[index]=arr[i];
            index++;
        }
        System.out.println("copied array is");
        for(int i=0;i<copyarr.length;i++){
            System.out.print(copyarr[i]+" ");
        }
    }
}



