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



    public static void main(String BKP[]) {
        Scanner rcb = new Scanner(System.in);
      
        // int arr[] = { 0, 5, 1, 9, 0, 3, 7 };
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


        String [] s={"mango","banana","apple","dragonfruit"};
        sortFruits(s);
        for(String ans:s){
            System.out.print(ans+",");
        }

    }
}
