import java.util.*;

public class Prefix {





  static int findSum(int [][] mat, int l1, int r1,
int l2,int r2){
    int sum=0;
 for(int i=l1;i<=l2;i++){
    for(int j=r1;j<=r2;j++){
      sum+=mat[i][j];
    }
 }

    return sum;
}


static int findSum2(int [] [] matrix, int l1,
int r1, int l2, int r2){
    int sum=0;
    findPreSumMat(matrix);
     for(int i=l1;i<=l2;i++){
        if(r1 >=1)
        sum+= matrix[i][r2] - matrix[i][r1-1];

        else
        sum+=matrix[i][r2];
     }
    return sum;
}



static void findPreSumMat(int matrix [][]){
    int r=matrix.length;
    int c=matrix[0].length;
    for(int i=0;i<r;i++){
        for(int j=1;j<c;j++){
            matrix[i][j]+=matrix[i][j-1];
        }
    }
}



    public static void main(String [] BKP){
        Scanner rcb=new Scanner(System.in);
        
        System.out.println("Enter nmber of rows & columns");
        int r= rcb.nextInt();
        int c= rcb.nextInt();
        int [] [] mat= new int [r] [c];
        int totalElements =r*c;
        System.out.println("Enter " + totalElements+ " Values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=rcb.nextInt();
            }
        }
System.out.println("Enter Rec boundaries");
 int l1=rcb.nextInt();
  int r1=rcb.nextInt();
   int l2=rcb.nextInt();
    int r2=rcb.nextInt();


System.out.println("REc Sum " +findSum2(mat, l1, r1, l2, r2));    
//System.out.println(" Rec Sum " + findSum(mat, l1, r1, l2, r2));

       }
}
