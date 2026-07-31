import java.util.*;
public class HashMapQ {

    static void freq(int arr []){
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i: arr){
            if(!mp.containsKey(i)){
                mp.put(i, 1);
            }
            else{
                mp.put(i,mp.get(i)+1);
            }
        }
         int max=0,ansKey=-1;

    //    for(var el: mp.entrySet()){
    //     if(el.getValue()>max){
    //         max=el.getValue();
    //         ansKey=el.getKey();
    //     }
    //    }


        for(var key:mp.keySet()){
           if(mp.get(key)>max){
               max=mp.get(key);
               ansKey=key;
           }
        }

        System.out.println(ansKey);
        System.out.println(mp.entrySet());
    }

    public static void main(String BKP []){
        int arr []={3,4,2,4,1,5,3,3,4,3,2,4,4,3,2,3,};   
          freq(arr);
    }
}
