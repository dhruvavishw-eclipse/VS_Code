import java.util.*;
// import java.util.Stack;

public class Stacks2 {


    static void printRevRec(Stack<Integer> st){
         if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top + " ");
        printRevRec(st);
        st.push(top);
    }


    static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }


    static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top=st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }


    public static void main(String [] BKP){

       Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // System.out.print(st);
    

        // printRevRec(st);
        // pushAtBottom(st,80);
        reverse(st);
        System.out.print(st);
    }
}
