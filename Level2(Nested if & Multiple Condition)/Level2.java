/* 1.take 3 sides and check weather they form a triangle or not
if a+b>c and a+c>b and b+c>a then they form a triangle otherwise not*/
/*import java.util.Scanner;
public class PracticingCoding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first side:");
        int a=sc.nextInt();
        System.out.println("enter the second side:");
        int b=sc.nextInt();
        System.out.println("enter the third side:");
        int c=sc.nextInt();
        if(a+b>c) {
            if (a + c > b) {
                if (b + c > a) {
                    System.out.println("they form the triangle:");
                } else {
                    System.out.println("they dont form triangle");
                }
            } else {
                System.out.println("they do not form a triangle:");
            }
        }
        else{
            System.out.println("they do not form a triangle:");
        }

    sc.close();
    }
}*/

//2.check weather the three sides form a tringle check it is a equilateral or isosceles or scalene
//to check it is equilateral triangle we check a==b and b==c and c==a
//to check it is isosceles triangle the condition is two sides are eual that is a==b or b==c or c==a
//to check it is scalene triangle the condition is a!=b and b!=c and c!=a

/*import java.util.Scanner;
public class PracticingCoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        // Check triangle formation using nested if
        if (a + b > c) {
            if (a + c > b) {
                if (b + c > a) {

                    System.out.println("Triangle is formed");

                    // Check type of triangle
                    if (a == b) {
                        if (b == c) {
                            System.out.println("It is an Equilateral Triangle");
                        } else {
                            System.out.println("It is an Isosceles Triangle");
                        }
                    } else {
                        if (b == c || a == c) {
                            System.out.println("It is an Isosceles Triangle");
                        } else {
                            System.out.println("It is a Scalene Triangle");
                        }
                    }

                } else {
                    System.out.println("Not a Triangle");
                }
            } else {
                System.out.println("Not a Triangle");
            }
        } else {
            System.out.println("Not a Triangle");
        }

        sc.close();
    }
}
*/

//3.print grade a/b/c/d/e/f by taking 0-100

/*import java.util.Scanner;
public class PracticingCoding{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks between 0 to 100:");
        int marks=sc.nextInt();
        if(marks>55){
            if(marks>65){
                if(marks>75){
                    if(marks>85){
                        System.out.println("grade is A"+marks);
                    }
                    else{
                        System.out.println("grade is f"+marks);
                    }
                }
                else{
                    System.out.println("garde is B"+marks);
                }
            }
            else{
                System.out.println("grade is c");
            }
        }
        else{
            System.out.println("grade is D");
        }


    }
}*/

//3.check if one of two given numbers is a multiple of the other

/*import java.util.Scanner;
public class PracticingCoding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        if(a==0 || b==0){
            System.out.println("can not check multiples with 0");
        }
        else if(a%b==0 || b%a==0){
            System.out.println("one number is multiple of another");
        }
        else{
            System.out.println("one number is not multiple of another");
        }

    }
}*/

//4.take hours of the (0 to 23) and print "good morning" ,"good afternoon","good evening",or"good night"

/*import java.util.Scanner;
public class PracticingCoding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the hour 0 to 23:");
        int hour=sc.nextInt();
        if(hour<0 || hour>23){
            System.out.println("Invalid time");
        }
        else if(hour>=5 && hour<=11){
            System.out.println("Good morning:");
        }
        else if(hour>=12 && hour<=16){
            System.out.println("Good Afternoon");
        }
        else if(hour>=17 && hour<=20){
            System.out.println("Good evening");
        }
        else{
            System.out.println("Good Night");
        }
    }
}*/

//5.check voting eligibility for age 18+

/*import java.util.Scanner;
public class PracticingCoding{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age between 0 to 100:");
        int age=sc.nextInt();
        if(age<=0 || age>100){
            System.out.println("Invalid age");
        }
        else if(age>=18 ){
            System.out.println("eligible for voting:");
        }
        else{
            System.out.println("not eligible for voting");
        }
    }
}*/

//6.take two numbers and determine when both are even ,both are odd,or one is even and one is odd

/*import java.util.Scanner;
public class PracticingCoding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        if(a<=0 ||b<=0){
            System.out.println("it is not possible to check");
        }
        else if(a%2==0 && b%2==0){
            System.out.println("given numbers are even numbers");
        }
        else if(a%2!=0 && b%2!=0){
            System.out.println("given numbers are odd numbers");
        }
        else{
            System.out.println("one is even and one is odd");
        }
    }
}*/

//7.take an alphabet and check if it lies between 'a' and 'm' or 'n' and 'Z'

/*import java.util.Scanner;
public class PracticingCoding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an alphabet");
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        if(ch>='a'&& ch<='m'){
            System.out.println("entered character lies between a and m");
        }
        else if(ch>='n' && ch<='z'){
            System.out.println("entered character lies between n and z");
        }
        else{
            System.out.println("invalid ,not an alphabet");
        }
    }
}*/

//8.take a day number(1 -7) and print the corresponding day name

/*import java.util.Scanner;
public class PracticingCoding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a day between 0 to 7:");
        int day=sc.nextInt();
        if(day<1 || day>7 ){
            System.out.println("invalid day entered");
        }
        else if(day==1){
            System.out.println("day is monday");
        }
        else if(day==2){
            System.out.println("day is tuesday");
        }
        else if(day==3){
            System.out.println("day is wednesday");
        }
        else if(day==4){
            System.out.println("day is thursday");
        }
        else if(day==5){
            System.out.println("day is friday");
        }
        else if(day==6){
            System.out.println("day is saturday");
        }
        else{
            System.out.println("day is sunday");
        }
    }
}*/
//9.take a day number(1-7) and print the corresponding day name
/*import java.util.Scanner;
public class PracticingCoding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a day between 0 to 7:");
        int day=sc.nextInt();
            switch(day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Sunday");
            }
        }
    }*/

// 10.take a month number (1 to 12) and print the number of days in that month(ignore case);
/*import java.util.Scanner;
public class PracticingCoding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number between  1 to 12:");
        int n=sc.nextInt();
        if(n==1||n==3||n==5||n==7||n==8||n==10||n==12){
            System.out.println("month has 31 days");
        }
        else if(n==4||n==6||n==9||n==11){
            System.out.println("month has 30 days");
        }
        else if(n==2){
            System.out.println("month has 28 days");
        }
        else{
           System.out.println("Invalid number entred");
        }
    }
}*/

