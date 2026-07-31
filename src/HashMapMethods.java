import java.util.*;
public class HashMapMethods{
     public static void main(String BKP []){
         Map<String,Integer> mp=new HashMap<>();
         // Adding Elements
      mp.put("Ocean", 30);
      mp.put("Meena",200);
      mp.put("Deepansh",2);
      mp.put("Eclipse",3); 
      System.out.println(mp);

     // Getting value of a key from hashmap
      System.out.println(mp.get("Ocean"));
      System.out.println(mp.get("Bhumi"));

      // Changing || updating value of a key in the hashmap
      mp.put("Meena",230);
      System.out.println(mp.get("Meena"));

      // Removing a pair of Key and Value from the HashMap
      System.out.println(mp.remove("Eclipse"));
      System.out.println(mp.remove("GATE")); //If key is not present it gives null
      System.out.println(mp);

      // For checking if key is in the map or not  ?
      System.out.println(mp.containsKey("IISC")); // False
      System.out.println(mp.containsKey("Deepansh"));  // True

      // Adding a new entry only if the new key dose not exist yet
      mp.putIfAbsent("ATLASSIAN",80); // Will add in mp
      System.out.println(mp);
      mp.putIfAbsent("Ocean",74); // Ocean exist with 30 , so this will not add or modify previous
      System.out.println(mp);

      // Get all the key in the HashMap
      System.out.println(mp.keySet());

      // Get all the value present in HashMap
      System.out.println(mp.values());

      // Get all the entries in HashMap ,Key-Value
      System.out.println(mp.entrySet());
      
      // Traversing all entries in HashMap
      for(String key:mp.keySet()){
        System.out.printf("Value of %s is %d\n", key,mp.get(key));
      }
    System.out.println();
      for(Map.Entry<String,Integer> e:mp.entrySet()){
        System.out.printf("Value of %s is %d\n",e.getKey(), e.getValue());
      }
     System.out.println();
      for(var e:mp.entrySet()){
        System.out.printf("Value of %s is %d\n", e.getKey(), e.getValue());
      }

      

     }
}