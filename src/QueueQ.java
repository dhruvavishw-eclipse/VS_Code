import java.util.*;
import java.util.LinkedList;
public class QueueQ {

     static void reverseK(Queue<Integer> q,int k){
           Stack<Integer> st=new Stack<>();
        //    Queue<Integer> q2=new LinkedList<>();
           for(int i=0;i<k;i++){
            st.push(q.remove());
           }
        //    System.out.println(q);
        //    System.out.println(st);
           for(int i=0;i<k;i++){
            q.add(st.pop());
           }
        //    System.out.print(q);
           for(int  i=0;i<q.size()-k;i++){
            //   int x=q.remove();
            //   q.add(x);
              q.add(q.remove());
           }
           System.out.print(q);
     }
    
    public static void main(String [] BKP){
        Queue<Integer> q=new LinkedList<>();
        // int k=4;

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
       reverseK(q, 7);
    }
}
