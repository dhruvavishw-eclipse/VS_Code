import java.util.*;

public class Recursionn {

static int lcm(int x,int y){
    
}

      
static int gcd(int x,int y){
    if(y==0) return x;
    return gcd(y, x%y);
}



static int seriesSum2(int n ){
    if(n==0) return 0;

    if(n%2==0){
        return seriesSum2(n-1) -n;
    }
   else{
    return seriesSum2(n-1)+n;
   }
}


 static int seriesSum(int n){
    if(n==0){
        return 0;
    }
    return seriesSum(n-1) + n;
 }



static void printMultiple(int n,int k){
    if(k==1){
        System.out.println(n);
        return;
    }

    printMultiple(n, k-1);
      System.out.println(n*k);

}


    static void solution(int n){

     if(n==1){
         System.out.println(1);
         return;
        }
        System.out.println(n);
        solution(n-1);


    }
    // static void printInte(int n){
    //     if(n==1){
    //     System.out.println(n);
    //     return;
    //     }
    //     printInte(n-1);
    //     System.out.println(n);
    // }


   static int factorial(int n){
      if(n==0) return 1;
      int smallans=factorial(n-1);
       int ans= n*smallans;
       return ans;
     
   }


   static int fibona (int n){
       if(n==0 || n==1)
          return n;
    //   int prev= fibona(n-1);
    //   int prevPrev =fibona(n-2);

    //   int ans= prev+prevPrev;
    //  return ans;

    //return prev+prevPrev;

    return fibona(n-1)+ fibona(n-2);
   }



static int sumOfDig(int n){

    if(n>=0 && n<=9){
        return n;
    }
///int smallans = sumOfDig(n/10);
// return smallans+ n%10;
      // OR
       return sumOfDig(n/10)+ n%10;
  
}

static int count(int n){
    if(n>=0 && n<= 9){
        return 1;
    }
    int countt=0;
    count(n/10);
    countt ++;
    return countt;
}

// static int pow(int p,int q){
//     if(q==0) return 1;
//     return pow(p,q-1)*p;
// }

static int pow(int p,int q){
    if(q==0) return 1;
    int smallpow= pow(p, q/2);
    if(q%2==0){
        return smallpow* smallpow;
    }
    return p* smallpow*smallpow;
}



    public static void main(String [] eclipse){
     Scanner css= new Scanner(System.in);//
    //  System.out.println("Enter number");
     int x=css.nextInt();
     int y=css.nextInt();

    //  printInte(n);
    // solution(n);
    // System.out.println(factorial(n));

    // for(int i=0;i<=n;i++){
    //    System.out.println(fibona(i));

    // }



    // System.out.println(sumOfDig(n));

    // System.out.println(count(n));
//   System.out.println(pow(2, q 5));
// System.out.println(pow(2, 6));/

// printMultiple(n, k);

// System.out.println(seriesSum(n));

// System.out.println(seriesSum2(n));

System.out.println(gcd(x, y));

    }
}
