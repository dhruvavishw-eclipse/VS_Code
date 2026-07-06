import java.util.*;

import javax.annotation.processing.SupportedOptions;
public class TCS2 {

     static int findh(int hour){
         int cost =0;
         if(hour<=2){
            cost= hour*100;
         }
         else if(hour<=5){
            cost= (2*100) + (hour-2)*50;
         }
         else{
            cost = (2*100)+ (3*50)+ (hour-5)*20;
         }
         return cost;
     }

    public static void main(String [] BKP){
       
        Scanner awm=new Scanner(System.in);
        
        int a=9,b=10;

     System.out.println(a | b);  // 11
     System.out.println(a & b);  //8
     System.out.println( a ^b);  //3
     System.out.println(a<<1);   //18
     System.out.println(a<<2);  //36
     System.out.println(b>>1);  //5
     System.out.println(b>>2);  //2
        System.out.println(~a);  
        
        
   //      int day= awm.nextInt();

   //   switch (day) {
   //    case 1:
   //       System.out.println("Monday");
   //     break;
       
   //     case 2:
   //     System.out.println("Tuesday");
   //     break;
       
   //     case 3:
   //     System.out.println("Wednesday");
   //     break;

   //     case 4:
   //     System.out.println("Thursday");
   //     break;

   //     case 5:
   //     System.out.println("Friday");
   //     break;

   //     case 6:
   //     System.out.println("Saturday");
   //     break;

   //     case 7:
   //     System.out.println("Sunday");
   //     break;
  
   //    default:
   //    System.out.println("Invalid number");
   //       break;
   //   }


      //   String ans;
      //  ans =  (n%2==0)? "Yes it is twooo": "Ye nahi aaya range me";
      //  System.out.print(ans);
    
      //   ans=(n%2==0 && n%3==0)? "true" : "false";
      //   System.out.print(ans);

      //   ans=(n%5==0 || n%3 ==0)? "Yes ": "NO";
      //   System.out.println(ans );
        
      //   System.out.println(findh(hour));
        // double  a= awm.nextDouble();
        // if(a <0)
        // System.out.println("Error");
        // else{
        //  double d=0;
        //  if(a<1000){
        //     d=0.05;
        //  }
        //  else if(a<=5000){
        //     d=0.10;
        //  }
        //  else{
        //     d=0.15;
        //  }
        //  double FA= a-(a*d);
        //  System.out.printf("%.0f",FA);
        // }      
        // awm.close();




        // double num= awm.nextDouble();
        // System.out.printf("%.5f", num);
    }
}
