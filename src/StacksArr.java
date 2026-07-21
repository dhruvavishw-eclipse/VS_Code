import java.util.*;
public class StacksArr {

    // IN THIS STACK CAN OVERFLOW BECAUSE OF ARRAY SIZE
    // IT HAS ALSO CONS WHEN WE GIVES ARRAY BIGGR SIZE AND USED ONLY SOME INDICS,
    // REST SPACE OR MEMORY IS WASTE THAT IS FROM CONTIGUOUS MEMORY.
    // FOR DISPLAY IT TAK O(1) SPACE.

    public static class Stack{
        //Gives the size of an array according you || Question
        int arr []=new int [5];
        int idx=0;
        void push(int x){
            if(isfull()){
                System.out.println("Stack is full");
                return;
            }
           arr[idx]=x;
           idx++;
        }
        
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
             if(idx==0){
                 System.out.println("Stack is empty");
                 return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;       
        }

        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
           return idx==0;
        }
        
        boolean isfull(){
            if(idx==arr.length) return true;
            else return false;
        }
       
        int capacity(){
            return arr.length;
        }
    }

    public static void main(String [] BKP){
     Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();
        System.out.println();
        System.out.println("Size of Stack "+st.size());
        st.pop();
        st.display();
         System.out.print("Size of Stack "+st.size());
        System.out.println(st.peek());
         st.push(10);
          st.push(18);
         st.display();
         System.out.println(st.isEmpty());
         System.out.println(st.isfull());
    }
}
