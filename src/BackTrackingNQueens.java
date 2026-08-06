import java.util.*;
public class BackTrackingNQueens {

 private static void nQueens(char[][] board, int row) {
        int n=board.length;
        if(row==n){
            for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                System.out.print(board[i][j]);
            }            
            System.out.println();
        }
        System.out.println();
        return;
    }

        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board, row+1 );
                board[row][j]='.';    // Backtracking
            }
        }
    }





    private static boolean isSafe(char[][] board, int row, int col) {
    // TODO Auto-generated method stub
    // Check the row
        int n=board.length;
         for(int j=0;j<n;j++){
              if(board[row][j]=='Q') return false;
         }

    // Check the col
    for(int i=0;i<n;i++){
        if(board[i][col]=='Q') return false;
    }

    // Check North East
    int i=row;
    int j=col;
    while(i>=0 && j<n){
        if(board[i][j]=='Q') return false;
        i--;
        j++;
    }

    // Check South East
     i=row;
     j=col;
    while(i<n && j<n){
        if(board[i][j]=='Q') return false;
        i++;
        j++;
    }

    // Check South West
     i=row;
     j=col;
    while(i<n && j>=0){
        if(board[i][j]=='Q') return false;
        i++;
        j--;
    }

    // Check North West
     i=row;
     j=col;
    while(i>=0 && j>=0){
        if(board[i][j]=='Q') return false;
        i--;
        j--;
    }

    return true;

}





    public static void main(String BKP []){
        Scanner rcb=new Scanner(System.in);
        int n= 4; //rcb.nextInt();
        char board [][]=new char [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }            
        }

        nQueens(board,0);
    }
}
