import java.util.*;
public class RecursionArr {

   static void printArr(int arr [],int index){
      // Base Case
      if(index==arr.length) return;

      // Self Work
      System.out.println(arr[index]);
      // Recursive Problem
      printArr(arr, index+1);
   }


static int max(int arr [],int index){
    if(arr.length-1==index) return arr[index] ;
     int smallAns=max(arr, index+1);
     return Math.max(arr[index], smallAns);

}

static int sumOfArray(int arr [],int index){
    if(index==arr.length) return 0;

   int smallAns=sumOfArray(arr, index+1);
   return arr[index]+smallAns;

}


   static boolean findX(int arr [],
     int n,int x,int index){ 
     if(index>=n) return false;
     if(arr[index]==x) return true;
     return findX(arr, n, x, index+1);
 }

   static int findIndex(int arr[],
   int n,int x,int index){
    if(index>=n) return -1;
    if(arr[index]==x) return index;
    return findIndex(arr, n, x, index+1);
   }


   static void findIndices(int arr [],
   int n,int x,int index){
    if(index>=n) return;
    if(arr[index]==x)  
    System.out.println(index);
    findIndices(arr, n, x, index+1);

   }


   static ArrayList<Integer> findIndices2(int
   arr [],int n,int x,int index){
       ArrayList<Integer> ans=new ArrayList<>();
   if(index>=n) 
   return ans;

   if(arr[index]==x){
    ans.add(index);
   }
   ArrayList<Integer> smaAns=findIndices2(arr, n, x, index+1);
   ans.addAll(smaAns); //.addAll used for taking all the values
// from other list
   return ans;

   }


   static boolean isSorted(int arr [],int n,
   int index){
    if(index==n) return true;

    if(arr[index]>arr[index+1])
    return false;
    return isSorted(arr, n, index+1);
   }


   static int lastIndex(int arr [],int n,
   int x,int index){
    if(index<0) return -1;
 return lastIndex(arr,n, 7, index - 1);
   }



    public static void main (String [] BKP){
    Scanner rcb=new Scanner(System.in);
    int [] arr={7,9,5,7,2,6,7,18,0,7};
    // int arr []={3,5,6,9,11,14,20};
    int n=arr.length-1;
    int x=7;


System.out.println(lastIndex(arr, n, 7, 0));
// System.out.println(isSorted(arr, n, 0));
// System.out.println(sumOfArray(arr, 0));
    // System.out.println(max(arr, 0));
     //printArr(arr, 0);
//   System.out.println(findX(arr, n, 7, 0));
// System.out.println(findIndex(arr, n, 7, 0));
// findIndices(arr, n, 7, 0);



// ArrayList<Integer> ans=findIndices2(arr, n, 7, 0);
// for(Integer i: ans){
//     System.out.println(i);
// }
    }
}
