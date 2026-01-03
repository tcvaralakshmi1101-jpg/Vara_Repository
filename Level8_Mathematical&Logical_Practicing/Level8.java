//1.print the squares of numbers from 1 to n

/*import java.util.Scanner;
public class Level8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i+"*"+i+"="+(i*i));
        }
    }
}*/

//2.print cubes of numbers from 1 to n

/*import java.util.Scanner;
public class Level8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i+"*"+i+"*"+i+"="+(i*i*i));
        }
    }
}*/

//3.print all numbers between a and b divisible by 7


/*import java.util.Scanner;
public class Level8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting number:");
        int a=sc.nextInt();
        System.out.println("enter ending number:");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i%7==0){
                System.out.print(i+" ");
            }
        }
    }
}*/

//4.find HCF of two numbers using loops

/*import java.util.Scanner;
public class Level8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        System.out.println("HCF IS:"+a);
    }

}*/

//5.LCM of two numbers using loops

/*import java.util.Scanner;
public class Level8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        int x=a,y=b;
        while(y!=0){
            int r=x%y;
            x=y;
            y=r;
        }
        int hcf=x;
        int lcm=(a*b)/hcf;
        System.out.println("LCM IS:"+lcm);
    }

}*/


//6.print all factors of a given number

/*import java.util.Scanner;
public class Level8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        System.out.println("all factors of number "+num+" is: ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}*/

//7.find the sum of all factors of a number

/*import java.util.Scanner;
public class Level8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        System.out.println("the sum of factors is:"+sum);
    }
}*/

//8.check if a number is strong number(sum of factorials of digits=number)
//strong number=strong number is a number that is sum of factorials of its digits is equal to the number itself
//ex:145=1!+4!+5!=1+24+120=145(145 is a strong number)

/*import java.util.Scanner;
public class Level8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(sum==original) {
            System.out.println("perfect number:" + original);
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}*/

//9.print first n terms of arithmetic progression(a,d)
//arithmetic progression is the sequence of consecutive numbers where the difference between them is constant
//formula:a,a+d,a+2d,a+3d,....n terms
//where a =starting term
//d=common difference
//n=number of terms

/*import java.util.Scanner;
public class Level8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter the common difference: ");
        int d=sc.nextInt();
        System.out.println("enter the number of terms:");
        int n=sc.nextInt();
        System.out.println("The Arithmetic Progression is:");
        for(int i=1;i<=n;i++){
            System.out.print(a+i*d+" ");
        }
    }

}*/

//10.print first n terms of geometric progression
/* Geometric progression is the sequence where each term is obtained by multiplying a constant term and the previous term
form:a,ar,ar^2,ar^3....n terms
here,a=starting term
r=common ratio
n=number of terms

 */

import java.util.Scanner;
public class Level8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first term:");
        int a=sc.nextInt();
        System.out.println("enter the common ratio:");
        int r=sc.nextInt();
        System.out.println("enter the number terms:");
        int n=sc.nextInt();
        int term=a;
        for(int i=1;i<=n;i++){
            System.out.print(term+" ");
            term=term*r;
        }

    }
}