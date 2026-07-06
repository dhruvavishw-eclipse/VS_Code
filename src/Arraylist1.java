import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Arraylist1 {

static void reverseArrlist(ArrayList<Integer> l){
          int i=0,j=l.size()-1;
          while(i<j){
            int temp=Integer.valueOf(l.get(i));
            l.set(i,l.get(j));
            l.set(j,temp);
            i++;
            j--;
          }
}

    public static void main(Strings[] args) {
        
       ArrayList<Integer> l=new ArrayList<>();
       l.add(9);
       l.add(64);
       l.add(68);
       l.add(28);
       l.add(27);
       l.add(1);
       System.out.println("Original List "+ l);
    //    reverseArrlist(l);
    Collections.reverse(l);
       System.out.println("Reversed List "+ l);
Collections.sort(l);
System.out.println("Ascending Order"+ l);
Collections.sort(l,Collections.reverseOrder());
System.out.println("Desc Order"+ l);




    }
}
