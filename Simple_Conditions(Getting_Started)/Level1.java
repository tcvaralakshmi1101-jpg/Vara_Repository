//simple conditions
 //1.take a number and print weather it is positive,negative,zero

/*import java.util.Scanner;
public class Level1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("number is zero:");
        }
        else if(n>0){
            System.out.println("number is positive");
        }
        else {
            System.out.println("number is negative");
        }
    }

}*/

//2.check if a number is even or odd
/*import java.util.Scanner;
public class Level1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("given number is even");
        }
        else{
            System.out.println("given number is negative");
        }
    }

}*/

//3.check if a number is divisible by 5
/*import java.util.Scanner;
public class Level1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("number is divisible by 5");
        }
        else{
            System.out.println("number is not divisible by");
        }
    }
}*/

//4.check if a number is divisible by 3 and 5
/*import java.util.Scanner;
public class Level1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("number is divisible by both 3 and 5");
        }
        else{
            System.out.println("numbre is not divisible:");
        }
    }
}*/

//5.check if a given year is leap year
/*import java.util.Scanner;
public class Level1{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year:");
        int year=sc.nextInt();
        if((year%400==0) ||(year%4==0 && year%100==0)){
            System.out.println("given year is leap year");

        }
        else{
            System.out.println("not  a leap year:");
        }
    }

}*/


//6.take two numbers and print the larger one
import java.util.Scanner;
/*public class Level1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=sc.nextInt();
        System.out.println("enter the second number:");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("num1 is greater:"+num1);
        }
        else{
            System.out.println("num2 is greater:"+num2);
        }
    }
}*/


//7.take three numbers and print the larger one
import java.util.Scanner;
/*public class Level1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int n1=sc.nextInt();
        System.out.println("enter the second number:");
        int n2=sc.nextInt();
        System.out.println("enter the third number:");
        int n3=sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println("n1 is greatest number");
        }
        else if(n2>n3){
            System.out.println("n2 is greater number");
        }
        else{
            System.out.println("n3 is greater");
        }
    }

}*/


//8.take a temperature and print cool ,warm,and hot
import java.util.Scanner;
/*public class Level1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temperature:");
        int t=sc.nextInt();
        if(t<15){
            System.out.println("temperature is cold");
        }
        else if(t<=30){
            System.out.println("temperature is warm");
        }
        else{
            System.out.println("temperature is hot");
        }
    }
}*/

//9.take a character and check if it is uppercase,lowercase,digit and special symbol
import java.util.Scanner;
/*public class Level1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character:");
        char ch=sc.next().charAt(0);
        if(ch>='a'&& ch<='z'){
            System.out.println("LowerCase");
        }
        else if(ch>='A'&& ch<='Z'){
            System.out.println("Uppercase");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special character");
        }
    }
}*/