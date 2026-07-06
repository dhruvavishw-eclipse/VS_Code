import java.util.Arrays ;

public class Array2 {
    


    static int  targetsum(int arr[],int target){
        int n=arr.length;
        int ans=0;
         for(int  i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target)
                ans++;
            }
         }
      return ans;
    
    }



    static int triplesum(int arr [],int target){
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;j<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target)
                    ans++;
                }
            }
        }
        return ans;
    }



 static int  unique(int arr []){
    //  This is only for positive elements of an array
     int n=arr.length;
     for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;

            }
        }
     }
      int ans=-1;
     for(int i=0;i<n;i++){
        if(arr[i]!= -1){//or  arr[i>0]
            ans=arr[i];
        }
     }
     return ans;
 }


 static int secondmax(int arr []){
    int n=arr.length;
    int max= Integer.MIN_VALUE;
    int max2= Integer.MIN_VALUE;
    
 for(int i=0;i<n;i++){
    if(arr[i]>max){
        max=arr[i];
    }

 }
 for(int i=0;i<n;i++){
    if(arr[i]==max){
        arr[i]=Integer.MIN_VALUE;
    }
 }
 for(int i=0;i<n;i++){
    if(arr[i]>max2){
        max2=arr[i];
    }
 }
return max2;

 }

static int repeat(int arr []){
    int ans=-1;
    int n= arr.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                return arr[i];
            }
        }
    }
    return ans;
}

static int lastrepeat(int arr[]){
    int ans=-1;
    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                ans=arr[i];
            }

        }
    }
    return ans;
}

static int secondmin(int arr []){
    int n=arr.length;
    int min=Integer.MAX_VALUE;
    int min2=Integer.MAX_VALUE;

    for(int i=0;i<n;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    } 
    for(int i=0;i<n;i++){
        if(arr[i]==min){
            min=Integer.MAX_VALUE;
        }
    }
    for(int i=0;i<n;i++){
        if(arr[i]<min2){
            min2=arr[i];
        }
    }
   return min2;
}



static void swap(){
    int a =27;
    int b =05;
    // int temp=a;
    // a=b;
    //  b= temp;   
    System.out.println("Value of a before swapping  "+ a );
    System.out.println("Value of b before swapping  "+ b);


          a=a+b;
          b=a-b;
          a=a-b;

    System.out.println("Value of a after swapping  "+ a );
    System.out.print("Value of b after swapping  "+ b);


}



static int [] reversearr(int arr[]){
    int n=arr.length;
    int j=0;
    int ans []= new int [n];
    for(int i=n-1;i>=0;i--){
        ans[j++]=arr[i];
        // or we can write here         ans[j]=ans[i];
        // but we have to write here    j++;
    }

return ans;
}


// static int [] reverserr2(int arr[]){
//     int n=arr.length;
//    int i=0 ,j=n-1;
//      while(i<j){

//      }
// }  


static int [] rotate(int arr [],int k){
      int n=arr.length;
      k=k%n;
      int ans[]=new int [n];
      int j=0;
      for(int i=n-k;i<n;i++){
          ans[j++]=arr[i];
      }
        
      for(int i=0;i<n-k;i++){
        ans[j++]=arr[i];
      }
    return ans;
}


// static int [] rotate2(int arr []){
//     int n=arr.length;
     
// }


static int []frequency(int arr []){
    int fre []= new int [100005];
    for(int i=0;i<arr.length;i++){
        fre[arr[i]]++;

    }
    return  fre;
}



public static void main(Strings mky[]){
    int arr []={5,6,7,27,4};
    // int arr[]= {-27,-5,-275,0,-1000};
    int k=8; 



// System.out.print(Arrays.toString( rotate(arr,k)));
// System.out.print(Arrays.toString(reversearr(arr)));

// swap();
// System.out.print(secondmin(arr));
// System.out.print(lastrepeat(arr));
    // System.out.print(repeat(arr));
System.out.print( "Second Maximum value in  Array is  "+secondmax(arr));
// System.out.print(unique(arr));
// System.out.print(targetsum(arr, target));
// System.out.print(triplesum(arr, target));
}

}
