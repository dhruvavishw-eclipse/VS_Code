import java.util.*;
public class LinkedListCircular {
   
     public static class Node{
        // Node prev;
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
     }

     static void print(Node head){      
        Node temp=head.next;
        System.out.print(head.val+" ");
        while(temp!=head){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }      
     }
  
  
      static Node removeHead(Node head){
        Node temp=head;
     while(temp.next!=head){
        temp=temp.next;
        }
        temp.next=temp.next.next;
        head=temp.next;
          return head;
      }


    public static void main(String BKP[]){
    
        Node a=new Node(25);
        Node b=new Node(17);
        Node c=new Node(18);
        Node d=new Node(22);
        Node e=new Node(33);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;
      Node x=  removeHead(a);
     print(x);

    }
}
