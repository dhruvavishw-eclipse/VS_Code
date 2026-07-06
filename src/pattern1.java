import java.util.*;
public class pattern1 {

static void RecPat(int r,int c){
  for(int i=1;i<=r;i++){
    for(int j=1;j<=c;j++){
        if( i==1 || i== r || j==1 || j==c)
        System.out.print("*");
        else
        System.out.print(" ");
    }
    System.out.println();
  }
}


static void Traingular(int r, int c){
    for(int i=1;i<=r;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}


static void revTria(int r,int c){
    for(int i=r;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print("*");
        }
        System.out.println();
    }
}


static void pyramid(int r){
    for(int i=1;i<=r;i++){
        for(int j=1;j<=(r-i);j++){
            System.out.print(" ");
        }

        for(int k=1;k<=(2*i-1);k++){
            System.out.print("*");
        }
        System.out.println();
    }
}



static void NumRec(int r){
  for (int i=1;i<=r;i++){
    for(int j=i;j<=r;j++){
        System.out.print(j);
    }
    for(int k=1;k<=i-1;k++){
        System.out.print(k);
    }
    System.out.println();
  }
}


static void NumSer(int r){
    for(int i=1;i<=r;i++){
        for(int j=1;j<=r;j++){

            System.out.print(j);
        }
        System.out.println();
    }
}



static void BinaryBox(int r){
for(int i=1;i<=r;i++){
    for(int j=1;j<=r;j++){
        if((i+j)%2==0)
        System.out.print("0");
        else
        System.out.print("1");
    }
    System.out.println();
}
}

static void NumTrain(int r){
    for(int i=1;i<=r;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}


static void IntPyramid(int r){
  for(int i=1;i<=r;i++){
    for(int j=i;j<+r-1;j++){
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
 

static void Binary(int r){
    int ans=0,pw=1;
      while(r>0){
        int unit_digit= r%10;
        ans+= (unit_digit *pw);
        r/=10;
        pw*=2;

      }
      System.out.println(ans);

}
 
static void DecToBin(int r){
 int ans=0,pw=1;
 while(r>0){
    int parity = r%2;
    ans+= (parity * pw);
     pw*=10;
     r/=2;
 }
 System.out.println(ans);

}






    public static void main ( String BKP []){
      Scanner rcb= new Scanner(System.in);
      System.out.println("Enter number of rows");
      int r=  rcb.nextInt();
    //   System.out.println("Enter no.of columns");
    //   int c= rcb.nextInt();


 DecToBin(r);// 11th FOR DEC TO BIN CONVERSION
// Binary(r); // 10th FOR BINARY CONVERSION
// IntPyramid(r);  // 9th FOR INTEGER PYRAMID
    // NumTrain(r);  // 8th FOR NUMERICAL RECTANGLE
    // BinaryBox(r); // 7th FOR BINARY RECTANGLE PATTERN
      // NumSer(r);   // 6th FOR NUMERICAL SERIES PATTERN
     // NumRec(r);  //5th FOR NUMERICAL RETANGULAR PATTER
    //    pyramid(r);    // 4th FOR PYRAMID PATTERN 
     // revTria(r, c);  // 3rd FOR REVERSE TRAINGULAR PATTERN
    //    Traingular(r, c);  // 2nd FOR TRIANGULAR PATTERN
    //  RecPat(r, c);   1st  FOR RecPat ();

    //   for(int i=1;i<=r;i++){
    //     for(int j=1;j<=c;j++){
    //     System.out.print("*");
    //   }      
    //   System.out.println();
    // }

}
}