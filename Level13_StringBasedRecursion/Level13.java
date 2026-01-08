//String Based recursion
//1.Reverse a String

/*import java.util.Scanner;
public class Level13 {
    static String revStr(String str){
        if(str.length()==0){
            return str;
        }
        return revStr(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String:");
        String s=sc.nextLine();
        String result=revStr(s);
        System.out.println("the reversed string is:"+result);
    }
}*/

//2.Check if a string is palindrome


/*import java.util.Scanner;
public class Level13 {
    static String isPalindrome(String str){
        if(str.length()==0){
            return str;
        }
        return isPalindrome(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String:");
        String s=sc.nextLine();
        String result=isPalindrome(s);
        if(s.equals(result)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}*/

//3.count vowels in a string

/*import java.util.Scanner;
public class Level13 {
    static int countVowel(String s){
        if(s.length()==0){
            return 0;
        }
        char ch=Character.toLowerCase(s.charAt(0));
        int count=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='o')?1:0;
        return count+countVowel(s.substring(1));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        System.out.println("the vowel count is:"+countVowel(str));
    }
}*/


//4.remove all spaces from a string recursively


/*import java.util.Scanner;
public class Level13 {
    static String removeSpace(String str){
        if(str.length()==0){
            return "";
        }
        if(str.charAt(0)==' '){
            return removeSpace(str.substring(1));
        }
        return str.charAt(0)+removeSpace(str.substring(1));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        System.out.println("after removing spaces:"+removeSpace(s));
    }
}*/


//5.replace all occurrences of a character(say 'a'-->'x')recursively


/*import java.util.Scanner;
public class Level13 {
    static String replaceChar(String s){
        if(s.length()==0){
            return s;
        }
        char ch=s.charAt(0);
        if(ch=='a'){
            return 'x'+replaceChar(s.substring(1));
        }
        else{
            return ch+replaceChar(s.substring(1));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        System.out.println("result:"+replaceChar(str));
    }
}*/

//6.Remove all occurrences of a character from a string recursively


/*import java.util.Scanner;
public class Level13 {
    static String replaceChar(String s,char target){
        if(s.length()==0){
            return s;
        }
        char ch=s.charAt(0);
        if(ch==target){
            return replaceChar(s.substring(1),target);
        }
        else{
            return ch+replaceChar(s.substring(1),target);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        System.out.println("enter a target:");
        char target=sc.next().charAt(0);
        System.out.println("result:"+replaceChar(str,target));
    }
}*/

//7.print all characters of a string one by one recursively


/*import java.util.Scanner;
public class Level13 {
    static void printChar(String str){
        if(str.length()==0){
            return;
        }
        System.out.print(str.charAt(0)+"\n");
        printChar(str.substring(1));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        printChar(s);
    }
}*/

//8.print a string in reverse order recursively



/*import java.util.Scanner;
public class Level13 {
    static void printChar(String str){
        if(str.length()==0){
            return ;
        }
        printChar(str.substring(1));
       System.out.print(str.charAt(0));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        printChar(s);
    }
}*/


//9.convert a string into uppercase

/*import java.util.Scanner;
public class Level13 {
    static String replaceChar(String s){
        if(s.length()==0){
            return s;
        }
        char ch=s.charAt(0);
        if(ch>='a' && ch<='z'){
            return (char)(ch-32)+replaceChar(s.substring(1));
        }
        else{
            return ch+replaceChar(s.substring(1));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        System.out.println("result:"+replaceChar(str));
    }
}*/

//or another method

/*import java.util.Scanner;
public class Level13 {
    static String toUpper(String str){
        if(str.length()==0){
            return str;
        }
        char ch=str.charAt(0);
        char upper=Character.toUpperCase(ch);
        return upper+toUpper(str.substring(1));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        System.out.println("upper case:"+toUpper(s));
    }
}*/

//10.count consonants and vowels separately

//without recursion
/*import java.util.Scanner;
public class Level13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int countCon=0;
        int countVowel=0;
        System.out.println("enter a string: ");
        String str=sc.nextLine();
        for(int i=0;i<str.length()-1;i++) {
            char ch=str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowel++;
            } else {
                countCon++;
            }
        }
        System.out.println("vowel count:"+countVowel);
        System.out.println("consonant count:"+countCon);
    }
}*/

/*import java.util.Scanner;
public class Level13 {
    static void count(String str,int vc,int cc){
        if(str.length()==0){
            System.out.println("Vowels count :"+ vc);
            System.out.println("consonants count :"+cc);
            return;
        }
        char ch=str.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vc++;
        }else{
            cc++;
        }
        count(str.substring(1),vc,cc);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        count(str,0,0);
    }
}*/
