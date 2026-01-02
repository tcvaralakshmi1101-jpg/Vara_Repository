//NUMBER BASED LOPPING LOGIC


//1.count the number of digits in a given number
/*import java.util.Scanner;
public class Level7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int num=sc.nextInt();
        int count=0;
        if(num==0){
            count=1;
        }
        else{
            while(num!=0){
                count++;
                num=num/10;
            }
        }
        System.out.println("the number of digits count is:"+count);
    }
}*/

//2.print the reverse of a number
/*import java.util.Scanner;
public class Level7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("the reverse of a number is:"+rev);
    }
}*/

//3.check if a given number is palindrome or not
/*import java.util.Scanner;
public class Level7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }

}*/

//4.find the sum of digits of a number
/*import java.util.Scanner;
public class Level7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num/=10;
        }
        System.out.println("the sum of the digits is:"+sum);
    }
}*/

//5.check if a number is armstrong number
//armstrong number=sum of each digit rised by the power of the number of digits is qual to the original number
/*import java.util.Scanner;
public class Level7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+(digit*digit*digit);
            num/=10;
        }
        if(temp==num){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }

    }

}*/

//6.check if a number is perfect number
//perfect number=perfect number means the sum of its proper divisors is eual the orginal number ecluding the number it self
//that is 6 divisors:1,2,3 and their sum is=6(then 6 is the perfect number)
/*import java.util.Scanner;
public class Level7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num && num!=0){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}*/

//7.print all prime numbers upto 1 to 100
//prime numbers are the numbers which has exactly two factors that is one and itself
/*public class Level7 {
    public static void main(String[] args){
        System.out.println("prime numbers between 1 and 100:");
        for(int num=2;num<=100;num++){
            boolean isPrime=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num+" ");
            }
        }
    }
}*/

//8.check if a number is prime number or not

/*import java.util.Scanner;
public class Level7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=0){
            isPrime=false;
            //System.out.println("it is not a prime number:");
            //return;
        }
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(n+"is a prime number");
        }
        else{
            System.out.println(n+"it is not a prime number");
        }
    }
}*/

//9.print fibonacci series upto n terms

/*import java.util.Scanner;
public class Level7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        int a=0,b=1;
        if(n>=1){
            System.out.print(a+" ");
        }
        if(n>=2){
            System.out.print(b+" ");
        }
        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}*/

//10.find the sum of n fibonacci number

/*import java.util.Scanner;
public class Level7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        int a=0,b=1;
        int sum=0;
        if(n>=1){
            sum=sum+a;
        }
        if(n>=2){
            sum=sum+b;
        }
        for(int i=3;i<=n;i++){
            int c=a+b;
            sum=sum+c;
            a=b;
            b=c;
        }
        System.out.println("the sum of "+n+" fibonacci numbers is"+"="+sum);
    }

}*/