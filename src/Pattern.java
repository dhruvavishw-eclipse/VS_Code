import java.util.*;

public class Pattern {

    public static void rec(){
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                System.out.println("i is "+i + "   j is  "+j);
            }
        }
    }

    public static void recta(){
        for(int i=1;i<=3;i++){
for(int j=1;j<=6;j++){
    System.out.print("*");
}
System.out.println(" ");
        }

    }


    public static void hollowrect(){

        Scanner mk= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r= mk.nextInt();
        System.out.println("Enter number of columns");
        int c= mk.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
             if(i==1 || i==r || j==1 || j==c)
                System.out.print("*");
                else
                System.out.print(" ");
             
            }
            System.out.println();
        }
    }
    


    public static void triangle(){
Scanner mk=new Scanner(System.in);
System.out.println("Enter number of rows");
int r=mk.nextInt();
// System.out.println("Enter number of columns");
// int c=mk.nextInt();

for(int i=0;i<=r;i++){
    for(int j=0;j<=i;j++){
System.out.print("*");
    }


    System.out.println();
}
    }
    


    public static void reversetria(){
Scanner mk=new Scanner (System.in);
System.out.println("Enter number of Rows and Columns Simultaneously");
int r=mk.nextInt();
for(int i=1;i<=r;i++){
    for(int j=r;j>=i;j--){
        System.out.print("*");

    }
    System.out.println(" ");
}
    }



    public static void pyramid(){
        Scanner mk=new Scanner (System.in);
        int r=mk.nextInt();
        for(int i=1;i<=r;i++ ){
 for(int j=1;j<=r-i;j++){
    System.out.println(" ");
 }

 
for(int k=1;k<=2*i-1;k++){
    System.out.print("*");
}
System.out.println();
        }
    }



    public static void intrect(){

Scanner mk= new Scanner (System.in);
System.out.println("Enter number");
int r=mk.nextInt();
for(int i=1;i<=r;i++){
    for(int j=i;j<=r;j++){
        System.out.print(j);
    }
    for(int k=1;k<=i-1;k++){

        System.out.print(k);
    }
    System.out.println();
}
    }


    public static void recint(){
        Scanner mk= new Scanner (System.in);
        System.out.println("Enter num");
        int n=mk.nextInt();
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

     public static void rechollow(){
        Scanner mk= new Scanner (System.in);
        System.out.println("Enter number of COlumns");
        int c=mk.nextInt();
        System.out.println("Enter number of rows");
        int r=mk.nextInt();

        for(int i=1;i<=c;i++){
            for(int j=1;j<=r;j++){
                if(i==1 || i==c || j==1 || j==r){
                    System.out.print(j);
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
     }


     public static void numrep(){
       Scanner mk=new Scanner(System.in);
       System.out.println("Enter numbers for columns");
       int c=mk.nextInt();
       System.out.println("Enter numbers for rows");
       int r=mk.nextInt();
       for(int i=1;i<=c;i++){
        for(int j=1;j<=r;j++){
            if((i+j)%2==0){
                System.out.print("1");
            }
           
           else
            System.out.print("2");
        }
        
        System.out.println();
       }

     }

     public static void numtri(){
        Scanner mk=new Scanner (System.in);
        System.out.println("Enter number");
        int n=mk.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
     }

public static void numpyramid(){
    Scanner  mk=new Scanner (System.in);
    // System.out.println("Enter columns");
    // int c=mk.nextInt();
    System.out.println("Enter rows");
    int r=mk.nextInt();
    for(int i=1;i<=r;i++){
        for(int j=1;j<=r-i;j++){
            System.out.print(" ");
        }
      for(int k=1;k<=i;k++){
        System.out.print(k);
      }
      for(int l=i-1;l>=1;l--){
        System.out.print(l);
      }
      System.out.println();
    }
}

public static void sorec(){
    Scanner mk= new Scanner(System.in);
    System.out.println("Enter number for square");
    int n=mk.nextInt();

    for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void hollsq(){
    Scanner mk=new Scanner (System.in);
    System.out.println("Enter columns");
    int c=mk.nextInt();
    System.out.println("Enter rows");
    int r=mk.nextInt();
    for(int i=0;i<=c;i++){
        for(int j=0;j<=r;j++){
             if(i==0 || i==c || j==0 || j==r){
                System.out.print("*");
             }
             else
             System.out.print(" ");
        }
        System.out.println();
    }
}


public static void reverserec(){
    Scanner mk= new Scanner (System.in);
    System.out.println("Enter  number");
    int n=mk.nextInt();

    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

}


public static void rec90(){
    Scanner mk=new Scanner(System.in);
    System.out.print("Enter number");
    int n=mk.nextInt();
    for(int i=0;i<=n;i++){
        for(int j=0;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=n-i;k<=n;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}


public static void numrec(){
       Scanner mk=new Scanner(System.in);
       System.out.print("Enter number");
       int n=mk.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
       }
}



public static void revnumrectan(){
    Scanner mk=new Scanner (System.in);
    System.out.print("Enter number");
    int n=mk.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }
        // for(int k=)
        System.out.println();
    }
}



public static void floyd(){
    Scanner mk=new Scanner (System.in);
    System.out.println("Enter number of rows");
    int n=mk.nextInt();

    int number=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(number+ " ");
            number++;
        }
        System.out.println();
    }
}



public static void binnum(){
    Scanner mk=new Scanner (System.in);
    System.out.println("Enter number of  rows");
    int n=mk.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                  System.out.print("1");
            }
            else
            System.out.print("0");
        }
        System.out.println();
    }
}



public static void butterfly(){
    Scanner mk=new Scanner(System.in);
    System.out.println("Enter number");
    int n=mk.nextInt();
    //   code for upper half
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");

        }
        //    for spcaces
        int s=2*(n-i);
        for(int j=1;j<=s;j++){
            System.out.print(" ");

        }
        for(int j=1;j<=i;j++){
            System.out.print("+");
        }
        System.out.println();
    }
     
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("@");

        }
        //    for spcaces
        int s=2*(n-i);
        for(int j=1;j<=s;j++){
            System.out.print(" ");

        }
        for(int j=1;j<=i;j++){
            System.out.print("^");
        }
        System.out.println();
    }
}





public static void rhombus(){
    Scanner mk=new Scanner (System.in);
    System.out.print("Enter number of rows");
    int n=mk.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
           
                System.out.print("*");
            
        }
        System.out.println();
    }
}
public static void numpy(){
    Scanner mk=new Scanner (System.in);
    System.out.println("Enter number of rows");
    int n=mk.nextInt();
    for(int i=1;i<=n;i++){
        // for spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }

        for(int k=1;k<=i;k++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public static void palindromic(){
    Scanner mk= new Scanner (System.in);
    System.out.print("Enter number of rows");
    int n=mk.nextInt();
    for(int  i=1;i<=n;i++){
        // spaces
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");

         }
        //  first half
         for(int k=i;k>=1;k--){
            System.out.print(k);
         }
            // second half

              for(int l=2;l<=i;l++){
                System.out.print(l);
              }
            System.out.println();
    }
}


public static void diamond(){
    Scanner mk=new Scanner (System.in);
    System.out.print("Enter number of rows");
    int n=mk.nextInt();
    for(int i=1;i<=n;i++){
        // for spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // stars
        for(int k=1;k<=2*(i-1);k++){
              System.out.print("*");
        }
        System.out.println();
    }


    for(int i=n;i>=1;i--){
        // for spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // stars
        for(int k=1;k<=2*(i-1);k++){
              System.out.print("*");
        }
        System.out.println();
    }
}


    public static void main(Strings  args[]){

diamond();
// palindromic();
        // numpy();
// rhombus();
// butterfly();
        // binnum();
// floyd();
// revnumrectan();
// numrec();
// rec90();
// reverserec();
// hollsq();
        // sorec();
// numpyramid();
// numtri();
// numrep();nu
// rechollow();
        // recint();
        // intrect();
// pyramid();
// reversetria();
// triangle();
        // hollowrect();
        // recta();
// rec();
    }
}
