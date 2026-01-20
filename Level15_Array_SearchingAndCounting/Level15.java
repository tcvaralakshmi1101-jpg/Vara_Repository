//Arrays(Searching & Counting logic)

//1.input an element x--check if it exists in the array


/*import java.util.Scanner;
public class Level15 {
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
        System.out.println("enter a key:");
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(a[i]==key){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("element found");
        }
        else{
            System.out.println("element is not found");
        }
    }
}*/

//2.count how many times a given element is found

/*import java.util.Scanner;
public class Level15 {
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
        System.out.println("enter a key:");
        int key=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==key){
                count++;
            }
        }
        System.out.println("the count is:"+count);
    }
}*/

//3.find the first occurrence of a given number

/*import java.util.Scanner;
public class Level15 {
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
        System.out.println("enter a ele:");
        int ele=sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(a[i]==ele){
               a[i]=ele;
               index=i;
               break;
            }
        }
        if(index!=-1){
            System.out.println("the first occurrence of the ele "+ele+" at index is :"+index);
        }
        else{
            System.out.println("element not found:");
        }
    }
}*/

//4.find the last occurrences of the element

/*import java.util.Scanner;
public class Level15 {
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
        System.out.println("enter a ele");
        int ele=sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(a[i]==ele){
                a[i]=ele;
                index=i;
            }
        }
        if(index!=-1){
            System.out.println("the last occurrences of ele is "+ele+" at index:"+index);
        }
        else{
            System.out.println("element not found");
        }
    }

}*/

//5.check if all elements in an array are unique

/*import java.util.*;
public class Level15 {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        HashSet<Integer> set=new HashSet<>();
        boolean isUnique=true;
        for(int num:arr){
            if(set.contains(num)){
                isUnique=false;
                break;
            }
            set.add(num);
        }
        if(isUnique){
            System.out.println("array elements are unique");
        }
        else{
            System.out.println("array elements are not unique,contains duplicate");
        }
    }
}*/


//6.find the sum of even elements only


/*public class Level15 {
    public static void main(String[] args){
        int[] arr={10,15,20,25,30};
        int evenSum=0;
        for(int i:arr){
            if(i%2==0){
                evenSum+=i;
            }
        }
        System.out.println("the even sum is :"+evenSum);
    }
}*/

//7.find the sum of the odd elements only

/*public class Level15 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int oddSum=0;
        for(int i:arr){
            if(i%2!=0){
                oddSum+=i;
            }
        }
        System.out.println("the odd sum is:"+oddSum);
    }
}*/


//8.find the count of prime numbers in the array


/*public class Level15 {
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7,8,9};
        int count=0;
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            boolean isPrime=true;
            if(n<=1){
                isPrime=false;
            }
            else{
                for(int j=2;j<n;j++){
                    if(n%j==0){
                        isPrime=false;
                        break;
                    }
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println("the prime numbers count is:"+count);
    }
}*/

//9.count how many numbers are divisible by 3 and 5 and both


/*public class Level15 {
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7,8,9,15};
        int c1=0;
        int c2=0;
        int c3=0;
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            if(n%3==0){
                c1++;
            }
            if(n%5==0){
                c2++;
            }
            if(n%3==0 && n%5==0){
                c3++;
            }

        }
        System.out.println("3 divisible count is:"+c1);
        System.out.println("5 divisible count is:"+c2);
        System.out.println("3 and 5 divisible count is:"+c3);
    }
}*/

//10.count how many elements are perfect squares

/*public class Level15 {
    public static void main(String[] args){
        int[] arr={2,4,9,16,25,36,49};
        int count=0;
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            int root=(int)Math.sqrt(n);
            if(root*root==n){
                count++;
            }
        }
        System.out.println("the perfect square count is:"+count);
    }
}*/