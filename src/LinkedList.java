 import java.util.*;
 public class LinkedList{
 
   
    
    public static class Node{
       int data;
       Node next;
       Node(int data ){
          this.data=data;  
         }
      }

      
      
      static void insertAtEnd(Node head,int val){
         Node temp= new Node(val);
         Node t=head;
         while(t.next!=null){
            t=t.next;
         }
         t.next=temp;
      }


      

     static int length(Node a){
      int count=0;    
      while(a!=null){
         count++;
         a=a.next;
      }
      return count;
     }


     static void printRecurively(Node head){
      if(head==null) return ;
      System.out.print(head.data+" ");
        printRecurively(head.next);
 
     }

    
     static void printLL(Node head){
       Node temp=head;
       while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
       }
     }



    public static void main(String BKP []){
        Node a=new Node(25);
        Node b=new Node(17);
        Node c=new Node(18);
        Node d=new Node(22);
        Node e=new Node(33);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node temp=a;
         // printLL(a);
         // printRecurively(a);
// System.out.println(length(a));
insertAtEnd(a, 100);
printLL(a);


      //   for(int i=1;i<=5;i++){
      //    System.out.print(temp.data+" ");
      //    temp=temp.next;
      //   }
      

      // while(temp!=null){
      //    System.out.println(temp.data);
      //    temp=temp.next;        
      // }



      //   System.out.println(a.next.next.data);// for c=18

    }

 }