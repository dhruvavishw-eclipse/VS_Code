import java.util.*;
import java.util.ArrayList;

public class List {
    public static void main(String BKP []){
        //Wrapper  Classes

        // Integer i= Integer.valueOf(4);
        // System.out.println(i);
        // Double d= Double.valueOf(81.6);
        // System.out.println(d);

        ArrayList<Integer> l1= new ArrayList<>();

        // Add new Element 
        l1.add(5);
        l1.add(12);
        l1.add(17);
        l1.add(18);

        // // Get an element at Index i
        // System.out.println(l1.get(1));

        // // For Printing values with loop
        // for(int i=0;i<l1.size();i++){
        //     System.out.println(l1.get(i));
        // }

        // Print ArrayList directly 
        System.out.println(l1);


        // Adding element at some index
        l1.add(1,9230);
        System.out.println(l1);


        // Changing || Modifying the elements at index i
        l1.set(1,49);
        System.out.println(l1);


        // Removing the elements at index i
        l1.remove(1);
        System.out.println(l1);


        // Removing an element e whose value given
        l1.remove(Integer.valueOf(17));
        System.out.println(l1);


        // Checking element exists or not 
       boolean ans= l1.contains(Integer.valueOf(18));
        System.out.println(ans);


        // IF you don't specify class, you can
        // put anything inside l
        ArrayList l= new ArrayList ();
        l.add("RCB");
        l.add(2);
        l.add(2.57);
        l.add(true);
        System.out.println(l);

    }
}
