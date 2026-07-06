import java.util.*;
public class InsertionSort {


    static void insertionSort(int arr []){
      int n=arr.length;
      for(int i=1;i<n;i++){
       int j=i;
       while( j>0 && arr[j]<arr[j-1]){
        int temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
        j--;
       }
      }

    }


    static void insertionSortDes(int arr []){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
// Just change the Less than sign to greater
// than sign in Ascending algo HERE ---> "arr[j]<arr[j-1]"
            while(j>0 && arr[j]>arr[j-1]){
                int temp=arr[j];
                arr [j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
     

    public static void main(String [] BKP){
        Scanner rcb=new Scanner (System.in);
        int arr []={7,6,2,9,4,0,1,3,8};
       insertionSort(arr);
    // insertionSortDes(arr);
       for(int i:arr){
        System.out.print(i+",");
       }

    //    TIME COMPLEXITY

    //    BEST CASE Omega(n)
    //    WORST CASE Big O(n^2)
    //    AVERAG CASE Theta (n^2)

    //    SPACE COMPLEXITY
    //    O(n)

    //    THIS IS ALSO A STABLE ALGO

    //    APPLICATION
    //    * Number of elements are less.
    //    * Or one part of the array is sorted.
       



    }   
}
