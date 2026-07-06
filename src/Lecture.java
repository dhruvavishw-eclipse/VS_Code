import java.util.*;

public class Lecture{

public static void counting(){
    Scanner mk=  new Scanner(System.in);
        int n= mk.nextInt();
    int count=0;
      while(n>0){
        n/=10;
       count++;
       
    }
    System.out.println("Total digits in number is   "+ count);
}


public static void sumOfDigit(){
    Scanner mk=  new Scanner(System.in);
        int n= mk.nextInt();
    int ans=0;
    while(n>0){
        ans+=n%10;
         n/=10;
        //   n++;
    }
    System.out.println("Sum of Digits is   "+ ans);
}

public static void reverse(){
    int ans=0;
    Scanner mk=  new Scanner(System.in);
        int n= mk.nextInt();
        while(n>0){
            ans=ans*10 + n%10;
            n/=10;
        }
        System.out.println(ans);
}

public static void series(){
    int ans=0;
    Scanner mk=  new Scanner(System.in);
        int n= mk.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0)
            ans-=i;
            else
            ans+=i;
        }
        System.out.println(ans);
}

public static void factorial(){
    int ans=1;
    Scanner mk=  new Scanner(System.in);
        int n= mk.nextInt();

        
        for(int i=1;i<=n;i++){
            ans=i*ans;

            System.out.println("THe Factorial of  "+ i + " "+ ans);
        }
}


public static void ExpoNent(){
    Scanner mk=  new Scanner(System.in);
    int a= mk.nextInt();
    System.out.println("Enter exponent");
    int b=mk.nextInt();
    int ans=1;
        for(int i=1;i<=b;i++){
            ans*=a; 
        }
        System.out.println(ans);
}

    public static void main(Strings  args[])throws  Exception{

        // Scanner mk=  new Scanner(System.in);
        // int n= mk.nextInt();

        System.out.println("Enter the Number");

ExpoNent();
// factorial();
// series();
        // reverse();
        // sumOfDigit();
//  counting();


    }
}