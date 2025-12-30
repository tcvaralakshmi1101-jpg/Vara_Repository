//1.take a character and check if it is letter or digit or neither

/*import java.util.Scanner;
public class Level4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character:");
        char ch=sc.next().charAt(0);
        if ((ch>='a'&& ch<='z') ||(ch>='A'&& ch<='Z')){
            System.out.println("letter");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("digit");
        }
        else{
            System.out.println("nerither a digit nor a letter");
        }
    }
}*/

//2.take a number and print FIZZ if it divisible by 3 ans print BUZZ if it is divisible by 5 and print FIZZBUZZ if it is divisible by both

/*import java.util.Scanner;
public class Level4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("FIZZBUZZ");
        }
        else if(n%3==0){
            System.out.println("FIZZ");
        }
        else if(n%5==0){
            System.out.println("BUZZ");
        }
    }

}*/

//3.take 3 numbers and find the median(neither the maximum nor the minimum)

/*import java.util.Scanner;
public class Level4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st number:");
        int a=sc.nextInt();
        System.out.println("enter the 2nd number:");
        int b=sc.nextInt();
        System.out.println("enter the 3rd number:");
        int c=sc.nextInt();
        if((a>b && a<c) ||(a>c && a<b)){
            System.out.println("meadian:"+a);
        }
        else if((b>a && b<c)||(b>c && b<a)){
            System.out.println("meadian:"+b);
        }
        else{
            System.out.println("meadian:"+c);
        }
    }

}*/

//4.take 24-hours time(hours and minutes) and print whether it is AM or PM

/*import java.util.Scanner;
public class Level4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the time ,take 24-hours time(hours and minutes):");
        float time=sc.nextFloat();
        if(time>=1 && time<=12){
            System.out.println("AM");
        }
        else if(time>=12 && time<=24){
            System.out.println("PM");
        }
        else{
            System.out.println("INVALID");
        }
    }
}*/
//or another way is
/*import java.util.Scanner;
public class Level4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int hour=sc.nextInt();
        int min=sc.nextInt();
        if(hour<12){
            System.out.println("AM");
        }
        else{
            System.out.println("PM");
        }
    }
}*/

//5.take income and age,check if eligible for tax(age>18 and income >5L)

/*import java.util.Scanner;
public class Level4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:");
        int age=sc.nextInt();
        System.out.println("enter the income:");
        Double inc=sc.nextDouble();
        if(age>18 && inc>500000){
            System.out.println("eligible for tax");
        }
        else{
            System.out.println("not eligible for tax");
        }
    }

}
*/
//6.take two numbers and check if both are positive and their sum is less than 100

/*import java.util.Scanner;
public class Level4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        if(a>0 && b>0 && (a+b)<100){
            System.out.println("both are positive and sum is less than 100");
        }
        else{
            System.out.println("condition doesnt match");
        }
    }
}*/

//7.take a single digit(0-9) and printits word from ("Zero" to "nine")
/*import java.util.Scanner;
public class Level4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit (0 to 9):");
        int digit=sc.nextInt();
        switch(digit){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("invalid");
        }
        sc.close();
    }

}*/

//8.take a weekday number (1-7) and determine if it is a weekday or weekend
// 1-5 is weekday and 6,7 are weekend and remaining are invalid

/*import java.util.Scanner;
public class Level4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a day:");
        int day=sc.nextInt();
        if(day>=1 && day<=5){
            System.out.println("weekday");
        }
        else if(day==6 || day==7){
            System.out.println("weekend");
        }
        else{
            System.out.println("invalid");
        }
    }
}*/

//9.Take a electricity units consumed and calculate the bill as per slabs(using ifelse)

/*import java.util.Scanner;
public class Level4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        double bill;
        if(unit<=100){
            bill=unit*1;
        }
        else if(unit<=200){
            bill=(unit*1)+((unit-100)*2);
        }
        else{
            bill=(unit*1)+((unit-100)*2)+((unit-200)*3);
        }
        System.out.println("electricity bill="+bill);
        sc.close();
    }
}*/
//10.take a password string and check basic rules(length>=8 and contains at least one digit0
/*import java.util.Scanner;
public class Level4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a password:");
        String password=sc.nextLine();
        boolean hasDigit=false;
        for(int i=0;i<password.length();i++){
            if(Character.isDigit(password.charAt(i))){
                hasDigit=true;
                break;
            }
        }
        if(password.length()>=8 && hasDigit){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
        sc.close();
    }
}*/



