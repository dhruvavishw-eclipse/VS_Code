import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class List1 {

static void reverseList(ArrayList<Integer> list){
     int i=0,j=list.size()-1;

     while(i<j){
        Integer temp= Integer.valueOf(list.get(i));
        list.set(i, list.get(j));
        list.set(j,temp);
        i++;
        j--;
     }
}

    public static void main(String[] BKP) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
         list.add(5);
          list.add(73);
           list.add(11);
            list.add(43);
             list.add(17);
              list.add(79);
               list.add(23);

               ArrayList<String> l1=new ArrayList<>();
               l1.add("Welcome");
               l1.add("To");
               l1.add("Google");
               Collections.sort(l1);
               System.out.println(l1);
               Collections.sort(l1, Collections.reverseOrder());
               System.out.println(l1); 

//    System.out.println("Original List "+ list);
// //    reverseList(list);
// Collections.reverse(list);
//    System.out.println("Reverse List "+ list);
//    Collections.sort(list);
//    System.out.println("Ascending Order "+ list);
//    Collections.sort(list, Collections.reverseOrder());
//     System.out.println("Descending Order "+ list);


    }
}
