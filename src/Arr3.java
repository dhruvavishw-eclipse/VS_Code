import java.util.*;


public class Arr3 {


static int [] PrefixSum2(int arr []){
    int n=arr.length;
    // int k=0;
    // arr[k[0]]=arr[i[0]];
    for(int i=1;i<n;i++){
          arr[i]=arr[i-1]+arr[i];
    }
    return arr ;
}


static int [] PrefixSum(int arr []){
    int n=arr.length;
    int pref[]=new int[n];
     pref[0]=arr[0];
    for(int i=1;i<n;i++){
        pref[i]=pref[i-1]+arr[i];
    }
    return pref;
}



static void printArray(int arr []){
    int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        
   Scanner mk= new Scanner(System.in);
   System.out.println("Enter size of Array ");
   int n=mk.nextInt();
   int arr[]=new int [n+1];
   System.out.println ("Enter "+ n +" Elements ");
   for(int i=1;i<=n;i++){
       arr[i]=mk.nextInt();
   }
   int pref==
   System.out.println("Enter number of queries ");
   int q=mk.nextInt();
    while(q-- >0){
        System.out.println("Enter range");
    }
   printArray(arr);
   printArray(arr);
            // 2nd   PrefixSum2(arr);
   // 1st  int pref []=PrefixSum(arr);
    }
}
