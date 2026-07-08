import java.util.*;
public class BucketSort {


    static void bucketSort(float [] arr ){
        int n=arr.length;
        // Buckets
         ArrayList<Float> [] buckets= new ArrayList[n];
         // Create empty buckets
         for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
         }

         // Add elements into our buckets
         for(int i=0;i<n;i++){
            int bucketIdx=(int) arr[i]*n;
            buckets[bucketIdx].add(arr[i]);
         }

         // Sort each bucket individually
         for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
         }

         // Merge all buckets to get final sorted array
         int index=0;
         for(int i=0;i<buckets.length;i++){
            ArrayList<Float> currBucket=buckets[i];
              for(int j=0;j<currBucket.size();j++){
                arr[index++]=currBucket.get(j);
              }
         }

    }


  public static void main(String BKP []){
    float arr []={0.27f,0.17f,0.01f,0.33f,0.49f,0.1f,0.7f,0.18f};

    bucketSort(arr);
    for(float val:arr){
        System.out.print(val+",");
    }


    // TIME COMPLEXITY

    //  BASE CASE (n+k)
    //  WORST CASE (n^2)
  }    
}
