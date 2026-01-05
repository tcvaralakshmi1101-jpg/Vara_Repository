//1.print all numbers whose sum of digits is even (1-100)
/*public class Level10 {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            int num=i;
            int sum=0;
            while(num!=0){
                sum=sum+(num%10);
                num=num/10;
            }
            if(sum%2==0){
                System.out.print(i+" ");
            }
        }
    }
}*/

//2.count how many numbers between 1-500 are divisible by 7 but not by 5
/*public class Level10 {
    public static void main(String[] args){
        int count=0;
        for(int i=1;i<=500;i++){
            if(i%7==0 && i%5!=0){
                count++;
            }
        }
        System.out.println("the count is:"+count);
    }
}*/


//3.print all numbers that are palindromes between 1-500
/*public class Level10 {
    public static void main(String[] args){
        for(int i=1;i<=500;i++){
            int num=i;
            int original=num;
            int sum=0;
            int rev=0;
            while(num!=0){
                int digit=num%10;
                rev=rev*10+digit;
                num=num/10;
            }
            if(rev==original){
                System.out.print(original+" ");
            }
        }
    }
}*/

//4.print numbers between 1-100 whose digits add up to a multiple of 3


/*public class Level10 {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            int num=i;
            int sum=0;
            while(num!=0){
                sum=sum+(num%10);
                num=num/10;
            }
            if(sum%3==0){
                System.out.print(i+" ");
            }
        }
    }
}*/

//5.find the smallest and largest digit in a given number


/*import java.util.Scanner;
public class Level10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int smallest=9;
        int largest=0;
        int temp=num;
        while(temp!=0){
            int digit=temp%10;
            if(digit<smallest){
                smallest=digit;
            }
            if(digit>largest){
                largest=digit;
            }
            temp=temp/10;
        }
        System.out.println("smallest digit is:"+smallest);
        System.out.println("largest digit is:"+largest);
    }
}*/

//6.print all numbers from 1-n whose binary representation has an even number of 1s

/*import java.util.Scanner;
public class Level10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int num=i;
            int count=0;
            while(num>0){
                if(num%2==1){
                    count++;
                }
                num=num/2;
            }
            if(count%2==0){
                System.out.print(i+" ");
            }
        }
    }
}*/

//7.print a pattern where each row i prints i*i


/*import java.util.Scanner;
public class Level10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i*i);
        }
    }
}*/

//8.print factorial of each number from  1 to n

/*import java.util.Scanner;
public class Level10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println(i+"!"+"="+fact);
        }
    }
}*/

//9.print the sum of all even digits and odd digits separately in  a number

/*import java.util.Scanner;
public class Level10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int evensum=0;
        int oddsum=0;
        while(temp!=0){
            int digit=temp%10;
            if(digit%2==0){
                evensum=evensum+digit;
            }
            else{
                oddsum=oddsum+digit;
            }
            temp=temp/10;
        }
        System.out.println("the even digit sum is:"+evensum);
        System.out.println("the odd digit sum is:"+oddsum);
    }
}*/

//10.take 5 numbers as input.if the user enters 0 ,skip it using continue.at the end,printthe sum of all non-zero numbers entered


/*import java.util.Scanner;
public class Level10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=5;i++){
            System.out.println("enter number:"+i);
            int num=sc.nextInt();
            if(num==0){
                continue;
            }
            sum=sum+num;
        }
        System.out.println("the sum of non-zero numbers is:"+sum);
    }
}*/