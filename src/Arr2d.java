import java.util.*;

public class Arr2d {


static int PrefixSum2(int[][]matrix,int l1,int l2,int r1,int r2){
     int sum=0;
     Prefixsum(matrix);
 for(int i=l1;i<=l2;i++){
    if(r1>=1)
    sum+=matrix[i][r2]-matrix[i][r1-1];
        else
        sum+=matrix[i][r2];
 }
        



     return sum;
     

}


  
static int[][] reverseSpiral(int n){
    int matrix [][]= new int [n][n];
    int Lcol=0,Brow=n-1,Rcol=n-1,Trow=0;

    int count =1;
    while(count<=n*n){
        for(int i=Trow;i<=Brow && count <=n*n;i++){
            matrix[i][Lcol]=count++;

        }
        Lcol++;
        for(int j=Lcol;j<=Rcol&& count <=n*n;j++){
            matrix[Brow][j]=count++;
        }
        Brow--;
        for(int i=Brow;i>=Trow&& count <=n*n;i--){
            matrix[i][Rcol]=count++;
        }
        Rcol--;
        for(int j=Rcol;j>=Lcol&& count <=n*n;j--){
            matrix[Trow][j]=count++;
        }
        Trow++;
    }
    return matrix;  
}


    static int [][] Spiral2(int n){
        int matrix [][]=new int [n][n];
        int Trow=0,Brow=n-1,Lcol=0,Rcol=n-1;
        int count=1;
        while(count<=n*n){
            System.out.println("Hi");
            for(int j=Lcol;j<=Rcol&& count<=n*n;j++){
               matrix[Trow][j]=count;
                count++;
            }
            Trow++;
           for(int i=Trow;i<=Brow&& count<=n*n;i++){
               matrix[i][Rcol]=count;
                count++;
           }
           Rcol--;
           for(int j=Rcol;j>=Lcol&& count<=n*n;j--){
               matrix[Brow][j]=count++;               
           }
           Brow--;
           for(int i=Brow;i>=Trow&& count<=n*n;i--){
            matrix[i][Lcol]=   count++;
           }
           Lcol++;
        }
//  for(int i=0;i<n;i++){
//            for(int j=0;j<matrix[i].length;j++){
//             System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//         }

        return matrix;
    }

static void Spiral(int arr [][],int r,int c){
    int toprow=0,bottomrow=r-1,leftcol=0,rigthcol=c-1;
    int totalelments=0;

   while(totalelments<r*c){
        for(int j=leftcol;j<=rigthcol && totalelments<r*c;j++){
           System.out.println(arr[toprow][j]+" ");
           totalelments++;
        }
         toprow++;


        for(int i=toprow;i<=bottomrow&& totalelments<r*c;i++){
            System.out.println(arr[i][rigthcol]+" ");
            totalelments++;
        }
        rigthcol--;

        for(int j=rigthcol;j>=leftcol&& totalelments<r*c;j--){
            System.out.println(arr[bottomrow][j]+" ");
            totalelments++;
        }
         bottomrow--;

        for(int i=bottomrow;i>=toprow&& totalelments<r*c;i--){
            System.out.println(arr[i][leftcol]+" ");
            totalelments++;
        }
        leftcol++;

}


}


static int [][] pascal(int n){
    int [][]ans=new int [n][];
    for(int i=0;i<n;i++){
        // ith row has i+1 columns;
        ans[i]=new int [i+1];
        ans[i][0]=ans[i][i]=1;

        for(int j=1;j<i;j++){
            ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
        }

    }
    return ans;
}



static void rotate(int [][] arr,int n){
    transposeInplace(arr, n, n);
    for(int i=0;i<n;i++){
       reverseArr(arr[i]);
    }

}



static void transposeInplace(int arr [][],int r,int c){
    // Only applicable of Square Matrix
    for(int i=0;i<r;i++){
        for(int j=i;j<c;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
}


    static int [][] transpose(int arr [][],int r,int c){
        int ans [][]= new int [c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans [i][j]=arr[j][i];
            }
        }
        return ans;
    }
    


static void add(int arr [][],int r1,int c1,int[][]arr2,
int r2,int c2){
    if(r1!=r2 || c1!=c2){
        System.out.println("Wrong Input");
        return;
    }
    int sum [] []=new int [r1][c1];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            sum [i][j]=arr[i][j]+arr2[i][j];
        }
    }
    System.out.println("Sum of Mat1 and Mat2 ");
     printMatrix(sum);
}

static void Prefixsum(int matrix[][]){
    int r=matrix.length;
    int c=matrix[0].length;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            matrix[i][j]+=matrix[i][j-1];
        }
    }
}

static void reverseArr(int arr []){
    int i=0,j=arr.length-1;
      while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
      }
}

    static void printMatrix(int arr [][]){
        int n=arr.length;
        for(int i=0;i<n;i++){
           for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
           }
           System.out.println();
        }
    }

//    static int [] []znn(int n){
//     int ans[][]=new int [n][];
//     for(int i=0;i<n;i++){
//         ans[i]=new int [i+1];
//         ans[i][0]=ans[i][i]=1;
//         for(int j=1;j<i;j++){
//             ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
//         }
//     }
//     return ans;
//    }

    public static void main(Strings[] args) {
        Scanner mk=new Scanner(System.in);
        // int arr [] []= {{1,2,4},{2,5,6},{4,7,9}};
        // System.out.println("Enter size of n ");
        //  int n=mk.nextInt();
        //  int ans [][]=pascal(n);
        // // int ans [][]=znn(n);
        //  printMatrix(ans);

        // int n=mk.nextInt();


        System.out.println("Enter rectangle boundaries of l1,r1,l2,r2 ");
         int l1=mk.nextInt();
          int r1=mk.nextInt();
           int l2=mk.nextInt();
            int r2=mk.nextInt();
            System.out.println("Rectangle sum" + PrefixSum2(null, l1, l2, r1, r2)  );
        // System.out.println("Enter number of columns");
        // int n=mk.nextInt();
        // int matrix [][]=new int [n][n] ;
        // int[][] matrix=Spiral2(n);
        // int [][] matrix=reverseSpiral(n);
       
        // printMatrix(matrix);
        // System.out.println("Enter "+ r*c+" Elements ");
        //    for(int i=0;i<r;i++){
        //        for(int j=0;j<c;j++){
        //             arr[i][j]=mk.nextInt();
        //    }
           
        // }



        
        // System.out.println(" Input Matrix ");
        // printMatrix(arr);
        // System.out.println("Spiral int of Mat");
        // Spiral2(arr, c);
        // printMatrix(arr);
        // Spiral(arr, r, c);

        // rotate(arr,r);
        // System.out.println("Rotation of Matrix ");
        // printMatrix(arr);
        
        
        // transposeInplace(arr, r, c);
// System.out.println("Enter number of rows for 2nd Matrix ");
//  int r2=mk.nextInt();
//   System.out.println("Enter number of columns "+
//    "for 2nd Matrix ");
//   int c2=mk.nextInt();
//   int arr2 [][]=new int [r2][c2] ;
//  System.out.println("Enter "+ r2*c2+" Elements ");
//            for(int i=0;i<r2;i++){
//                for(int j=0;j<c2;j++){
//                     arr2[i][j]=mk.nextInt();
//            }
           
//         }
      
   

// int ans [][]=transpose(arr1, r1, c1);
//    printMatrix(ans);
//    printMatrix(arr2);
// add(arr1, r1, c1, arr2, r2, c2);


        // printMatrix(arr);
           
    }
}
