import java.util.*;

public class StackLinkedList {
   
    // UNLIMITED SIZE
    // IT CAN TAKE EXTRA SPACE BECAUSE OF 2||3 NODES .
    // DISPLAY CAN PRINT IN REVERSE AND ALSO USE EXTRA SPACE 

       public static class Node{
          int val;
          Node next;
          Node(int val){
            this.val=val;
          }
       }


       public static class LLStack{
           Node head=null;
           int size=0;
           void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
           }
           

            int size(){
                return size;
            }

            int pop(){
                if(head==null){
                    System.out.print("Stack is Empty");
                    return -1;
                }
                int x=head.val;
                head=head.next;
                size--;
                return x;
            }


            int peek(){
                if(head==null){
                    System.out.println("Stack is empty");
                    return -1;
                }
                return head.val;
            }


             void displayRec(Node h){
                if(h==null) return;
                displayRec(h.next);
                System.out.print(h.val+" ");

             }


            void display(){
              displayRec(head);
              System.out.println();
            }

            void displayRev(){
               Node temp=head;
               while(temp!=null){
                   System.out.print(temp.val+" ");
                   temp=temp.next;
                }
                System.out.println();
            }

         
            boolean isEmpty(){
               
                return size==0;
            }


        }


    public static void main(String [] BKP){
        LLStack st=new LLStack();
        st.push(17);
        st.push(7);
        st.push(23);
       
        System.out.println(st.peek());
        st.display();
        st.push(33);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.displayRev();
    }
}
