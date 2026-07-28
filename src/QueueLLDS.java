import java.util.*;
public class QueueLLDS {
  
    public static class Node{ // User def data type
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;


        public void add(int x){
            Node temp=new Node(x);
            if(size==0){
               head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
                
            }
            size++;
        }


        public int peek(){
          if(size==0){
            System.out.println("Queue is Empty");
            return -1;
          }
         return  head.val;
        }


        public int remove(){           
          if(size==0){
            System.out.println("Queue is Empty");
            return -1;
          }
          int x=head.val;
          head=head.next;
          size--;
          return x;
        }


        public void display(){
            if(size==0){
                System.out.println("Queue is Empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }


        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

    }

    public static void main(String BKP []){
        queueLL q=new queueLL();
        q.display();
        q.add(3);
        q.add(5);
        q.add(7);
        q.add(11);
        q.add(13);
        q.add(17);
        q.display();
        System.out.println(q.size);
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
