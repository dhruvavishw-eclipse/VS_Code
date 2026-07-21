import java.util.*;
// This works on the LIFO principle ,that means last in first out.
// This is also called FILO  ,First in last out . 
  

// @--->UNDERFLOW        
//    If stack is empty --> st.pop() && st.peek() operation will gives error;

// @--->OVERFLOW
// If stack is full,usually it is not happens,but if we using stack with array,it will
// so if stack is full then we try to use push elements there is will give STACK OVERFLOW ERROR



  
public class Stacks{





    public static void main(String [] BKP){
        Scanner rcb=new Scanner(System.in);
      
        // Stack<Integer> st=new Stack<>();
        // st.push(14);
        // st.push(18);
        // st.push(17);
        // st.push(1);
        // st.push(33);


        // System.out.println(st.peek());
        // System.out.println(st);
        // st.pop();
        // System.out.println(st);
        // System.out.println("Size of Stack is : "+st.size());




        Stack<Integer> st=new Stack<>();
        System.out.println("Enter how many element you want to insert");
        int n=rcb.nextInt();
        System.out.println("Enter the elements");
        for(int i=1;i<=n;i++){
            int x=rcb.nextInt();
            st.push(x);
        }
        System.out.println(st);

        Stack<Integer> s=new Stack<>();

        while(st.size()>0){
            // int x=st.peek();
            // s.push(x);
            // st.pop();
            s.push(st.pop());
        }
        System.out.println(s);





        //  int idx=2;
        // int x=7;
        // Stack<Integer> rt=new Stack<>();
        // while(st.size()>idx){
        //     rt.push(st.pop());
        // }
        // st.push(x);
        // while(rt.size()>0){
        //     st.push(rt.pop());
        // }
        // System.out.println(st);





    }
    
}