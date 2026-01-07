//Number-Based Recursive Thinking
//1.count the number of digits in a number

/*import java.util.Scanner;
public class Level12 {
    static int CountDigits(int n){
        if(n==0){
            return 0;
        }
        return 1+CountDigits(n/10);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("the count of digits is 1");
        }
        else{
            int result=CountDigits(n);
            System.out.println("the count of digits is:"+result);
        }
    }
}*/

//2.reverse a number recursively

/*import java.util.Scanner;
public class Level12 {
    static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        return reverse(n/10,rev*10+(n%10));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int result=reverse(n,0);
        System.out.println("the reversed number is:"+result);
    }
}*/

//3.check if a number is palindrome using recursion

/*import java.util.Scanner;
public class Level12 {
    static int palindrome(int n,int rev){
        if(n==0){
            return rev;
        }
        return palindrome(n/10,rev*10+(n%10));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int result=palindrome(n,0);
        if(result==n){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}*/

//4.find product of digits of a number

/*import java.util.Scanner;
public class Level12 {
    static int proDigits(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*proDigits(n/10);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int result=proDigits(n);
        System.out.println("the product of the digits is:"+result);
        }
    }*/

//5.find gcd(HCF) of two numbers recursively


/*import java.util.Scanner;
public class Level12 {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int n1=sc.nextInt();
        System.out.println("enter the second number:");
        int n2=sc.nextInt();
        int result=gcd(n1,n2);
        System.out.println("the gcd of two numbers is:"+result);
    }
}*/

//6.convert a number into binary

/*import java.util.Scanner;
public class Level12 {
    static void toBinary(int n){
        if(n==0){
            return;
        }
        toBinary(n/2);
        System.out.print(n%2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Binary=0");
        }
        else{
            System.out.println("Binary=");
            toBinary(n);
        }
    }
}*/

//7.print digits of a number in words recursively(e.g 123-->one two three)


/*import java.util.Scanner;
public class Level12 {
    static void printWords(int n){
        String[] words={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n==0){
            return ;
        }
        printWords(n/10);
        System.out.print(words[n%10]+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("zero");
        }
        else{
            printWords(n);
        }
    }
}*/

//8.calculate the sum of first n even numbers rcursively

/*import java.util.Scanner;
public class Level12 {
    static int sumEven(int n){
        if(n==0){
            return 0;
        }
        return 2*n+sumEven(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        int result=sumEven(n);
        System.out.println("the sum of even numbers is:"+result);
    }
}*/

//9.print the sum of n odd numbers

/*import java.util.Scanner;
public class Level12 {
    static int oddSum(int n){
        if(n==0){
            return 0;
        }
        return (2*n-1)+oddSum(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        int result=oddSum(n);
        System.out.println("the odd sum is:"+result);
    }
}*/


//10.find nCr (combination formula) recursively using pascals relation


/*import java.util.Scanner;
public class Level12 {
    static int nCr(int n,int r){
        if(r==0 || r==n){
            return 1;
        }
        return nCr(n-1,r-1)+nCr(n-1,r);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        System.out.println("enter r:");
        int r=sc.nextInt();
        int result=nCr(n,r);
        System.out.println("nCr="+result);
    }
}*/


