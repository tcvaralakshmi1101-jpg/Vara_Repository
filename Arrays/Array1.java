public class Array1 {
        public static void main(String [] args){
            String[] arr1={"a","b","c"};
            String[] arr2={"d","e","f"};
            String[] arr3=new String[arr1.length+arr2.length];
            int n= arr1.length;
            for(int i=0;i<n;i++){
                System.out.println(arr1[i]);
                System.out.println(arr2[i]);
            }
            System.out.println("combining of two strings");
            for(int i=0;i<n;i++){
                arr3[i]=arr1[i]+arr2[i];
                System.out.print(arr3[i]);

            }
        }
    }


