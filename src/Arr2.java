import java.util.*;

public class Arr2 {
    




static void sortZeoresnOne1(int arr []){
    int n=arr.length;
    int zeroes=0;
    //count number of zeroes
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            zeroes++;
        }
    }
// 0 to zeroes-1: 0,zeroes to n-1 : 1
    for(int i=0;i<n;i++){
        if(i<zeroes){
            arr[i]=0;
        }
        else
        arr[i]=1;
}
}
static void sortZeoresnOne2(int arr []){
    int n=arr.length;
    int left=0,right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0)
            left++;
            if(arr[right]==1)
            right--;

        }
}

static void sorrttOnes(int arr []){
    int n=arr.length;
    int temp=0;
    int left=0,right=n-1;
    while(left<right){
        if(arr[left]==1 && arr[right]==0){
             temp=arr[left];
             arr[left]=arr[right];
             arr[right]=temp;
             left++;
             right--;
                 }

                 if(arr[left]==0)
                 left++;
                 if(arr[right]==1)
                 right--;
    }
}


static void EvenOdd(int arr []){
    int n=arr.length;
    int left=0,right=n-1;
    while(left<right){
        if(arr[left]%2!=0 && arr[right]%2==0){
            swap(arr, left, right);
            left++;
            right--;
        }
        if(arr[left]%2==0 ){
            left++;
            // right--;
        }
        if(arr[right]%2!=0)
        right--;
    }

}


static void EvenOdd2(int arr []){
    int n=arr.length;
    int even=0;
    for(int i=0;i<n;i++){
        if(arr[i]%2==0){
            even++;
        }
    }
     for(int i=0;i<n;i++){
        if(arr[i]<even){

        }
     }

}



static int []SortSquares(int arr[]){
    int n=arr.length;
    int left=0,right=n-1;
    int ans[]= new int [n];
    int k=0;
    while(left<=right){
        if(Math.abs(arr[left])>Math.abs(arr[right])){
            ans[k++]=arr[left]*arr[left];
            left++;
        }
        else{
            ans[k++]=arr[right]*arr[right];
            right--;
        }
    }
    return ans;
}



static void reverse(int arr[]){
    int i=0,j=arr.length-1;
     while(i<j){
        swap(arr, i, j);
        i++;
        j--;
     }
}


static void swap (int []arr,int i,int j){
    int temp= arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}


static void printArray(int arr []){
    int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+"  ");
    }
    System.out.println();
}


    public static void main(Strings[] args) {
        Scanner mk =new Scanner(System.in);
        
        


        System.out.println("Enter array size");
        int n=mk.nextInt();
        int arr[]=new int [n];

        System.out.println("Enter "+n+" Elements ");
        for(int i=0;i<n;i++){
            arr[i]=mk.nextInt();
        }

        System.out.println("Original Array ");
        printArray(arr);
                   
                             // sortZeoresnOne2(arr);
                            // EvenOdd(arr);
                           // sorrttOnes(arr);
                           int ans []=SortSquares(arr);
        System.out.println("Sorted array ");
        reverse(ans);
        printArray(ans );
    }
}
