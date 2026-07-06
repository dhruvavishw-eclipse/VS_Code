import java.util.*;
public class Two_Pointer {

static void sortOddEven(int arr []){
    int n=arr.length, left=0,right=n-1;

    while(left<right){
        if(arr[left]%2 ==1 && arr[right]%2==0)
        swap(arr, left, right);
        left++;
        right--;

        if(arr[left]%2==0){
            left++;
        }
        if(arr[right]%2 ==1)
        right--;
    }
}


    static void sort0and1_2nd(int [] arr){
        int n=arr.length,left=0,right=n-1;
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


   static void sort0and1(int arr [] ){
    int n=arr.length,count=0;

    for(int i=0;i<n;i++){
        if(arr[i]==0)
        count++;
    }

    for(int i=0;i<n;i++){
        if(i<count)
        arr[i]=0;
        else
        arr[i]=1;
    }
   }

static int  [] sortSqare(int arr []){
    int n=arr.length;
    int left=0,right= n-1;
     int ans []=new int [n];
     int k=n-1;
    while(left<=right){
      if(Math.abs(arr[left]) > Math.abs(arr[right])){
        ans [k--]=arr[left] * arr[left];
        left++;
      }
      else{
        ans[k--]=arr[right]*arr[right];
        right--;
      }
    }
    return ans;
}


   static void reverse(int arr []){
    int i=0,j=arr.length-1;
    while(i<j){
        swap(arr, i, j);
        i++;
        j--;
    }
   }


  static void swap(int arr [],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;

  }


  static void printArray(int arr []){
    int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
    }
    System.out.println();
  }

    public static void main(String[] BKP) {
        Scanner rcb =new Scanner(System.in);

        System.out.println("Size of Array");
        int n= rcb.nextInt();
        int arr []= new int [n];
        System.out.println("Enter Elements of Array");
        for(int i=0;i<n;i++){
            arr[i]= rcb.nextInt();
        }

        int ans []= sortSqare(arr);
        // reverse(ans);
        printArray(ans);
        
        // sortOddEven(arr);
        // sort0and1_2nd(arr);// nd FOR SORTING 0s AND 1s IN SINGLE LOOP
  // sort0and1(arr); //1st FOR SORTING 0S AND 1S
  // printArray(arr);

    }
    
}
