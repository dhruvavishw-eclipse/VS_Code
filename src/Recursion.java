import java.util.*;

public class Recursion {


  static void printDecreasing(int n){
     // Base case
     if(n==1){
        System.out.println(n);
        return;
     }

     //Self Work
     System.out.println(n);

     // Recursive Work
     printDecreasing(n-1);

  }


    static void printIncreasing(int n){
            if(n==1){
                System.out.println(n);
                return ;
            }

           printIncreasing(n-1);
           System.out.println(n);

    }


    static int factorial(int n){
        if(n==0) 
             return 1;

        
        //  int ans =0;
        // ans=factorial(n-1)*n;
        // return ans;
        return factorial(n-1) *n;
        
    }


    static int fibonacci(int n){
        if(n==0 || n==1) return n;
        
        return fibonacci(n-1)+ fibonacci(n-2);
    //    int pre=fibonacci(n-1);
    //    int prePre=fibonacci(n-2);
    //    return pre+prePre;
    }

    static int sumOfDigit(int n){
        if(n>=0 && n<=9) return n;
        // int sum=0;
        //  sum +=sumOfDigit(n%10) + sumOfDigit(n/10);
        // return sum;
        return sumOfDigit(n/10) + n%10;
    }


    static int numOfDigit(int n){
        if(n>=0 && n<=9) return 1;   
        //  int ans;
        //  ans= 1+ numOfDigit(n/10);
         
        //  return ans;
        return 1+numOfDigit(n/10);
    }



    static int pow(int a, int b){
       if(b==0) return 1;
       return pow(a, b-1) * a;

    }

    static int pow2(int a,int b){
        if(b==0) return 1;
        int ans=pow2(a, b/2);

        if(b%2==0){
            return ans *ans;
        }
        return a* ans*ans;

    }


  static void printKMul(int num1,int num2){
    if(num2==0){
       // System.out.println(num1);
        return ;
    } 

    printKMul(num1, num2-1);
    System.out.println(num1*num2);
  }


  static int seriesSum(int n){
    if(n==0) return 0;
    return seriesSum(n-1) +n;
  }



 static int seriesSum2(int n){
    if(n==0) return 0;
    if(n%2!=0){
   return seriesSum2(n-1) +n;
    }
    return seriesSum2(n-1)-n;
 }


 static int iGCD(int x,int y){
    while(x%y!=0){
        int rem=x%y;
        x=y;
        y=rem;
    }
    return y;
 }


  static int gcd(int x,int y){
    if(y==0) return x;

    return gcd(y, x%y);
  }


  static int GCD2 (int x,int y){
    if(y==0) return x;
     return GCD2(y, x%y);
  }

static int lcm(int x,int y){
    if(y==0) return x;
   int gcD= gcd(y, x%y);
    //int gcd = lcm(y, x%y);
    return (x*y)/gcD;
    
}


    public static void main(String[] args) {
        Scanner rcb= new Scanner(System.in);
        int n=rcb.nextInt();




System.out.println(GCD2(13, 20));
        // printIncreasing(n);
        // printDecreasing(n);
        // System.out.println(factorial(n));
           // System.out.println(fibonacci(n));
        //    System.out.println(sumOfDigit(n));
        // System.out.println(numOfDigit(n));
        // System.out.println(pow(10, 3));
        // System.out.println(pow2(2, 5));
        // printKMul(5, 6);
        // System.out.println(seriesSum(n));
        //   System.out.println(seriesSum2(n));
        // System.out.println(iGCD(9, 13));
// System.out.println(gcd(40, 30));
// System.out.println(lcm(40, 30));


    }
        }
    

