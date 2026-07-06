import java.util.*;

public class SelectionSort {
 
     static void selectionSort(int arr []){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
     }

     static void selectionRev(int arr []){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            int max_idx=i;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[max_idx]){
                    max_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max_idx];
            arr[max_idx]=temp;
        }
     }
     

     static void sSD(int arr []){
 
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int max_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[max_idx]){
                    max_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max_idx];
            arr[max_idx]=temp;
        }
     }




    public static void main(String [] BKP){
        Scanner rcb=new Scanner(System.in);
        int arr []={7,3,9,1,4,2,8,0};
        // selectionSort(arr);
        // selectionRev(arr);
        sSD(arr);
        for(int i:arr){
            System.out.print(i+",");
        }

        // TIME COMPLXITY 
        // IN ALL THREE CASE IT GIVES EQUIVALENT O(n^2);


        // SPACE 
        // O(N)
        // THIS IS ALSO A INPLACE ALGO

        // THIS IS AN UNSTABLE ALGO
      
    }   
}
