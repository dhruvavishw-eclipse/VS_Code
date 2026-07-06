
import java.util.*;

public class RecursionArray {

    static void PrintArray(int arr [], int index){
           if(index==arr.length)
           return;

           System.out.println(arr[index]);
           PrintArray(arr, index +1);
    }

    static int maxValue(int arr [], int index){
        if(index==arr.length-1)
        return arr[index];

        int smallAns=maxValue(arr, index +1);
        return Math.max(arr[index],smallAns);

    }
       

    static int sumArray(int arr [],int index){
        if(index==arr.length)
        return 0;
        
        int smallans= sumArray(arr, index+1);
         return smallans + arr[index] ;
    } 


     static boolean search(int arr [],int n, int target,
      int index){
        if(index >= n){
            return false;
        }
        if(arr[index]== target) return true;

          return search(arr, n, target, index+1);

     }

      static int findIndex(int arr [],int n,int target,
      int index ){
        //Find the given target and return its index
        // if target is not found return -1;
        if(index>=n) return -1;
     
        if(arr[index]==target) return index;

        return findIndex(arr, n,target, index+1);


      }



        static void findIndices (int arr [],int n, 
        int target,int index){
          // Checkig the target how many numbers are
          // equals to target and return their indices ;
             
          if(index>= n) return;

          if(arr[index]== target){
            System.out.println(index);
          }
         findIndices(arr, n, target, index+1);

        }


        static ArrayList<Integer> allIndices(int arr [],
        int n, int target,int index){

          //  Return all the indies that have target value;
          ArrayList<Integer> ans= new ArrayList<>();

           if(index>=n) 
           return ans;
           
           if(arr[index]==target){
            ans.add(index);
           }
          ArrayList<Integer> smallans= allIndices(arr, n, target, index +1);
        
          ans.addAll(smallans);
          return ans;
        }



        


     public static void main(String [] eclipse){
              int arr [] = {15,6,11,15,7,15,8,9,15};
              int target =15;
               int index =0;
              int n=arr.length;
              ArrayList<Integer> ans= allIndices(arr, n, target, index);
            //   if(search(arr, n, target, index)){
            //     System.out.println("Yes");
            //   }
            //   else{
            //     System.out.println("No");
            //   }

            // System.out.println(findIndex(arr, n, target, index));

            // findIndices(arr, n, target, index);


            for(Integer i: ans){
              System.out.print( " "+ i);
            }



            //   PrintArray(arr, 0);
            //   System.out.println(maxValue(arr, 0));
            // System.out.println(sumArray(arr, 0));



   }

}
