import java.util.*;
public class SortingQ {


    static void sortFruits(String s []){
       int n=s.length;
       for(int i=0;i<n-1;i++){
        int min_idx=i;
        for(int j=i+1;j<n;j++){
         if(s[j].compareTo(s[min_idx]) <0){
            min_idx=j;
         }
        }
        String temp=s[i];
        s[i]=s[min_idx];
        s[min_idx]=temp;
       }

    }

    static void sortNegPos(int arr []){
        int n=arr.length;
        int st=0,end=n-1;
      
        while(st<end){
            if(arr[st] >0 && arr[end]<0){
                int temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                st++;
                end--;
            }
            if(arr[st]<0)
            st++;

            if(arr[end]>0)
            end--;
        }
        
    }

    static void swapSort(int arr []){
        int n=arr.length;
        int x=-1,y=-1;
        if(n<=1) return;

        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
        

        }
 
    static void sort012(int arr []){
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid, low);
                mid++;
                low++;
            }
           else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }
        
         
    }    

    static void swap(int arr [],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void main(String BKP[]) {
        Scanner rcb = new Scanner(System.in);
        int arr []={20,-21,18,-17,1,-18,-5,33,-49};
        // int arr[]={1,2,1,0,1,0,2,0,1,1,0,2,1};
      
        // int arr[] = { 0, 5, 1, 9, 0, 3, 7 };
        // int arr[]={3,4,6,12,8,9,7,10};
        // int arr []={10,5,6,7,8,9,3};
        // int arr []={2,1};
        // int n = arr.length;
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         if (arr[j] == 0 && arr[j + 1] != 0) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        // for (int val : arr) {
        //     System.out.print(val + ",");
        // }




        // String [] s={"mango","banana","apple","dragonfruit"};
        // sortFruits(s);
        // for(String ans:s){
        //     System.out.print(ans+",");
        // }

    //    swapSort(arr);
   sortNegPos(arr);
        // sort012(arr);
       for(int val:arr){
        System.out.print(val+",");
       }

    }
}
