import java.util.*;

public class Prac {

 

  static void printMatrix(int arr [] []){
  for(int i=0;i<arr.length;i++){
     for(int j=0;j< arr[i].length;j++){
        System.out.print(arr[i][j] + " ");
     }
     System.out.println();
  }

}

    static void add(int [][] a,int r1,int c1, int [][] b,int r2,int c2){
        if(r1 !=c1 || r2 !=c2){
            System.out.println("Wrong Input - Additon not possible");
            return;
        }
        int MatSum [][]= new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                MatSum [i][j]= a[i][j] +b [i][j];
            }
        }
        System.out.println("Sum of Mat 1 + Mat 2");
        printMatrix(MatSum);
    }
  

    static void Matmultiply(int [][] a,int r1,int c1,
    int b [][],int r2,int c2){
        if(c1 !=r2){
            System.out.println("Wrong dimensions");
        }
       
        int ans [][]= new int [r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    ans[i][j]=(a[i][k]* b[k][j]);
                }
            }
        }
   System.out.println("Multiplication of 2 matrices");
     printMatrix(ans);
    }



     static void reverseArray(int [] arr){
        int i=0,j=arr.length-1;
      while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        
      }
     }


 static void rotate(int matrix [][], int n){
    
    transposeInPlace(matrix, n, n);
    for(int i=0;i<n;i++){
    reverseArray(matrix[i]);
    }
 }


     static int [][] pascal(int n){
        int ans [][]= new int [n][];

        for(int i=0;i<n;i++){
            ans [i]=new int [n+1];
                ans[i][0]= ans[i][i]=1;

                for(int j=1;j<n;j++){
                    ans[i][j]= ans[i-1][j]+ ans[i-1][j-1];
                }

        }


        return ans;
     }


     static void transposeInPlace(int [] [] matrix,int r1,int c1){
            
        for(int i=0;i<r1;i++){
            for(int j=i;j<c1;j++){
                int temp=matrix[i][j];
                matrix [i][j]=matrix [j][i];
                matrix [j][i]=temp;
            }
        }
     }

 
    static int [][] transpose(int [][] matrix , int r1,int c1){
          int ans [][]= new int [c1][r1];
          for(int i=0;i<c1;i++){
            for(int j=0;j<r1;j++){
                ans [i][j]=matrix [j][i];
            }
          }
 return ans;
        }

         
        
            


    public static void main(String [] Chiron ){
      
        Scanner bkp=new Scanner (System.in);
        System.out.println("Enter number ");

        int n=bkp.nextInt();
        
    //     int r1= bkp.nextInt();
    //     int c1= bkp.nextInt();
    //     int [] [] a = new int [r1][c1];
    //     System.out.println("Enter elements of Matrix 1");
    //     // int c=bkp.nextInt();
    //    //  System.out.println("Enter "+ r*c+ " elements");
    //     for(int i=0;i<r1;i++){
    //         for(int j=0;j<c1;j++){
    //             a[i][j]=bkp.nextInt();
    //         }
    //     }        



// System.out.println("Enter number of rows and columns of matrix 2");
//         int r2= bkp.nextInt();
//         int c2= bkp.nextInt();
//         int [] [] b = new int [r2][c2];
//         System.out.println("Enter elements of Matrix 2");
        
//         for(int i=0;i<r2;i++){
//             for(int j=0;j<c2;j++){
//                 b[i][j]=bkp.nextInt();
//             }
//         }        




int ans [][]=pascal(n);
printMatrix(ans);

//    System.out.println(" Input Matrix ");
//    printMatrix(a);
   
//    rotate(a,r1);
//    System.out.println("Rotation of Matrix");
//    printMatrix(a);
   
   
   //    transposeInPlace(a, r1, c1);
   // int ans [] [] =transpose(a, r1, c1);
   
    // printMatrix(ans);
// System.out.println("Matrix 2 ");
// printMatrix(b);


//  add(a, r1, c1, b, r2, c2);

        
    // printArray(arr);

    }
}
