import java.util.Arrays;
import java.util.*;

public class Arrays05 {


static int [] sortzeroes(int arr[]){
    int n=arr.length;
    int zeroes=0;
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            zeroes++;
        }
    }
    for(int i=0;i<n;i++){
        if(i<zeroes){
            arr[i]=0;
        }
        else
        arr[i]=1;
    }
    return arr;
}



static void swap(int arr[],int a,int b){
    
    
    // int temp=a;
    // a=b;
    //  b= temp;   
    // System.out.println("Value of a before swapping  "+ a );
    // System.out.println("Value of b before swapping  "+ b);
        //   a=a+b;
        //   b=a-b;
        //   a=a-b;
int temp=arr[a];
arr[a]=arr[b];
arr[b]=temp;


    // System.out.println("Value of a after swapping  "+ a );
    // System.out.print("Value of b after swapping  "+ b);
}




 public static void zeroesones(int arr[]){
    int n=arr.length;
    
    int left=0 , right=n-1;
    while(left<=right){
        if(arr[left]==1 && arr[right]==0){
            swap(arr,left,right);
            left++;
            right--;
        }
    }

    while(left<right){
        while(left<right && arr [left]==0){
            left++;

        }
        while(left<right && arr[right]==1)
        right++;
        if(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }

    System.out.println(Arrays.toString(arr));
}


static int [] prefix(int arr []){
    int n=arr.length;
    int [] pref= new int [n];
    pref[0]=arr[0];
    
    for(int i=1;i<n;i++){
        pref[i]= pref[i-1]+arr[i];
    }
    return pref;
}

 static int [] prefix2(int arr []){
    int n=arr.length;
    //  int j=1;
     arr[0]=arr[0];
    for(int i=1;i<n;i++){
         arr[i]=arr[i-1]+arr[i];
    }
    return arr;
 }


static int arraysum(int arr []){
    int totalSum=0;
     int n=arr.length;
     for(int i=0;i<n;i++){
        totalSum +=arr[i];

     }
     return totalSum;
}



static boolean equalSumPartiton   (int arr []){
     int totallSum=arraysum(arr);
     int n=arr.length;
     int prefSum=0;
     for(int i=0;i<n;i++){
         prefSum+=arr[i];
         int suffixsum = totallSum-prefSum;
         if(suffixsum == prefSum){
            return true;
         }
     }
     return false;
}


    public static void main(Strings[] args) {
        // int arr []= {2,5,1,6,8,6,4};
        Scanner mk= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=mk.nextInt();
        int [] arr =new int [n+1];
        System.out.println("Enter " + n + " Elements");
    
        for(int i=1;i<=n;i++){
            arr[i]=mk.nextInt();
    
        }

System.out.println(equalSumPartiton(arr));



    //  [[[   int [] prefSum= prefix2(arr);
    //    System.out.println("Number of queries");
    //     int q =mk.nextInt();
        // while(q-->0){
        //     System.out.print("Enter range");
        //      int l= mk.nextInt();
        //       int r= mk.nextInt();

        //       int ans= prefSum[r]- prefSum[l-1];
        //       System.out.println("Sum" + ans);
        // }]]]

        // System.out.print("Enter right side of array");
       
        // int arr []= {1,0,1,1,1,0,0,1,0};
        // int n=arr.length;
        // int arrr[]= new int [n-1];
        // int a =0;
        // int b =n-1;







          System.out.print(Arrays.toString(prefix2(arr)));
        // System.out.print(Arrays.toString(prefix(arr)));
        // int arrr= zeroesones(arr);

        //   swap(arr, a, b);

        //  zeroesones(arr);


    //  System.out.print(Arrays.toString(sortzeroes(arr)));
    }
    
}
