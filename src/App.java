import java.util.*;

public class App {
public static void revise(){
// double m =27,d=5;
double m1=69;
double m2=55;
double discrete=64;
double m3=53;
double  ans= m1+m2+discrete+m3;

double anss= (ans/280)*100;

System.out.println(anss);




// System.out.println(m+d);
// System.out.println(m-d);
// System.out.println(m*d);
//     System.out.println(27.0/5);
//     System.out.println(m%d);

}
 


public static void whileloop(int input){
int num=1;
int sum=0;
while(num<=input){
    System.out.println(num);
    sum=num+sum;
    num++;
}
System.out.println(sum);
}

public static void forloops(int input){
    int sum=0;
    int num =input;
    for(;num>=1;){
        System.out.println(num);
        num-=2;
    //    sum=sum+num;
    }   //System.out.println(sum);
}



public static void dowhileloop(int input){
    int num=100;
    do{
        System.out.println(num);
        num++;
    }
    while(num<=input);{
// System.out.println(num);
    }
}


public static void breAk(){
    // for(int i=0;i<  ;i++){    
    // }
int num=1;
    while(true){
        if((num%5==0) && (num%7==0)){
System.out.println("Found it  " + num);
        break;
        }
        num++;
    }
}

public static void whileee(int num){
    Scanner mk= new Scanner (System.in);
    int sum=0;
    do{
        sum+=num;
        num= mk.nextInt();
    }
        while(num!= -1);
    
     
        System.out.println(sum);
}


public static void continUe(){
    
    // for(int sum=1;sum<=50;sum++){
    //     if(sum %3==0)
    //     continue;
    //     System.out.println(sum);
    // }
    int num=1;
    while(num<=50){
        if (num %3==0){
            num++;
            continue;
        }
        System.out.println(num);
         num++;
        }
}


    public static void main(Strings[] args) throws Exception {
  

        // Scanner mk= new Scanner (System.in);
        // System.out.println("Enter number");
        // int num=mk.nextInt();
continUe();
        // breAk();
        // whileee(num);
// dowhileloop(num);
        //  forloops(input);
        //revise();
        // whileloop(input);
        // int k = 1;
        // for (int i = 0; i < 4; i++) {
        //     // int c=0;
        //     for (int j = 0; j <= i; j++) {
        //         if (j%2!=0)
        //             System.out.print("*");
                    
        //         System.out.print(k++);
        //     }
        //     System.out.println();
        // }
        // k=1;
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         if (j % 2 == 0)
        //             System.out.print(k);
        //         else
        //             System.out.print("*");
        //     }
        // }
    }
    
}
