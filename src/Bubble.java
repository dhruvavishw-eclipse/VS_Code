import java.util.*;
public class Bubble {


    static void bubbleDes(int arr []){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
           for(int j=0;j<n-i-1;j++){
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag= true;
            }
           }
           if(!flag) return;
        }
    }


    static void bubble(int arr []){
      int n=arr.length;
      for(int i=0;i<n-1;i++){
        boolean flag=false;
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true;
            }
        }
        if(!flag) return;

      }
       
    }


  
    public static void main(String BKP []){
        Scanner rcb= new Scanner(System.in);
        // int arr []={6,9,3,2,8,0,23,35};
        int arr []={0,1,2,3,4,5,6,7,8};
        // bubble(arr);
      bubbleDes(arr);
        for(int i:arr){
            System.out.print(i+ ",");
        }
  
        // TIME COMPLEXITY 

        // BEST CASE O(n)
        // WORST CASE O(n^2)
        // AVERAGE CASE O(n^2)


        // SPACE COMPLEXITY 
        // O(1)





    }
    
}
