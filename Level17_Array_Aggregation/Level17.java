//Array aggregate & Comparative Thinking

//1.Compare two arrays --check if they are equal (same elements & order)
/*public class Level17 {
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        boolean isEqual=true;
        if(arr1.length!=arr2.length){
            System.out.println("Arrays not equal");
            return;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) isEqual=false;
        }
        if(!isEqual){
            System.out.println("Arrays are not equal");
        }else{
            System.out.println("Arrays are equal");
        }
        return;
    }
}*/

/*public class Level17 {
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,5,5};
        boolean isEqual=true;
        if(arr1.length!=arr2.length){
            isEqual=false;
        }
        else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    isEqual=false;
                    break;
                }
            }
        }
        if(isEqual){
            System.out.println("array are equal");
        }
        else{
            System.out.println("arrays are not equal");
        }
    }
}*/

//2.compare two arrays -Check if they contain the same elements(ignore order)

/*import java.util.Arrays;
public class Level17 {
    public static void main(String[] args){
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,4};
        if(arr1.length!=arr2.length){
            System.out.println("elements are different");
            return;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean same=true;
        for(int i=0;i<arr1.length;i++){
        if(arr1[i]!=arr2[i]){
            same=false;
            break;
        }
        }
        if(same){
            System.out.println("elements are same");
        }
        else{
            System.out.println("elements are different");
        }
    }
}*/

//3.merge two arrays into a third array

/*public class Level17 {
    public static void main(String[] args){
        int[] a1={1,2,3,4};
        int[] a2={5,6,7,8};
        int n1=a1.length;
        int n2=a2.length;
        System.out.println("array1 is:");
        for(int i=0;i<n1;i++){
            System.out.print(a1[i]+" ");
        }
        System.out.println();
        System.out.println("array2 is:");
        for(int i=0;i<n2;i++){
            System.out.print(a2[i]+" ");
        }
        System.out.println();
        int[] a3=new int[n1+n2];
        int index=0;
        for(int i=0;i<n1;i++){
            a3[index]=a1[i];
            index++;
        }
        for(int i=0;i<n2;i++){
            a3[index]=a2[i];
            index++;
        }
        System.out.println("merged array is:");
        for(int i=0;i<a3.length;i++){
            System.out.print(a3[i]+" ");
        }

    }
}*/

//4.find the common elements between two arrays

/*public class Level17 {
    public static void main(String[] args){
        int[] a1={1,2,3,4,5,6,7};
        int[] a2={3,4,5,6,7,8};
        int n1=a1.length;
        int n2=a2.length;
        System.out.println("the common elements are:");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a1[i]==a2[j]){
                    System.out.print(a1[i]+" ");
                    break;
                }

            }
        }
    }
}*/

//5.find the elements that are in one array but not in another array


/*public class Level17 {
    public static void main(String[] args){
        int[] a1={11,22,33,44,99};
        int[] a2={33,44,100,77};
        int n1=a1.length;
        int n2=a2.length;
        System.out.println("elements that are present in array1 not in array2");
        for(int i=0;i<n1;i++){
            boolean found=false;
            for(int j=0;j<n2;j++){
                if(a1[i]==a2[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.print(a1[i]+" ");
            }
        }
        System.out.println();
        System.out.println("elements that are present in array2 not in arra1");
        for(int i=0;i<n2;i++){
            boolean found=false;
            for(int j=0;j<n1;j++){
                if(a2[i]==a1[j]){
                    found=true;
                    break;
                }
            }
            if(!found) {
                System.out.print(a2[i] + " ");
            }
        }
    }
}*/

//6.count how many elements are common between two array


/*public class Level17 {
    public static void main(String[] args){
        int[] a1={1,2,3,4,5,6,7};
        int[] a2={1,2,3,8,9};
        int n1=a1.length;
        int n2=a2.length;
        int count=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a1[i]==a2[j]){
                    count++;
                }
            }
        }
        System.out.println("the count is:"+count);
    }
}*/

//7.find a elementwise sum of two arrays(a[i]+b[i])

/*public class Level17 {
    public static void main(String[] args){
        int[] a1={1,2,3,4,5};
        int[] a2={1,2,3,4,5};
        int n=a1.length;
        int[] c1=new int[n];
        for(int i=0;i<n;i++){
            c1[i]=a1[i]+a2[i];
        }
        System.out.println("the element wise sum is:");
        for(int i=0;i<n;i++){
            System.out.print(c1[i]+" ");
        }
    }
}*/

//8.find element wise product of two arrays

/*public class Level17 {
    public static void main(String[] args){
        int[] a1={1,2,3,4,5};
        int[] a2={1,2,3,4,5};
        int n=a1.length;
        int[] c1=new int[n];
        for(int i=0;i<n;i++){
            c1[i]=a1[i]*a2[i];
        }
        System.out.println("the element wise product is");
        for(int i=0;i<n;i++){
            System.out.print(c1[i]+" ");
        }
    }
}*/

//9.create a frequency array of numbers(count occurrences of each number)

/*public class Level17 {

    public static void main(String[] args){
        int[] arr={1,1,2,2,2,3,3};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] freq=new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        System.out.println("Number  :  Frequency");
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(i+ " : "+freq[i]);
            }
        }


    }
}*/

//10.print all elements that appear more than ones


/*public class Level17 {
    public static void main(String[] args){
        int[] arr={1,1,2,1,2,2,3};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] freq=new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        System.out.println("elements appearing more than once");
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                System.out.println(i);
            }
        }
    }
}*/