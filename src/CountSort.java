import java.util.*;
public class CountSort {

    static void basicCountSort(int arr []){
        int n=arr.length;
// Find the largest element in the array
     int max=Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
        if(arr[i]>max)
        max=arr[i];
     }
 // Now we making Freq arr ,size of max+1
     int freq []= new int [max+1];    
    for(int i=0;i<n;i++){
        freq[arr[i]]++;
    }
    int k=0;
    for(int i=0;i<freq.length;i++){
        for(int j=0;j<freq[i];j++){
            arr[k++]=i;
        }

    }
    }




    static void countSort(int arr []){
        int n=arr.length;
        int [] output=new int [n];
        int max =findMax(arr);
        int count []=new int [max+1];
        for(int i=0;i<n;i++)    // Make freq arr
        count[arr[i]]++;
     /*
     Make prefix sum array of count array
     */
        for(int i=1;i<count.length;i++)
            count[i]+=count[i-1];

     // Find the index of each element in the original array
    //  and put it in output array

        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }

     // Copy all elements of output to arr

       for(int i=0;i<n;i++){
        arr[i]=output[i];
       }
        
    }

 

      static int findMax(int arr []){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
      }


    public static void main(String [] BKP){
      Scanner rcb=new Scanner(System.in);
      int arr []={5,18,0,17,33,1,45,3,12};
    //   basicCountSort(arr);
    countSort(arr);
      for(int val:arr){
        System.out.print(val+",");
      }



    //   TIME COMPLEXITY

    //   WORST CASE  O(n+ k) HERE K IS THE MAX ELEMENT IN ARRAY
    //   AVERAGE CASE Theta (n+k)
    //   BEST CASE EQUIVALENT TO Omega (n)


    }
}
