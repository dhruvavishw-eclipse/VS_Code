import java.util.*;
public class BackTracking{
    


    private static int maze(int sr, int sc, int er, int ec) {  // A rat want to exit from a 2d matrix , how many ways for exit shows by result
       if(sr>er || sc>ec) return 0;
       if(sr==er && sc==ec ) return 1;
       int downways=maze(sr+1, sc, er, ec);
       int rightways=maze(sr, sc+1, er, ec);
       int totalways=downways+rightways;
       return totalways;
        
    }
    

    static void print(int sr, int sc, int er, int ec,String s) {
      // A rat want to exit from a 2d matrix , In Only  direction (R || D) Which ways used  for exit shows by result  

      if(sr>er || sc>ec) return ;
      if(sr==er && sc==ec ){
       System.out.println(s);
       return ;
      } 
     print(sr+1, sc, er, ec,s+"D");
     print(sr, sc+1, er, ec,s+"R");       
   }


    static void traverseIn4Direction(int sr,int sc,int er,int ec,String s,boolean isVisited [] []){
      //  A rat want to exit from a 2d matrix , In  ALL  directions (R ,D,L,U) Which ways used  for exit shows by result  
           if(sr<0 || sc<0) return ;
           if(sr>er || sc>ec) return ;
           if(isVisited[sr][sc]==true) return ; // Very Important
           if(sr==er && sc==ec){
            System.out.println(s);
             return;
           }
           isVisited[sr][sc]=true;
           traverseIn4Direction(sr, sc+1, er, ec, s+"R", isVisited); // for right traverse
           traverseIn4Direction(sr+1, sc, er, ec, s+"D", isVisited); // for down traverse
           traverseIn4Direction(sr-1, sc, er, ec, s+"U", isVisited); // for up traverse
           traverseIn4Direction(sr, sc-1, er, ec, s+"L", isVisited); // for left traverse
           isVisited[sr][sc]=false; // Backtrack;
    }


    static void mazeOfDeadBlock(int sr,int sc,int er, int ec, String s, int maze [] []){
    // A rat want to exit from a 2d matrix , In Only  direction (R || D),and here is some catch, if the block shows 1 then only rat
    //  can go through these blocks, Which ways   used  for exit shows by result  
                              // {{1,0,1,1,1,1},
                              // {1,1,1,1,0,1},
                              // {0,1,1,1,1,1},   
                              // {0,0,1,0,1,1}}; 

          if(sr> er || sc>ec) return ;
          if(sr==er && sc==ec){
            System.out.println(s);
            return;
          }
          if(maze[sr][sc]==0) return ;
          mazeOfDeadBlock(sr+1, sc, er, ec, s+"D", maze);
          mazeOfDeadBlock(sr, sc+1, er, ec, s+"R", maze);
    }


    static void mazeOfDeadBlockIn4Direction(int sr,int sc,int er,int ec,String s, int maze [][],boolean isVisited [][]){

      // A rat want to exit from a 2d matrix , In ALL direction (R,D,L,U),and here is some catch, if the block shows 1 then only rat
    //  can go through these blocks, Which ways   used  for exit shows by result  
                              // {{1,0,1,1},
                              // {1,1,1,1},
                              // {0,1,1,1}};

          if(sr<0 || sc<0) return ;
          if(sr>er || sc>ec) return;
          if(sr == er && sc==ec){
            System.out.println(s);
            return;
          }
          if(maze[sr][sc]==0) return;
          if(isVisited[sr][sc]==true) return;
          isVisited[sr][sc]=true ;
          
          mazeOfDeadBlockIn4Direction(sr+1, sc, er, ec, s+"D", maze, isVisited);

          mazeOfDeadBlockIn4Direction(sr, sc+1, er, ec, s+"R", maze, isVisited);

          mazeOfDeadBlockIn4Direction(sr, sc-1, er, ec, s+"L", maze, isVisited);

          mazeOfDeadBlockIn4Direction(sr-1, sc, er, ec, s+"U", maze, isVisited);

         isVisited[sr][sc]= false ;
          

    }


    static void mazeOfDeadBlockIn4Direction2(int sr,int sc,int er,int ec,String s,int maze [][]){
         if(sr<0 || sc<0) return;
         if(sr>er || sc>ec) return;
         if(sr==er && sc==ec){
          System.out.println(s);
          return;
         }
         if(maze[sr][sc]==0) return; // Path is blocked
         if(maze[sr][sc]==-1) return;  // Already visited
         maze[sr][sc]=-1;

         mazeOfDeadBlockIn4Direction2(sr+1, sc, er, ec, s+"D", maze);

         mazeOfDeadBlockIn4Direction2(sr, sc+1, er, ec, s+"R", maze);

         mazeOfDeadBlockIn4Direction2(sr-1, sc, er, ec, s+"U", maze);

         mazeOfDeadBlockIn4Direction2(sr, sc-1, er, ec, s+"L", maze);

         maze[sr][sc]=1;
    }

    public static void main(String BKP []){
      int rows=3;
      int cols=4;
      // boolean [][] isVisited= new boolean[rows][cols];
      int maze [] [] =       {{1,0,1,1},//1,1,1},
                              {1,1,1,1},//1,0,1},
                              {0,1,1,1}};//1,1,1},
                            //  {0,0,1,0,1,1}}; 
                            



 
    //   int count =maze(1,1,rows,cols);  // 1st method
    // System.out.println(count);

    //  print(1,1,rows,cols, " "); // 2nd method
   
    // traverseIn4Direction(0, 0, rows-1, cols-1, " ", isVisited);  //3rd method

    // mazeOfDeadBlock(0, 0, rows-1, cols-1, " ", maze); 4th method

    // mazeOfDeadBlockIn4Direction(0, 0, rows-1, cols-1, " ", maze, isVisited);  5th
   
mazeOfDeadBlockIn4Direction2(0, 0, rows-1, cols-1, " ", maze);


    }

}