//1.take a 3 digit number and check if all digits are distnict

/*import java.util.Scanner;
public class Level3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a three digit number:");
        int num=sc.nextInt();
        if(num<=100 || num=>999){
            System.out.println("not a three digit number");
        }
        else{
            int d1=num/100 ;//returns the hundred position
            int d2=(num/10)%10;  //return the tens position
            int d3=num%10;//return the ones position
            if(d1!=d2 && d2!=d3 && d3!=d1){
                System.out.println("digits are different");
            }
            else{
                System.out.println("digits are same");
            }
        }
    }
}*/

//2.take a 4 digit number and check if the first and last digit are same or not
//we check first digit like d=num/1000;
//we check the last digit as d=num%10

/*import java.util.Scanner;
public class Level3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a four digit number:");
        int num=sc.nextInt();
        if(num<=1000 || num>=9999){
            System.out.println("entered number is not a 4 digit number");
        }
        else{
            int first=num/1000;
            int last=num%10;
            if(first==last){
                System.out.println("last and first digits are same");
            }
            else{
                System.out.println("digits are different");
            }
        }
    }
}*/

//3.check weather a given integer is single digit ,double digit and multi digit

/*import java.util.Scanner;
public class Level3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any digit:");
        int num=sc.nextInt();
        if(num>=0 && num<=9){
            System.out.println("enter number is single digit number");
        }
        else if(num>=10 && num<=99){
            System.out.println("given number is double digit number");
        }
        else{
            System.out.println("given number is multi digit number");
        }
    }
}*/

//4.check if a number is multiple 7 and ends with 7
//to check a number is mutiple of 7 and ends with 7

/*import java.util.Scanner;
public class Level3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num%7==0 && num%10==7){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }


    }
}*/

//5.take 2 coordinators x and y check where the point lies on
/*import java.util.Scanner;
public class Level3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first point:");
        int x=sc.nextInt();
        System.out.println("enter second point:");
        int y=sc.nextInt();
        if(x==0 && y==0){
            System.out.println("origin");
        }
        else if(y==0){
            System.out.println("x-axis");
        }
        else if(x==0){
            System.out.println("y-axis");
        }
        else if(x>0 && y>0){
            System.out.println("1st quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("2nd Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("3rd Quadrants");
        }
        else{
            System.out.println("4th Quadrent");
        }
    }
}*/

//6.check weather an amount can be evenly divided into 2000 and 500 and 100 currencybnotes
//to check if they divided are not we are going to find out gcd(greatest common diviser)\
//in this program the gcd is 100

/*import java.util.Scanner;
public class Level3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount:");
        int amount=sc.nextInt();
        if(amount%100==0){
            System.out.println("amount can be evenly divided by 2000,500 and 100:");
        }
        else{
            System.out.println("not divided");
        }
    }
}*/
//7.check if a number lies on with range of [100,999]


/*import java.util.Scanner;
public class Level3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        if(num>=100 && num<=999){
            System.out.println("given number is lies between range of [100,999]");
        }
        else{
            System.out.println("given number is do not present");
        }
    }
}*/

//8.take two angles and compute the third angle
//we know the third angle is 180-sum of the first 2 angles

/*import java.util.Scanner;
public class Level3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first angle:");
        int a=sc.nextInt();
        System.out.println("enter the second angle:");
        int b=sc.nextInt();
        int c=180-(a+b);
        System.out.println("third angle is:"+c);
    }
}*/

//9.check weather a given number is perfect square without using squaroot

/*import java.util.Scanner;
public class Level3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int i=1;
        while(i*i<=n){
            if(i*i==n){
                System.out.println("perfect square");
                return;
            }
            i++;
        }
        System.out.println("not a perfect square");
    }
}*/
