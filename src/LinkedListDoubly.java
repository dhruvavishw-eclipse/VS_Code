import java.util.*;

public class LinkedListDoubly {

  public static class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
      this.val = val;
    }
  }

  public static void print(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
  }


  static void printTail(Node tail) {
    Node temp = tail;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.prev;
    }
  }


  static void printRandom(Node random) {
    Node temp = random;
    while (temp.prev != null) {
      temp = temp.prev;
    }
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
  }


  static Node insertAtHead(Node head, int x) {
    Node t = new Node(x);
    t.next = head;
    head.prev = t;
    head = t;
    return head;
  }


  public static void insetAtTail(Node head, int x) {
    Node n = new Node(x);
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }

    temp.next = n;
    n.prev = temp;

  }


  public static void insertAtIdx(Node head, int idx, int x) {
    Node n = new Node(x);
    Node temp = head;
    for (int i = 0; i < idx - 1; i++) {
      temp = temp.next;
    }
    // r pointing the node temp.next ;
    Node r = temp.next;
    // Below line joining temp.next to New node that is made for new val for given
    // idx
    temp.next = n;
    // Below previous of new node is joining to temp
    n.prev = temp;
    // now joining new node to rest of the linkedList
    n.next = r;
  }


  public static Node deleteAtIdx(Node head, int idx) {
    if(head==null) return null;
    if (idx == 0) {
      head = head.next;
      if(head!=null)
      head.prev = null;
      return head;
    }
    Node temp = head;

    for (int i = 1; i < idx; i++) {
      temp = temp.next;
    }
    Node del = temp.next;
    temp.next = del.next;
    if(del.next!=null)
    del.next.prev=temp;

    return head;
  }


   static boolean palindrome(Node head){
    if(head==null) return false;
     Node temp1=head;
     Node tempTail=head;
     while(tempTail.next!=null){
      tempTail=tempTail.next;
     }
     while(temp1!=tempTail){
       if(temp1.val!=tempTail.val){
        return false;
       }
       else{
        temp1=temp1.next;
        tempTail=tempTail.prev;
       }
     }
     return true;
   }


   static void twoSum(Node head,int target){
    Node temp=head;
    Node tempTail=head;
    while(tempTail.next!=null){
      tempTail=tempTail.next;
    }
    //This is for LinkedList where node.val are not in descending order

    while(temp.val<tempTail.val){
      if(temp.val+tempTail.val==target){
        System.out.println(temp.val + " "+ tempTail.val);
        break;
      }
      else if(temp.val+tempTail.val>target){
            tempTail=tempTail.prev;           
      }
      else if  (temp.val+tempTail.val<target){
        temp=temp.next;
      }
      
      else{
       System.out.println("Target not found");
         return;
      }
      
    }
         
   }




  public static void main(String BKP[]) {

    Node a = new Node(7);
    Node b = new Node(10);
    Node c = new Node(17);
    Node d = new Node(29);
    Node e = new Node(40);

    a.prev = null;
    a.next = b;
    b.prev = a;
    b.next = c;
    c.prev = b;
    c.next = d;
    d.prev = c;
    d.next = e;
    e.prev = d;
    e.next = null;

    // print(a);
    // printTail(e);
    // printRandom(c);
    // Node newHead=insertAtHead(a, 40);
    // insetAtTail(a, 180);
    // insertAtIdx(a, 1, 333);
    // deleteAtIdx(a, 0);
    // System.out.println(palindrome(a));
    // print(a);
    twoSum(a, 17);
  }
}
