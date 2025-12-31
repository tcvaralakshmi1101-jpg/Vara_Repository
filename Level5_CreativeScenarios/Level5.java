//1.take coordinates(x,y) and check if the point lies on the x-axis,y-axis or at the origin
/*import java.util.Scanner;
public class Level5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the coordinates(x,y):");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y==0 && x==0){
            System.out.println("Lies on origin:");
        }
        else if(y==0){
            System.out.println("Lies on x-axis");
        }
        else if(x==0){
            System.out.println("Lies on y-axis");
        }
        else{
            System.out.println("Invalid");
        }
    }

}*/

//2.take 3 numbers and check if they can form a pythagorean triplet
//solution:first take 3 variables(a,b,c) and store them in(x,y,z) ,find the largest variable among them and store the largest one in z
//apply the pythagorean triplets  a^2+b^2=c^2[where c is the hypothesis

/*import java.util.Scanner;
public class Level5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers(a,b,c)");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=a,y=b,z=c;
        if(a>=b && a>=c){
            x=b;
            y=c;
            z=a;
        }
        else if(b>=a && b>=c){
            x=a;
            y=c;
            z=b;
        }
        else{
            x=a;
            y=b;
            z=c;
        }
        if(x*x+y*y==z*z){
            System.out.println("entered numbers are pythagorean triplets:");
        }
        else{
            System.out.println("not pythagorean triplets:");
        }
    }
}*/

//3.take a day and month and check if they form a valid calender date(ignore the leap year)
//sol:months with 31 days(1,3,5,7,8,10,12) and months with 30 days(4,6,9,11) and month with 28 days(2)

/*import java.util.Scanner;
public class Level5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a month");
        int month = sc.nextInt();
        System.out.println("enter a day");
        int day = sc.nextInt();
        boolean isValid = true;
        if (month < 1 || month > 12) {
            isValid = false;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 1 || day > 30) {
                isValid = false;
            }
        } else if (month == 2) {
            if (day < 1 || day > 28) {
                isValid = false;
            }
        } else {
            if (day < 1 || day > 31) {
                isValid = false;
            }
        }
        if (isValid) {
            System.out.println("valid month and day");
        } else {
            System.out.println("invalid day and month");
        }
    }
}*/

//4.take time(hours and minutes) and print the smallest angle between the hour and minute hands
/*import java.util.Scanner;
public class Level5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter hours(0-12):");
        int hour=sc.nextInt();
        System.out.println("enter minutes(0-59):");
        int min=sc.nextInt();
        hour=hour%12;
        double hourangle=(hour*30)+(min*6);//--->360/12=60
        double minangle=min*6;//--->360/60=6
        double angle=Math.abs(hourangle-minangle);
        angle=Math.min(angle,360-angle);
        System.out.println("the smaller angle between hands:" + angle +"degrees");
    }
}*/
//5.take three numbers and check if they are in arithmetic progression
//AP=is a sequence in which the difference between any consecutive terms is constatnt
//example=2,5,8,11.....and  difference=3
/*import java.util.Scanner;
public class Level5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any three numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if((n2-n1)==(n3-n2)){
            System.out.println("numbers are in arithmetic progression: ");
        }
        else{
            System.out.println("numbers are not in arithmetic progression");
        }

    }
}
*/

//6.take three numbers and check if they form geometric progression
//geometric progression of three numbers a,b,c is b/a+c/b or b^2=a*c
/*import java.util.Scanner;
public class Level5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        System.out.println("enter the third side:");
        int c=sc.nextInt();
        if(a!=0 && b!=0 &&(b*b==a*c)){
            System.out.println("given numbers are in geometric progression:");
        }
        else{
            System.out.println("given numbers are not in geometric progression:");
        }
    }

}*/

//7.take a three digit number and check if the sum of the first and last digits are equal to middle digit
//to return 1st digit that is 100s place num/100
//to return 2nd digit that is 10s place --> (num/10)%10
//to return the 3rd digit that is 1s place--num%10

/*import java.util.Scanner;
public class Level5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a three digit number:");
        int num = sc.nextInt();
        if (num < 100 || num > 999) {
            System.out.println("it is not a three digit number,Please enter a valid number");

        } else {
            int first = num / 100;
            int middle = (num / 10) % 10;
            int last = num % 10;
            if (first + last == middle) {
                System.out.println("condition satisfied");
            } else {
                System.out.println("condition not satisfied:");
            }
        }
    }
}*/

//8.take an integer (1-9999) and check if the sum of its digits is greter than the product of its digits

/*import java.util.Scanner;
public class Level5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        if(num<0 || num>9999){
            System.out.println("Inavlid number,please enter a valid number:");
        }
        else{
            int sum=0;
            int product=1;
            int temp=num;
            while(temp>0){
                int digit=temp%10;
                sum+=digit;
                product*=digit;
                temp/=10;
            }
            System.out.println("the sum of the digits is:"+sum);
            System.out.println("the product of the dgits is:"+product);
            if(sum>product){
                System.out.println("the sum of the digits is greater than product of the digits:");
            }
            else{
                System.out.println("the sum of the digits is lesser than product of the digits:");
            }
        }
        sc.close();
    }

}*/

//take two dates (day and month) and determine which one comes first in the calendar
/*import java.util.Scanner;
public class Level5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first month:");
        int m1=sc.nextInt();
        System.out.println("enter second month:");
        int m2=sc.nextInt();
        System.out.println("enter first day");
        int d1=sc.nextInt();
        System.out.println("enter second day");
        int d2=sc.nextInt();
        if(m1<m2){
            System.out.println("first date comes first");
        }
        else if(m1>m2){
            System.out.println("second date comes first");
        }
        else{
            if(d1<d2){
                System.out.println("first date comes first");
            }
            else if(d1>d2){
                System.out.println("second date comes first");
            }
            else{
                System.out.println("both dates comes first");
            }
        }
        sc.close();
    }
}*/

//10.take a year and print the corresponding century(e.g "19 century","20th century")
//sol---> to find the century=year-1/100+1
/*import java.util.Scanner;
public class Level5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a  year:");
        int year=sc.nextInt();
        if(year<=0){
            System.out.println("invalid year,please enter a valid year:");
        }
        else{
            int century=(year-1)/100 +1;
            if(century%10==1 && century%100!=11){
                System.out.println(century+"st century");
            }
            else if(century%10==2 && century%100==12){
                System.out.println(century+"nd century");
            }
            else if(century%10==3 && century%100==3){
                System.out.println(century+"rd century");
            }
            else{
                System.out.println(century+" th century");
            }
        }
        sc.close();
    }

}*/