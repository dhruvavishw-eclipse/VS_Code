import java.util.*;
public class BinarySearch2 {
    
   static boolean isDivisonPossible(int []arr,int m,int mxChocAllowed ){
    int numofStudents=1;
    int choc=0;

    for(int i=0;i<arr.length;i++){
      if(arr[i]>mxChocAllowed) return false;
      if(choc+arr[i] <=mxChocAllowed)
      choc += arr[i];
      else{
        numofStudents++;
        choc =arr[i];
      }
    }
    if(numofStudents>m) return false;
    return true;
  }



 static int distributeChocolates(int  []arr,int m){
    if(arr.length<m) return -1;

    int ans=0,st=1,end=(int)1e9;

    while(st<=end){
  int mid=st +(end-st)/2;
   if(isDivisonPossible(arr, m, mid)){
           ans=mid;
           end=mid-1;  
        }
        else{
          st=mid+1;
       }
     }
       return ans;
    }

   static boolean isPossible(int arr [],int k,int dist){
    int kidsPlaced=1;
    int lastKid=arr[0];

     for(int i=1;i<arr.length;i++){
      if(arr[i] -lastKid>=dist){
        kidsPlaced++;
        lastKid=arr[i];
      }
     }
     return kidsPlaced >=k;
   }


    static int raceTrack(int arr [],int k){
         if(k>arr.length) return -1;
         int st=0,end=(int) 1e9;
         int ans=-1;
         while(st<=end){
          int mid=st+(end-st)/2;
          if(isPossible(arr,k,mid)){ // can k kids be placed such that no 2 kids have distance lesser than mid
            ans=mid;
            st=mid+1;
          }
          else{
            end=mid-1;
          }
         }
   return ans;
    }



    public static void main(String [] BKP){
      int arr [] ={1,4,8,9};
      int k=3;
  // System.out.println(distributeChocolates(arr, m));
  System.out.println(raceTrack(arr, k));
    }
    
}
