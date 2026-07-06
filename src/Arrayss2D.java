import java.util.*;
public class Arrayss2D {
    


    static void printMatrix(int [] [] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }



    static int [][] findTranspose(int [][]matrix,int r,int c){
         int [] ans []= new int [c][r];

         for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
         }
         return ans;
    }



    static int [][] pascal (int n){
        // In any 2D array if we hava confirm rows but columns 
        // are not , so that type of array is called Jaggerd array 
        int ans [][] =new int [n][];
     for(int i=0;i<n;i++){
        //ith row has i+1 columns
        ans[i]= new int [i+1];
        //1st and last elements of every row is 1
        ans[i][0]=ans[i][i]=1;

        for(int j=1;j<i;j++){
            ans[i][j]= ans [i-1][j] + ans [i-1][j-1];
        }
     }
     return ans;
    }




public static void main(Strings [] args){
     Scanner mk= new Scanner(System.in);
System.out.println("Enter n");
int n=mk.nextInt();
int ans [][]= pascal(n);
printMatrix(ans);



// System.out.println("Enter number of rows and columns of matrix");
// int r=mk.nextInt();
// int c=mk.nextInt();
// int [] [] matrix = new int [r][c];
// int  totalElements = r* c;
// System.out.print("Enter " + totalElements+ " Values");
// for(int i=0;i<r;i++){
//     for(int j=0;j<c;j++){
//         matrix [i][j]= mk.nextInt();
//     }
// }
// System.out.println("Input Matrix");
// printMatrix(matrix);

// System.out.println("Transpose of Matrix");
// int [][] ans= findTranspose(matrix, r ,c);
// printMatrix(ans);

}

}
