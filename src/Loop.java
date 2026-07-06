import java.util.*;
public class Loop {
    

static void P1 (){
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            System.out.print("*");

        }
        System.out.println();
    }
}


static <m> void hollowrecta( int m, int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if((i ==1 || j==1) || (i==n || j==m)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


static void halfpyra(int m,int n){
    for(int i=1;i<=m;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
 

static void revpyra(int m,int n){
    for(int i=m;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print("*");
        }
        System.out.println();
    }
}


static void RightPyra(int m,int n){
     for(int i=1;i<=n;i++){
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
     }
}


static void NumPyra(int m,int n){
    for(int i=1;i<=m;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+ " ");
        }
        System.out.println();
    }
}

static void InvPyr(int m){
    for(int i=1;i<=m;i++){
        for(int j=1;j<=m-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}

static void FloydTri (int m){
    int num=1;
    for(int i=1;i<=m;i++){
        for(int j=1;j<=i;j++){
            System.out.print(num+ " ");
            num++;
        }
        System.out.println();
    }
}
static void BinTri(int m){
    for(int i=0;i<m;i++){
        for(int j=0;j<=i;j++){
            if( (i+j)%2==0){
                System.out.print("1 ");
            }
            else
            System.out.print("0 ");
        }
        System.out.println();
    }
}




    public static void main( Strings  []args){
         int m=5,n=5;







BinTri(m);
// FloydTri(m);
// InvPyr(m);
// NumPyra(m, n);
// RightPyra(m, n);
// revpyra(m, n);
// halfpyra(m, n);
        //  hollowrecta(m, n);
// P1();
    }
}
