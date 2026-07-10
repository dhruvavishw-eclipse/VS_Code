import java.util.*;
public class BinarySearch {

    // TIME COMPLEXITY OF BINARY SEARCH 
    // WORST CASE  O(log n)

    // SPACE COMPLEXITY 
    // FOR INTERATIVE O(1)
    // FOR RECURSION O(log n)
    

static boolean binarySearch(int arr [],int target){
    int n=arr.length;
    int st=0,end=n-1;
    while(st<=end){
        int mid=(st+end)/2;
        if(arr[mid]==target) return true;
        else if(target<arr[mid]) end=mid-1;
        else st=mid+1;
         
    }
    return false;
}


static boolean binarySearchRecrsion(int arr [],int st,
int end,int target){
    if(st>end) return false;
    // int mid=(st+end)/2;
    int mid = st+((end-st)/2);
    if(target==arr[mid]) return true;
    else if(target<arr[mid])
    return binarySearchRecrsion(arr, st,mid-1, target);
    
   return binarySearchRecrsion(arr, mid+1, end, target);
  
}


static int firstOccurrence(int arr [],int x,
int st,int end){
    if(st>end) return -1;
    int mid= st+((end-st)/2);
    if(x==arr[mid]){
      int fo=firstOccurrence(arr, x, st,mid-1);
      
      if(fo==-1)
        return mid;

        else
        return fo;     
    } 
    else if(arr[mid]>x)
     return firstOccurrence(arr, x,st, mid-1);
    
    else
       return firstOccurrence(arr, x, mid+1, end);
    
}


static int firstOccurrene2(int arr [],int x){
    int n=arr.length;
    int st=0,end=n-1;
    int fo=-1;
    while(st<=end){
        int mid= st+((end-st)/2);
        if(arr[mid]==x){
          fo=mid;
          end=mid-1;
        }
        else if(x<arr[mid]) end=mid-1;
        else  st=mid+1;

    }
    return fo;
}


 static int sqrt(int x){
    int st=0,end=x;
    int ans=-1;
    while(st<=end){
        int mid= st+((end-st)/2);
        int val=mid*mid;
        if(val==x){
            return mid;
        }
        else if(val<x){
        ans=mid;
        st=mid+1;
        }
        else
        end=mid-1;
    }
    return ans;
 }


 static  int lastOccurrence(int arr [],int x,int st,int end){
    if(st>end) return -1;
    int mid=st+((end-st)/2);
    if(arr[mid]==x){
        int last=lastOccurrence(arr, x, mid+1, end);
        if(last==-1)
        return mid;

        else
        return last;
    }
    else if(arr[mid]>x)
   return lastOccurrence(arr, x, st, mid-1);
   else
   return lastOccurrence(arr, x, mid+1, end);

 }


 static int lastOccurrence2(int arr [],int x){
    int n=arr.length;
    int st=0,end=n-1;
    int last=-1;
    while(st<=end){
        int mid=st+((end-st)/2);
        if(arr[mid]==x){
            last=mid;
            st=mid+1;
        }
        else if(arr[mid]>x)
        end=mid-1;

        else
        st=mid+1;       
    }
    return last;
 }


//  static int last (int arr [],int x){
//     int n=arr.length;
//     int st=0,end=n-1,last=-1;
//     while(st<=end){
//         int mid=st+((end-st)/2);
//         if(arr[mid]==x){
//             last=mid;
//             st=mid+1;
//         }
//         else if(arr[mid]<x){
//             st=mid+1;
//         }
//         else
//         end=mid-1;
//     }
//     return last;
//  }

// static int sqrt2(int x,int st,int end){
//     if(st>end) return -1;
//     int mid=st+((end-st)/2);
//     int val=mid*mid;
//     int ans=-1;
//     if(val==x) return mid;
//     else if(val<x){
//         ans=mid;
//          sqrt2( x, mid+1, end);
//          return ans;
//     }    
//       else
//       return sqrt2( x, st, mid-1);
// }



static int sqrt2(int x, int st, int end) {
   if(st>end)
   return end;
   int mid=st + (end-st)/2;
   long val=mid*mid;
   if(val==x)
   return mid;
   else if(val<x)
   return sqrt2(x, mid+1, end);

   return sqrt2(x, st, mid-1);
}

    public static void main(String BKP []){
        int arr []={3,3,4,5,5,6,10,14,17,20,28,474};
        // int target=0;
        // System.out.println(binarySearch(arr,30));
        // while(target!=25){
        //     System.out.printf("%d exits in arr:%b\n",target,binarySearch(arr, target));
        //     target++;
        // }

        // System.out.print(binarySearchRecrsion(arr, 0, arr.length-1, 20));
    //    System.out.println(firstOccurrence(arr, 3, 0, arr.length-1));
        // System.out.println(firstOccurrene2(arr, 5));
        // System.out.println(sqrt(9));
        // System.out.println(lastOccurrence(arr, 5, 0, arr.length-1));
        // System.out.println(lastOccurrence2(arr, 5));
        // System.out.println(last(arr, 5));
        System.out.println(sqrt2( 10, 0,10));
    }   
}



