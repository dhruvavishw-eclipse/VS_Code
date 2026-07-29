import java.util.*;
public class DeQueLLDS {

    public static class Node{
        int val;
        Node next;
        Node previous;

        Node(int val){
            this.val=val;
        }
    }

    public static class DequeLL{
        Node head=null;
        Node tail=null;
        int size=0;

       public void print(){
            if(size==0){
               System.out.println("Deque is Empty!");
               return;
            }

              Node temp=head;
              while(temp!=null){
                System.out.println(temp.val+" ");
                temp=temp.next;
              }
        }


        public void add(int x){
            Node temp=new Node(x);
           if(size==0){
            head=tail=temp;
           }
           else{
            temp=tail.next;
            tail=temp;
            
           }
        }

    }



    public static void main(String BKP []){

    }
    
}
