import java.util.*;
public class Hash1 {

static class HashMap<K,V>{

public static final int DEFAULT_CAPACITY =4;
public static final float DEFAUL_LOAD_FACTOR=0.75f;


private class Node{
    K key;
    V value;
    Node(K key,V value){
        this.key=key;
        this.value=value;
    }
}

private int n;// the number of entries in map;
private LinkedList<Node>[] buckets;

private void intiBuckets( int N){// N  - capacity/size of buckets array
   buckets = new LinkedList[N];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new LinkedList<>();
        }
}

    private int HashFunc(K key){
        int hc =key.hashCode();
        return (Math.abs(hc))% buckets.length;
    }


    // traverse the ll and looks for a node with key,if found it returns
    // its index otherwise it returns null

private int searchInBuckets( LinkedList<Node> ll ,K key){
     for(int i=0;i<ll.size();i++){
        if(ll.get(i).key==key){
            return i;
        }
     }
     return -1; 
}


public HashMap(){
    intiBuckets();
}

public int size(){// return the number of entries in map
    return n;

}

public void put(K key, V value){
        int bi=HashFunc(key);
         LinkedList<Node> currBucket = buckets[bi];
       int ei= searchInBuckets(currBucket,key);
}

public V get(K key){

}

public V remove(K key){

}




}


    public static void main(String[] args) {


HashMap<String,Integer> mk=new HashMap<>();
HashMap<String,String> mk2=new HashMap<>();




















    //     int ans []= {1,4,5,1,8,5,2,5,2,5,1,4,4,6,8,1,2,5,1,5};

    //     Map<Integer,Integer> freq= new HashMap<>();
    //    for(int ele: ans){
    //       if(!freq.containsKey(ele)){
    //       freq.put(ele, 1);
    //    }
    //    else{
    //      freq.put(ele,freq.get(ele)+1);
    //    }
    // }
    // System.out.println(freq.entrySet());
    // int maxfreq=0,anskey=1;

// for(var a:freq.entrySet()){
// if(a.getValue()>maxfreq){
//     maxfreq=a.getValue();
//     anskey=a.getKey();
// }
// }

// for( var key:freq.keySet()){
//    if(freq.get(key)>maxfreq){
//     maxfreq=freq.get(key);
//     anskey=key;
//    }
// }

// System.out.printf("%d has max freq and it is occurs %d times" ,anskey,maxfreq);

    }
}
