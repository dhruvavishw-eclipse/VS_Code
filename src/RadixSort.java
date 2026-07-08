import java.util.*;
public class RadixSort {

    // Digit by digit sorting,place value/positon of dig in a number
    // WRITE THIS PROMPT ON CLUADE
    // Explain how Radix sort works using live artifact
    // This prompt will visualize how Radix Sort works



      
    static void countSort(int arr [],int place){
        int n=arr.length;
        int [] output=new int [n];
        int max =findMax(arr);
        int count []=new int [10];
        for(int i=0;i<n;i++)    // Make freq arr
        count[(arr[i]/place)%10]++;
     /*
     Make prefix sum array of count array
     */
        for(int i=1;i<count.length;i++)
            count[i]+=count[i-1];

     // Find the index of each element in the original array
    //  and put it in output array

        for(int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
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
    
    
    static void radixSort(int arr []){

        int max=findMax(arr);
        // Then apply counting sort to sort elements based on place value
        for(int place=1;max/place>0;place*=10)
         countSort(arr,place);

    }



    public static void main(String BKP []){
        Scanner rcb= new Scanner(System.in);
        int arr []={269,500,1121,11,0,9230,1,18};
        radixSort(arr);
        for(int val:arr){
            System.out.print(val+",");
        }

        // TIME COMPLEXITY

        // d(n+k) {Here k=10} so  ---> d(n)

        // SPACE COMPLEXITY
        //   EQUILVALENT TO O(n)

    }
}
