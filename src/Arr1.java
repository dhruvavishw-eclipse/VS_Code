import java.util.*;

public class Arr1 {



static void arr(int n){
    Scanner mk= new Scanner(System.in);
    int arrr []= new int[n];
    System.out.println("Enter "+ n +" Elements ");
    for(int i=0;i<n;i++){
        arrr[i]=mk.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.println(arrr[i]);
    }
}


static void printArray(int arrr []){
   for(int i=0;i<arrr.length;i++){
    System.out.println(arrr[i]);

   }
   System.out.println();
}


static void change_array(int [] arrr ){
    for(int i=0;i<arrr.length;i++){
        arrr[i]=0;
    }
}


static int TSum(int arrr [],int target){
    int ans=0;
    for(int i=0;i<arrr.length;i++){
        for(int j=i+1;j<arrr.length;j++){
            if(arrr[i]+arrr[j]==target){
                ans++;
            }
        }

    }
    return ans;
}


static int TSum2(int arrr [],int target){
    int ans=0;
    for(int i=0;i<arrr.length;i++){
        for(int j=i+1;j<arrr.length;j++){
            for(int k=j+1;k<arrr.length;k++){
                if(arrr[i]+arrr[j]+arrr[k]==target){
                    ans++;
                }
            }
        }
    }
    return ans;
}



static int Unique(int arrr []){
    int n =arrr.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arrr[i]==arrr[j]){
                arrr[i]=-1;
                arrr[j]=-1;
            }
        }

    }
    int ans=-1;
    for(int i=0;i<n;i++){
        if(arrr[i]>0){
           ans=arrr[i];
        }
    }
    return ans;
}


static int Maxx(int arrr []){
    int max=Integer.MIN_VALUE;
    int n=arrr.length;
    for(int i=0;i<n;i++){
        if(arrr[i]>max){
           max=arrr[i];
        }
    }
    return max;
}


static int SecMax(int arrr []){
    // int max= Integer.MIN_VALUE;
int max=Maxx(arrr);
int n=arrr.length;
    for(int i=0;i<n;i++){
     if(arrr[i]==max){
        arrr[i]=Integer.MIN_VALUE;
     }
    }
    int SecondMax= Maxx(arrr);
    return SecondMax;

}


static int Repeat1st(int arrr []){
    int n=arrr.length;
    int ans=-1;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
           if(arrr[i]==arrr[j]){
                ans  =arrr[i];
                //  Or break; This will stop iteration
                return arrr[i];//This  stop whole method
           }
        }
    }
      return -1;  //or return ans;
}


 static int smallest(int arrr []){
    int small= Integer.MAX_VALUE;
    int n=arrr.length;
    for(int i=0;i<n;i++){
        if(arrr[i]<small){
            small=arrr[i];
        }
    }
    return small;
}


static int Smallest2nd(int arrr []){
    int small= smallest(arrr);
    int n=arrr.length;
    for(int i=0;i<n;i++){
        if(arrr[i]==small){
           arrr[i]=Integer.MAX_VALUE; 
        }
    }
    int secondMin= smallest(arrr);
    return secondMin;
}




static void swap (int a,int b){
   System.out.println("Original Values");
System.out.println("a  "+ a);
System.out.println("b  " + b);

// int temp=a;
// a=b;
// b=temp;
a=a+b;
b=a-b;
a=a-b;
System.out.println("Swaped Values");
System.out.println("a  "+ a);
System.out.println("b  " + b);
}


static int[] reverseArray(int arr[],int i,int j){
    int n=arr.length;
    int [] ans= new int [n];

// for (int i=n-1;i>=0;i--){
//     ans[j++]=arrr[i];
// }
// int i=n-1;int j=0;
while(i>=0){
    ans [j++]=arr[i--];
}
return ans;
}


static void swapArray(int arr [],int i,int j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;

}

static void reverseArrayInplace(int arr []){
    int i=0,j=arr.length-1;

    while(i<j){
        swapArray(arr,i,j);
        // int temp=arr[i];
        // arr[i]=arr[j];
        // arr[j]=temp;
  
        i++;
        j--;
    }
}

static int [] Krotation(int arr [],int k){
int n=arr.length;
k=k%n;
int ans []= new int [n];
int j=0;
    for(int i=n-k;i<n;i++){
       ans[j++]=arr[i];
}

    for(int i=0;i<n-k;i++){
        ans[j++]=arr[i];
}
return ans;
}



static void inplaceRotationArr(int arr [],int k){
   int n=arr.length;
    k=k%n;
   reverseArray(arr,0,n-k-1);
   reverseArray(arr,n-k,n-1);
   reverseArray(arr,0,n-1);
}


static int [] makeFrequencyArray(int arr []){
    int freq[]=new int [100005];
    for(int i=0;i<arr.length;i++){
        freq[arr[i]]++;
    }
return freq;

}


public static void main(Strings [] mky){
//    int a=27;
//    int b=05;


// int arr []={1,2,3,4,5,6};
// swap(a, b);


System.out.print("Enter size of array ");
Scanner mk= new Scanner(System.in);

int n= mk.nextInt(); 
int arr []= new int[n];
//int arrr[]={27,05,2705,314,18};
System.out.println("Enter "+ n +" Elements ");
for(int i=0;i<arr.length;i++){
    arr[i]=mk.nextInt();
}
int [] freq=makeFrequencyArray(arr);

System.out.println("Enter number of  Queries");
int q=mk.nextInt();

while(q>0){
    System.out.println("Enter number to be searched");
    int x= mk.nextInt();
    if(freq[x]>0){
        System.out.println("Yes");
    }
    else
    System.out.println("NO");
    q--;
}

// System.out.println("Original Array");
// printArray(arr);
// // inplaceRotationArr(arr);
// // int ans []=Krotation(arr, k);
// System.out.println("Rotated Array");
// printArray(arr);

// reverseArray(arr);
// reverseArrayInplace(arr);
// printArray(arr);

        // System.out.println("Enter Target sum  ");
        // int target =mk.nextInt();







    //    System.out.println( "Ans "+Smallest2nd(arrr));



        // System.out.println(TSum2(arrr, target));
        // System.out.println(TSum(arrr,target));
        
        // System.out.println("Orignal Array  "+arrr[i]);
    //  int arrr2 []=arrr;
    //  arrr[0]=0;
    //  arrr[1]=0;
    //  System.out.println("Copied arrr2");
    //  printArray(arrr2);
// change_array(arrr);
    

    // arr(n);

    }
}
