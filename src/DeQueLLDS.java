import java.util.*;
public class DeQueLLDS {

    // public static class Node{
    //     int val;
    //     Node next;
    //     Node previous;

    //     Node(int val){
    //         this.val=val;
    //     }
    // }

    // public static class DequeLL{
    //     Node head=null;
    //     Node tail=null;
    //     int size=0;

    //    public void print(){
        //     if(size==0){
        //        System.out.println("Deque is Empty!");
        //        return;
        //     }

        //       Node temp=head;
        //       while(temp!=null){
        //         System.out.println(temp.val+" ");
        //         temp=temp.next;
        //       }
        // }


        // public void add(int x){
        //     Node temp=new Node(x);
        //    if(size==0){
        //     head=tail=temp;
        //    }
        //    else{
        //     temp=tail.next;
        //     tail=temp;
            
        //    }
        // }

    // }



    public static void main(String BKP []){
     Deque<Integer> dq=new ArrayDeque<>();
     dq.addFirst(1);
     dq.addFirst(2);
     dq.addLast(3);
     dq.addLast(4);
     dq.addLast(5);
     dq.addLast(6);
     dq.addLast(7);
     System.out.println(dq);
     System.out.println(dq.peek());
     System.out.println(dq.peekLast());
     System.out.println(dq.peekFirst());
     System.out.println(dq.poll());
     System.out.println(dq);
     System.out.println(dq.pollLast());
     System.out.println(dq);
     System.out.println(dq.pollFirst());
     System.out.println(dq);
    }
    
}
