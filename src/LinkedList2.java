import java.util.*;

// import org.w3c.dom.Node;

public class LinkedList2 {

public static class Node{
      int data;
      Node next;
      Node(int data ){
          this.data=data;  
      }
     }



     public static class linkedList{
        Node head=null;
        Node tail=null;
        int size=0;
        
        void insertAtEnd(int val){
         Node temp=new Node(val);
         if(head==null){
            head=temp;
            // tail=temp;
         }
         else{
            tail.next=temp;
            // tail=temp;
         }
         tail=temp;
         size++;
        }
        




        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){ // Empty List
                head=tail=temp;
            }
            else{ // Non empty list
                temp.next=head;
                head=temp;
            }     
           size++;
        }


        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("Wrong Input");
                return;
            }
            
            for(int  i=1;i<idx;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }


        int getElementAt(int idx){  
            if(idx<0 || idx>size){
                System.out.println("Wrong Input");
                return -1;
            }
            Node temp= head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }





        void deleteAt(int idx){
            Node temp=head;
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }

        
        void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }


        // int length(){
        //     Node temp=head;
        //     int count =0;
        //     while(temp!=null){
        //         count++;
        //         temp=temp.next;
        //     }
        //     return count;
        // }


     }






    public static void main(String [] BKP){
        linkedList l1=new linkedList();
        l1.insertAtEnd(7);
        l1.insertAtEnd(10);
        l1.insertAtEnd(17);
        l1.insertAtEnd(18);


    // l1.print();
    
    //  System.out.println(l1.length());
  
    // l1.insertAtHead(333);
    
    // System.out.println(l1.length());
    
    // l1.insertAt(0, 45);

    // System.out.println(l1.getElementAt(8));
    // System.out.println(l1.size);
    l1.deleteAt(0);
    l1.print();

    }
    
}
