import java.util.*;
import java.util.LinkedList;
public class Queue1 {
    
   static void print(Queue<Integer>q){{
       Queue<Integer> q2=new ArrayDeque<>();

        while(q.size()>0){
        System.out.print(q.peek()+" ");
            q2.add(q.peek());
        q.remove(q.peek());    
    }
    System.out.println(q2);
   }

   }

    public static void main(String []BKP){
        Queue<Integer> q=new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(5);
        q.add(11);
        q.add(10);
        q.add(7);
        q.add(2);
        // System.out.println(q.size());
        // System.out.println(q);
        // q.remove(); //  || q.poll();
        // System.out.println(q.peek()); // || System.out.println(q.element());
        // System.out.println(q);
        // q.remove();
        // System.out.println(q);
        // System.out.println(q.size());
        print(q);
   }
}