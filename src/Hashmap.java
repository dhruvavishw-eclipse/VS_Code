import java.util.*;

public class Hashmap {
    

    public static void main(String[] args) {
        

        Map<String,Integer> mk= new HashMap<>();

//  01 *** "mk.put()" 
//   For adding elements
   mk.put("mky",22);
   mk.put("RushBoy",23);
   mk.put("Eclipse",22);
   mk.put("MK14",14);
   mk.put("Bot",22);


// 02*** "mk.get()" .
//  This gives the value of key in hashmap.
System.out.println(mk.get("MK14")); // 14
System.out.println (mk.get("Lucifer")); //  null--"Because it is not present".


// .put() is also use for updation of value;
mk.put("RushBoy",18);
System.out.println(mk.get("RushBoy"));//18



// 03 *** ".remove()"  .
// It is use for remove key from hashmap.
System.out.println(mk.remove("Bot")); // 22
System.out.println(mk.remove("Pro")); //  null-- "Because it is not present".



// 04 *** ".containsKey()" .
// It is used to check whether key is present or not.
System.out.println(mk.containsKey("Bot")); //False-- because already removed in 34th line.
System.out.println(mk.containsKey("MK14")); // True  because key exist in hashmap.



// 05 *** ".putIfAbsent()" .
// This method first check whether given key is present in
// hash ,If not found it will insert the key ,and if found then 
// it will not insert 
mk.putIfAbsent("Noob", 249); //will insert
mk.putIfAbsent("MK14", 14); // not insert



// 06 *** ".keySet()" ..
// Get all the keys in hash.
System.out.println(mk.keySet());




// 07 *** ".values" . 
// This gives all values of hash.
System.out.println (mk.values());



// 08 *** ".entrySet" . 
// This will return both key and value together .
System.out.println(mk.entrySet());




for(String key: mk.keySet()){
    // Object key;
    System.out.printf("Age of %s is %d \n ", key ,mk.get(key) );
}


System.out.println();
for(Map.Entry<String, Integer> e:mk.entrySet()){
    System.out.printf("Age of %s and %d \n" , e.getKey(),e.getValue());
}
System.out.println();
   for( var e:mk.entrySet()){
    System.out.printf("Age of %s and %d \n", e.getKey(),e.getValue());
   }


   
    }
}
