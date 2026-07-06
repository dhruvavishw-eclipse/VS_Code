import java.util.*;
public class Numbersys{
 
    public static void binaRy(){
        Scanner mk= new Scanner(System.in);
        System.out.println("Enter Binary number");
        int binary_num=mk.nextInt();
          int ans=0;
          int power=1;
        while(binary_num>0){
              int unit_digit= binary_num%10;
              ans+= unit_digit * power;
              binary_num/=10;
              power*=2;     
        }
        System.out.println(ans);
    }
    
public static void repeat(){
    Scanner mk= new Scanner(System.in);
    System.out.println("Enter Binary number");
    int bn=mk.nextInt();
    int ans=0 ;
    int power=1;
    while(bn>0){
        int ud= bn %10;
        ans+=ud* power;
        bn/=10;
        power*=2;

    }
    System.out.println("Binary to Decimal is   "+ ans);
}



public static void decimal(){
    Scanner mk=new Scanner (System.in);
    System.out.println("Enter Decimal number");
    int decimal=mk.nextInt();
int ans=0;
int power=1;

while(decimal>0){
    int parity=decimal %2;
    ans+= parity* power;
    decimal/=2;
    power*=10;
}
System.out.println(ans);

}



public static void bn2(){
    Scanner  mk=new Scanner(System.in);
    System.out.println("Enter Binary number");
    int bn=mk.nextInt();
    int ans=0;
    int power=1;
    while(bn>0){
        int ud=bn%10;
        ans+= power * ud;
        bn/=10;
        power*=2;
    }
    System.out.println(ans);
    
}

public static void dm2(){
    Scanner mk=new Scanner (System.in);
    System.out.println("Enter Decimal number");
    int dm=mk.nextInt();
    int ans=0;
    int power=1;
    while(dm>0){
        int parity= dm%2;
         ans+= parity*power;
         dm/=2;
         power*=10;         
    }
    System.out.println(ans);
}

    public static void main(Strings  mky[]){

dm2();
// bn2();
// decimal();
// repeat();
// binaRy();
    }
}
