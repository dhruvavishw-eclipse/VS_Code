 import java.util.*;
 public class loopp {
    public static void main(String[] args) {
        Scanner rcb= new Scanner(System.in);
        System.out.println("Enter number ");
          int a= rcb.nextInt(),b=rcb.nextInt();

          int ans=1;
          for(int i=1;i<=b;i++){
            ans *=a;
          }System.out.println(ans);
          
          


                //  int ans=0,fact=1;
                //   for(int i=1;i<=n;i++){
                //     fact=fact *i;
                //     System.out.println("Factorial of " +i +"!" +" " +fact);
                //   }
            



      //  for(int i=1;i<=n;i++){
      //   if(i%2==0){
      //     ans-=i;
      //   }
      //   else
      //   ans+=i;
      //  }
      //  System.out.println(ans);



      //  while(n>0){
          
      //      ans=(ans*10 )+ (n%10);
      //       n/=10;
      //  }
      //  System.out.println(ans);


      //  int num=1;
      // myloop: while(num<=50){
      //   if( num%3==0){
      //       num++;
      //      continue myloop;
      //   }
      //   System.out.println(num);
      //   num++;
      //  }



            // for(int i=1;i<10;i++ ){
            //   if(i%3==0){
            //     continue;
            //   }
            //   System.out.println(i);
            // }


          //  int num=1;
          //  while(true){
          //   if((num %5==0) && (num %7==0)){
          //     System.out.println("Found ans " + num);
          //     break;
          //   }
          //   num++;
          //  }
                          


          // do{
          //   System.out.println(num);
          //   num++;
          // }while(num<=40);



    // for(int i =n;i>=1;i-=2){

    //     System.out.println(i);
    // }




            // int num=1;
            // while(num<=n){
            //     sum+=num;
            //     System.out.println(sum);
            //     num++;
            // }

       
    }
}
