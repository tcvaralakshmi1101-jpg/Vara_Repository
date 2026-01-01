//1.print numbers from 1 to 10
/*public class Level6 {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
    }
}*/



//2.print all even numbers between 1 and 100
/*public class Level6 {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}*/


//3.print all odd numbers between 1 and 100
/*public class Level6 {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}*/


//4.print numbers from 10 down to 1
/*public class Level6 {
    public static void main(String[] args){
        for(int i=10;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}*/


//5.print the table of a given number(n*1 to n*10)
/*import java.util.Scanner;
public class Level6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any numbre to print the table:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
        sc.close();
    }

}*/


//6.print the sum of first n natural numbers

/*import java.util.Scanner;
public class Level6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("please enter a valid number:");

        }
        else{
            int sum=n*(n+1)/2;
            System.out.println("the sum of first  "+n+" is "+sum);
        }
        sc.close();
    }

}*/

//7.print the sum of all even numbers upto to n
/*import java.util.Scanner;
public class Level6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("the sum of "+n+"natural numbers is "+sum);
    }
}*/

//8.print the sum of all odd numbers upto n
/*import java.util.Scanner;
public class Level6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("the sum of the "+n+ " numbers is: "+sum);
    }

}*/

//9.print the factorial of a given number
/*import java.util.Scanner;
public class Level6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("the factorial of "+n+"is: "+fact);
    }
}*/

//10.print the products of digits of a given number
/*import java.util.Scanner;
public class Level6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int product=1;
        while(num!=0){
            int digit=num%10;
            product=product*digit;
            num=num/10;
        }
        System.out.println("the product of the digits of a number is:"+product);
    }

}*/