//Recursion Thinking in self-reference


//1.print numbers from 1 to n using recursion

/*import java.util.Scanner;
public class Level11 {
    static void printNumbers(int n){
        if(n==0){
            return;
        }
        printNumbers(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        printNumbers(n);
    }

}*/

//2.print numbers from n to 1 using recursion

/*import java.util.Scanner;
public class Level11 {
    static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n+" ");
        printNumbers(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        printNumbers(n);
    }
}*/

//3.print only even numbers from 1 to n

/*import java.util.Scanner;
public class Level11 {
    static void printNumbers(int n){
        if(n==0){
            return;
        }
        printNumbers(n-1);
        if(n%2==0){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        printNumbers(n);
    }
}*/

//4.print only odd numbers from 1 to n using recursion


/*import java.util.Scanner;
public class Level11 {
    static void printNumbers(int n){
        if(n==0){
            return;
        }
        printNumbers(n-1);
        if(n%2!=0){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        printNumbers(n);
    }
}*/

//5.print sum of first n natural numbers using recursion

/*import java.util.Scanner;
public class Level11 {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        int result=sum(n);
        System.out.println("the sum is:"+result);
    }
}*/

//6.print factorial of a number recursively


/*import java.util.Scanner;
public class Level11 {
    static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        System.out.println("the factorial is:"+fact(n));
    }
}*/

//7.calculate the power of a number(x^n) using recursion

/*import java.util.Scanner;
public class Level11 {
    static long power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base value(x):");
        int x=sc.nextInt();
        System.out.println("enter the exponent value(n):");
        int n=sc.nextInt();
        System.out.println("the power is:"+power(x,n));
    }
}*/


//8.find nth fibonacci number recursively


/*import java.util.Scanner;
public class Level11 {
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        System.out.println("the nth fibonacci number is :"+fibonacci(n));
    }
}*/

//9.print fibonacci series up to n terms recursively

/*import java.util.Scanner;
public class Level11 {
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms:");
        int n=sc.nextInt();
        System.out.println("the fibonacci series up to:"+n+"terms");
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}*/

//10.find sum of digits of a number recursively


/*import java.util.Scanner;
public class Level11 {
    static long sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        long result=sum(n);
        System.out.println("the sum of the digits is:"+result);
    }
}*/