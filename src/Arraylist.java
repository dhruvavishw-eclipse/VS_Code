import java.util.ArrayList;


public class Arraylist {
    





    public static void main(Strings[] args) {
        
     ArrayList<Integer> l1= new ArrayList<>();
      l1.add(27);
      l1.add(06);
      l1.add(49);
      l1.add(53);
      l1.add(35);
        //   System.out.println(l1.get(0));

       for(int i=0;i<l1.size();i++){
        System.out.println(l1.get(i));
       }
       l1.add(3,55);

      System.out.println(l1);

        l1.set(1, 07);
System.out.println(l1);

l1.remove(1);
System.out.println(l1);

l1.remove(Integer.valueOf(55));
System.out.println(l1);
    }
}
