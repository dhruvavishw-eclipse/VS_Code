import java.util.*;
  import java.util.LinkedList;
import java.util.Base64.Decoder;
public class HashMapDS {
         static class MyHashMap<K,V>{
            public static final int DEFAULT_CAPACITY =4;
            public static final float DEFAULT_LOAD_FACTOR =0.75f;

            private class Node{
                K key;
                V value;
                Node(K key, V value){
                    this.key=key;
                    this.value=value;
                }
            }

            private int n;
            private LinkedList<Node> [] buckets;

            private void initBuckets(int N){ // N -size || capacity of buckets array
               buckets=new LinkedList[N];
               for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
               }
            }
            // Traverse the ll and looks for a node with key , if found it returns it's index otherwise it return null
            private int searchInBucket(LinkedList<Node> ll,K key){
                for(int i=0;i<ll.size();i++){
                    if(ll.get(i).key==key){
                        return i;
                    }
                }
               return -1;
            }


            public MyHashMap(){
                initBuckets(DEFAULT_CAPACITY);
            }


            public int capacity(){
                return buckets.length;
            }


            public float load(){
                return (n*1.0f)/buckets.length;
            }

            private void rehash(){
                LinkedList<Node>[] oldBuckets=buckets;
                initBuckets(oldBuckets.length*2);
                n=0;
                for(var bucket: oldBuckets){
                    for(var node : bucket){
                        put(node.key,node.value);
                    }
                }
            }


            private int HashFunc(K key){
                int hc=key.hashCode();
                return (Math.abs(hc)% buckets.length);
            }


            public int size(){ // return the number of entries in map
                return n;
            }

            public void put(K key,V value){  // insert update
                int bi= HashFunc(key);
                LinkedList<Node> currBucket=buckets[bi];
                int ei=searchInBucket(currBucket,key);
                if(ei== -1){  // key doesn't exist,we have to insert a new node
                   Node node=new Node(key,value);
                   currBucket.add(node);
                   n++;
                }
                else{    // Update case
                    Node   currNode= currBucket.get(ei);
                    currNode.value=value;
                }
                if(n>= buckets.length * DEFAULT_LOAD_FACTOR){
                    rehash();
                }
            }

            public V get(K key){
                int bi=HashFunc(key);
                LinkedList<Node> currBucket=buckets[bi];
                int ei=searchInBucket(currBucket,key);
                if(ei!=-1){
                    Node currNode= currBucket.get(ei);
                    return currNode.value;
                }
                  return null;

            }

            public V remove(K key){
                 int bi=HashFunc(key);
                LinkedList<Node> currBucket=buckets[bi];
                int ei=searchInBucket(currBucket,key);
                if(ei!=-1){  // key exists
                  Node currNode= currBucket.get(ei);
                  V val=currNode.value;
                  currBucket.remove(ei);
                  n--;
                  return val;
                }
                // key doest'n exist
                return null;
            }

        }
     
    public static void main(String BKP []){
       MyHashMap<String,Integer> mp=new MyHashMap<>();
       System.out.println("Testing put");
       mp.put("a",1);
       mp.put("b",2);
       mp.put("c",3);
       mp.put("d",4);
       mp.put("e",5);
       mp.put("f",6);
       mp.put("g",7);
      System.out.println("Testing size " + mp.size());
      mp.put("d", 80);
      System.out.println(mp.get("c"));
      System.out.println(mp.get("d"));
      System.out.println(mp.get("a"));
      System.out.println(mp.get("Atlassian"));
      System.out.println(mp.remove("e"));
      System.out.println(mp.remove("e"));
      System.out.println("Capacity "+mp.capacity());
      System.out.println("Load "+mp.load());
    }
}
 