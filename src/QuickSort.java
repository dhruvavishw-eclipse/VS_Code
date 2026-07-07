import java.util.*;
public class QuickSort {



    static void quickSort(int arr[],int st,int end){

        if(st>=end) return;
        int pivIdx=partition( arr , st, end);
        quickSort(arr, 0, pivIdx-1);
        quickSort(arr, pivIdx+1, end);

    }

    static int partition(int [] arr,int st,int end){
        int pivot= arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot) count ++;
        }
        int pivotIdx=st+count;
        swap(arr, st, pivotIdx);
        int i=st,j=end;
        while(i<pivotIdx && j>pivotIdx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;

            if(i< pivotIdx && j>pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;

    }


    static void swap(int arr [],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static void printArr(int arr []){
        for(int val:arr)
        System.out.print(val+",");
    }

    public static void main(String [] BKP){
        Scanner rcb=new Scanner(System.in);
        int arr []={18,7,10,7,45,12,33,17};
        int n=arr.length;

        quickSort(arr, 0, n-1);
        printArr(arr);



        // TIME COMPLEXITY

        // BEST CASE EQUIVALENT TO Omega(n log n)
        // WORST CASE EQUIVALENT TO Big O(n^2)
        // AVERAGE CASE EQUIVALENT TO Theta(n log n)


        // SPACE COMPLEXITY
        // BEST/AVERAGE EQUIVALENT TO (log n) OR O(1) IF IMPLICIT STACK
        //  WORST EQUIVALENT TO O(N)
        //  THIS IS NOT A STABLE ALGO
        //  BUT IT IS INPLACE ALGO

        
        // APPLICATION 
        // * THIS IS VERY GOOD ALGO FOR BOTH TIME AND SPACE COMPLEXITY
        // * THAT'S WHY IT IS USED BUILT IN METHOD Arrays.sort()
        // * QUICK SORT USED IN JAVA LANGUAGE'S BUILT IN SORTING METHOD

    }   
}
