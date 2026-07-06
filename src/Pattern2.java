import java.util.*;

public class Pattern2 {



      static void square(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
      }


      static void trianngle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
      }


    static void numTriangle(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }



    static void numTriangle2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    static void upperTriangle(int n){
       for(int i=1;i<n;i++){
          for(int j=i;j<n;j++){
            System.out.print("*");
          }
          System.out.println();
       }
    }



    static void numTriangle3(int n){
       for(int i=1;i<n;i++){
        for(int j=n;j>i;j--){
            System.out.print(n-j+1);
        }
        System.out.println();
       }
    }


    static void BinTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                if((i+j)%2!=0)
                System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }
    }


     static void NumSeriesTraingle(int n){
        int num=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                  System.out.print(num + " ");
                  num++;
                }
                System.out.println();
            }
         }




        static void pattern7(int n){
            for(int i=0;i<n;i++){
                for (int j=0;j<(n-i-1);j++){
             System.out.print(" ");
                }
                for(int k=0;k<((i*2)+1);k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    
        static void pattern8(int n){
            for(int i=0;i<n;i++){
               for(int j=0;j<i;j++){
                System.out.print(" ");
               }

               for(int k=0;k<2*n-(2*i+1);k++){
                 System.out.print("*");
               }
               System.out.println();
            }
        }




        static void pattern9(int n){
            pattern7(n);
            pattern8(n);
        }



        static void pattern10(int n){
            for(int i=1;i<=(2*n-1);i++){
                int star=i;
                if(i>n) star=2*n-i;
                for(int j=1;j<=star;j++){
                    System.out.print("*");
                }

                // for(int k=(2*n)-i;k>=0;k--){
                //     System.out.print("*");
                // }
                System.out.println();
            }
        }


        static void pattern12(int n){
            int space=2*(n-1);
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }

                for(int z=1;z<=space;z++){
                    System.out.print(" ");
                }

                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                System.out.println();
                space-=2;
            }
        }



        static void pattern14(int n){
            for(int i=0;i<n;i++){
                for(char ch='A';ch<='A'+i;ch++){
                    System.out.print(ch+" ");
                }
                System.out.println();
            }
        }


        static void pattern15(int n){
            for(int i=0;i<n;i++){
                for(char ch='A';ch<='A'+(n-i-1);ch++){
                    System.out.print(ch+" ");
                }
                System.out.println();
            }
        }


        static void pattern16(int n){
            for(int i=0;i<n;i++){
               char ch=  (char) ('A'+i);
                for(int j=0;j<=i;j++){
                    System.out.print(ch+" ");
                }
                System.out.println();
            }
        }


        static void pattern17(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++)
                    System.out.print(" ");
       
               char ch='A';
               int breakpoint =(2*i+1)/2;
               for(int k=0;k<2*i+1;k++){
                System.out.print(ch);
                if(k<breakpoint) ch++;
                else ch--;

                
               }

                for(int j=0;j<n-i-1;j++){
                    System.out.print(" ");
                }
 System.out.println();

                }
            }
        


        static void pattern18(int n){
              for(int i=0;i<n;i++){
                char c=(char) i;
                for(char ch='E'-c;ch<='E';ch++){
                    System.out.print(ch+" ");
                }
                System.out.println();
              }
            }

            
      static void pattern19(int n){
        int space=0;
        for(int i=0;i<n;i++){ 
           for(int j=1;j<=n-i;j++){
            System.out.print("*");
           }

            for(int j=0;j<space;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            space+=2;
   System.out.println();
        }


     space=2*n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print("*");
           }

            for(int j=0;j<space;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            space-=2;
   System.out.println();
        }
   }


     static void pattern20(int n){
        int spaces=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            System.out.println();
            if(i<n) spaces -=2;
            else spaces +=2;
        }
     }


     static void pattern21(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==(n-1) || j==0 || j==(n-1)){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }

     }



     static void pattern22(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i,left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
            }
        }
     }



         public static void main(String BKP []){
        Scanner rcb= new Scanner(System.in);
         System.out.println("Enter n");
        int n=rcb.nextInt();


          
           
       pattern21(n);
        // pattern9(n);
        // pattern7(n);
        //    pattern8(n);
        // NumSeriesTraingle(n);
        //   BinTriangle(n);
        //   numTriangle3(n);
        // upperTriangle(n);
        //  numTriangle2(n);
        //  numTriangle(n);
        // trianngle(n);
        // square(n);


    }
    
}
