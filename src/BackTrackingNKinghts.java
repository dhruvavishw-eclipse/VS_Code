import java.util.*;
public class BackTrackingNKinghts {
     static int knightMax=-1; 
     static int number=5;

    static boolean isSafe(char board [][],int row,int col){
        int n=board.length;
      
        int i,j;
      //1 for 2 up 1 right
       i=row-2;
       j=col+1;
      if(i>=0 && j<n && board[i][j]=='K') return false;

     //2 for 2 up 1 left
       i=row-2;
      j=col-1;
      if(i>=0 && j>=0 && board[i][j]=='K') return false;


       //3 for 2 right 1 up
       i=row-1;
       j=col+2;
      if(i>=0 && j<n && board[i][j]=='K') return false;

      
       //4 for 2 right 1 down
       i=row+1;
       j=col+2;
      if(i<n && j<n && board[i][j]=='K') return false;

      
       //5 for 2 down 1 right 
       i=row+2;
       j=col+1;
      if(i<n && j<n && board[i][j]=='K') return false;

      
       //6 for 2 down 1 left
       i=row+2;
       j=col-1;
      if(i<n && j>=0 && board[i][j]=='K') return false;
      

       //7 for 2 Left 1 up 
       i=row-1;
       j=col-2;
      if(i>=0 && j>=0 && board[i][j]=='K') return false;


       //8 for 2 Left 1 down
       i=row+1;
       j=col-2;
      if(i<n && j>=0 && board[i][j]=='K') return false;
      
    return true;

    }

    
    static void nKnights(char board [][],int row,int col,int num){
     int n=board.length;
     if(row==n){
        if(num==number){
            for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    knightMax=Math.max(knightMax,num);
    return;
        
     }

     else if(isSafe(board, row, col)){
       board[row][col]='K';
       if(col!=n-1) nKnights(board, row, col+1, num+1);
      else nKnights(board, row+1, 0, num+1);
       board[row][col]='x';  // BackTracking
     }

     if(col!=n-1)nKnights(board, row, col+1, num);
     else nKnights(board, row+1, 0, num);

     


    }

    public static void main(String BKP []){
        int n=4;
        char board [][]=new char [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
       nKnights(board, 0, 0, 0);
       System.out.println(knightMax);
    }
}
