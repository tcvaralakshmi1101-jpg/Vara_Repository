import java.util.Stack;
public class StackUsingArray {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        //st.push(10);
        //st.push(20);
       // st.push(30);
        System.out.println("first element is "+st.push(10));
        System.out.println("second element is "+st.push(20));
        System.out.println("third element is "+st.push(30));
        System.out.println("fourth" +
                " element is "+st.push(40));
        System.out.println("the peek element is:"+st.peek());
        System.out.println("pop the element:"+st.pop());
        System.out.println("is it empty:"+st.isEmpty());
    }

}
