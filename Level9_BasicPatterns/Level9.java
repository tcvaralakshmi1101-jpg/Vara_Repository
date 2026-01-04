//ALL ABOUT PATTERNS
//1.printing 4 starts
/*public class Level9 {
    public static void main(String[] args){
        System.out.println("****");
    }
}*/

//2.print n stars
/*import java.util.Scanner;
public class Level9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print("*");
        }
    }

}*/

//3.printing square of stars(n*n stars)

/*import java.util.Scanner;
public class Level9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/

//4.print an increasing triangle

/*import java.util.Scanner;
public class Level9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}*/

//5.print right-aligned triangle of stars


/*import java.util.Scanner;
public class Level9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//6.print stars in even numbers(2,4,6,8,10)

/*import java.util.Scanner;
public class Level9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//7.print stars in add numbers(1,3,5,7)

/*import java.util.Scanner;
public class Level9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//8.print a centered pyramid of stars

/*import java.util.Scanner;
public class Level9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//9.print numbers in an increasing sequences

/*import java.util.Scanner;
public class Level9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

//10.print repeate numbers for row

/*import java.util.Scanner;
public class Level9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

}*/

