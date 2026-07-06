 import java.util.*;

public class Array2D {
    

static void printArray(int [][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}

static void add(int [][] a,int r1,int c1,int [][] b, int r2,int c2){
    if(r1!= r2 || c1!= c2){
        System.out.println("Wrong input - Addition not possible");
          return;

    }

    int sum [][]= new int [r1][c1];
    for(int i=0;i<r1;i++){  //row number
        for(int j=0;j<c1;j++){  // column number
            sum[i][j]= a[i][j]+b[i][j];

        }
    }
   printArray(sum);

}



static void multiply(int []a [], int r1,int c1,int [][]b ,int r2,int c2){
    if(c1!=r2){
        System.out.println("Multiplication not possible - wrong dimension");
        return;
    }
    int [][] ans= new int [r1][c2];
    for(int i=0;i<=r1;i++){
        for(int j=0;i<=c2;j++){
            for(int k=0;i<=r2;k++){// Limit could be c1 or r2, they have same value
                ans [i][j]+= (a[i][k] * b[k][j]);
            }
        }
    }

System.out.println("Multiplication of 2 matrices ");
printArray(ans);
}



 static int [][] transpose(int [][] a, int r,int c){
       int ans [][]= new int [c][r];
       for(int i=0;i<c;i++){
        for(int j=0;j<r;j++){
            ans [i][j]= a[j][i];
        }
       }
       return ans;
 }



static void transposeInplace(int  [][]a,int r,int c){
    for(int i=0;i<c;i++ ){
        for(int j=i;j<r;j++){
            
            // int temp [][]= new int [r][c];
            int  temp = a[i][j];
            a[i][j] = a[j][i];
            a[j][i]= temp ;
        }
     }
}

static void reverseArray(int arr){
    int i=0, j=arr.length-1;
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
}



static void rotateBy90(int a [][],int n){

    // transpose 
    // reverse each row of transpose matrix

    transposeInplace(a, n, n);
    // reverse each row of transpose matrix

       for(int i=0;i<n;i++){
        reverseArray(a[i]);
       }


}





public static void main(Strings mky []){
    Scanner mk  = new Scanner(System.in);
    System.out.print("Enter number of rows");
    int r= mk.nextInt();
    System.out.print("Enter number of columns");
    int c= mk.nextInt();
    int [] a []= new int [r][c]; //Declartion of Number of rows is compulsory but colmuns not
    int arr []= new int[r] ;
    System.out.println("Enter "+ r *c + " Elements");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            a[i][j]=mk.nextInt();
        }
    }


// System.out.print("Enter number of rows for Mat2");
// int r2= mk.nextInt();
// System.out.print("Enter number of columns for Mat2");
// int c2= mk.nextInt();
// int [] b []= new int [r2][c2]; //Declartion of Number of rows is compulsory but colmuns not
// System.out.println("Enter "+ r2 *c2 + " Elements");
// for(int i=0;i<r2;i++){
//     for(int j=0;j<c2;j++){
//         b[i][j]=mk.nextInt();
//     }
// }

System.out.println("Input Matrix");
printArray(a);
System.out.println("Transpose of  Matrix");
rotateBy90(a, r);
// transposeInplace(a, r, c);
printArray(a);
// int [][] ans= transpose(a, r, c);
// printArray(ans);



// System.out.println("Matrix 1");
// printArray(a);
// System.out.println("Matrix 2");
// printArray(b);
// System.out.println("Multiple of Mat 1 + Mat 2");
// multiply(a, r1, c1, b, r2, c2);


// add(a, r1, c1, b, r2, c2);

// int  [] [] arr= new int [3][3];
// int [][] arr2 = {{1,2,3},{4,5,6}};

// printArray(arr2);





}
}
