import java.util.*;
public class Hashset {
  
    static int maxNumOnTable(int arr []){
       HashSet<Integer> hs=new HashSet<>();
       int max=0;
       for(int i=0;i<arr.length;i++){
        int num=arr[i];
        if(hs.contains(num)){
            hs.remove(num);
        }
        else{
            hs.add(num);
            max=Math.max(max,hs.size());
        }
       }
       return max;
    }

    public static void main(String BKP []){

        int arr []={2,1,1,3,2,3};
        // HashSet<String> hs=new HashSet<>();
        // hs.add("Alienware");
        // hs.add("Eclipse");
        // hs.add("Chiron");
        // hs.add("Zonda");
        // hs.add("Hyuara");
        // hs.add("Alienware");
        // System.out.println(hs);

        // System.out.println(hs.contains("Chiron")); // True;

        // System.out.println(hs.size()); // 5

        // hs.remove("Eclipse");

        // System.out.println(hs);  // [Hyuara, Chiron, Alienware, Zonda]


        // for(String s:hs){
        //     System.out.println(s +" ");
        // }  


        System.out.println(maxNumOnTable(arr));
    }
}
