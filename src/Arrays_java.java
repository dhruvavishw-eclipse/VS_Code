import java.util.*;

public class Arrays_java {
    
   static int findMax(int arr []){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max)
        max=arr[i];
    }
    return max;
   }

  static int FindSecMax(int arr []){
     int maxx= findMax(arr);
       for(int i=0;i<arr.length;i++){
        if(arr[i]==maxx){
            arr[i]=Integer.MIN_VALUE;
        }
       }
    
         int ans= findMax(arr);
         return ans;


  }


  static int [] revArr(int array []){
    int n=array.length;
    int ans []=new int [n];
    int j=0;
    // for(int i=n-1;i>=0;i--){
    //     ans[j++]=array[i];
    // }
    int i=n-1;
    while (i>=0){
        ans[j++]=array[i--];
        // i--;
    }
  return ans;
  }


  static void revArray(int array [],int i,int j){
    // int i=0,j=array.length-1;
    while(i<j){
        swap(array, i, j);
        i++;
        j--;
    }
  }

static int [] rotate(int array [],int k){    
    int n=array.length;
    k= k % n;
    int ans []=new int [n];
    int j=0;
    for(int i=n-k;i<n;i++){
        ans[j++]=array[i];
    }
    for(int i=0;i<n-k;i++){
        ans[j++]=array[i];
    }
    return ans;
}

static void rotateInPlace(int array [],int k){
    int n=array.length;
    k=k%n;
    // revArray(array, 0, n-k-1);
    // revArray(array, n-k, n-1);
    // revArray(array, k, n);
 revArray(array, 0, n-k-1);
 revArray(array, n-k, n-1);
 revArray(array, 0, n-1);

}

 
  static int [] makeFreqArr(int array []){
    int freq []= new int [1000005];
    for(int i=0;i<array.length;i++){
        freq[array[i]]++;
    }
    return freq;
  }
   

  static void swap(int arr [],int i,int j){
        //  a=a+b;
        //  b=a-b;
        //  a=a-b;
     int temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
       

        //  System.out.println("i= "+arr[i] +" j="+ arr[j]);
  }


  static void printArr(int array[]){
    int n=array.length;
    for(int i=0;i<n;i++){
        System.out.print(array[i]+" ");
    }
    System.out.println();
  }


    public static void main(String[] args) {

    Scanner rcb= new Scanner(System.in);
    System.out.println("Enter size of array");
    int n= rcb.nextInt();
    // int a= 27,b=5;

    System.out.println("Enter Elemensts of Array");
    int arrayy []= new int [n];
    for(int i=0;i<n;i++){
        arrayy[i]= rcb.nextInt();
    }

    int freq []= makeFreqArr(arrayy);
    System.out.println("Enter number of Queries");
    int q=rcb.nextInt();
while(q>0){
    System.out.println("Enter number to be search");
    int x= rcb.nextInt();
    if(freq[x]>0){
       System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
    q--;
}



    // int ans []=revArr(arrayy);
    // printArr(ans);




// rotateInPlace(arrayy, k);
// printArr(arrayy);

    // int ans [ ]=rotate(arrayy, k);//5th FOR K TIME ROTATION OF ARRAY
    // printArr(ans);
// revArray(arrayy);//4th FOR REVERSING ARRAY SWAP METHOD INPLACE;
// printArr(arrayy); // 4th

// System.out.println(revArr(arrayy));// 3rd FOR REVERSING ARRAY USING EXTRA SPACE
// swap(a, b);// 2nd FOR SWAPING
    //   System.out.println(FindSecMax(arrayy)); // 1ST FOR FINDING 2ND MAX VALUE ;
        // System.out.println(Math.sqrt(27));
        // System.out.println(Math.sqrt(25));

        // System.out.println(Math.floor(2.7));
        // System.out.println(Math.floor(2.1));

        // System.out.println(Math.ceil(2.1));
        // System.out.println(Math.ceil(2.7));


    }
}
