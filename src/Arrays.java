import java.util.*;

public class Arrays {

public static void ar(){
    int []age = new int[3];
    Strings mk []= new Strings [3];
    float [] flooat=new float [3];
age[0] = 27;
age[1]= 5;
age[2]= 275;

System.out.println(age[0]);
System.out.println(age[1]);

System.out.println(age[2]);
}


public static void forloop(){
    int []age = new int[3];
    age[0] = 27;
age[1]= 5;
age[2]= 275;

for(int i=0;i<3;i++){
System.out.println(age[i]);    
}
}


public static void foreach(){
    int []age = new int[3];
    age[0] = 27;
age[1]= 5;
age[2]= 275;

for(int ages : age){
    System.out.println(ages);
}
}


public static void whileloop(){
    int []age = new int[3];
    age[0] = 27;
age[1]= 5;
age[2]= 275;

int i=0;
while(i<3){
    System.out.println(age[i]);
    i++;
}

}



public static void sum(){
    int arrr []= {1,3,5,27,6,};
    int sum=0;
    for(int i=0;i<arrr.length;i++){
          sum+=arrr[i];
    }
System.out.print(sum);
}


     public static void max(){
    int arrr []= {1,3,5,27,6,};
    int max= Integer.MIN_VALUE;
        for(int i=0;i<arrr.length; i++){
            if(arrr[i]>max){
                max=arrr[i];
            }
        }
        System.out.println(max);

}

public static void search(){
    int arrr []= {1,3,5,27,6,};
    int x=27;
//  int y=05;
 int ans= -1;

for(int i =0;i<arrr.length;i++){
    if(arrr[i]==x){
        ans=i;
    
        
    }
    
}
System.out.print(ans);

}


public static void input(){
    Scanner mk= new Scanner (System.in);
    System.out.print("Enter size of array");

    int n=mk.nextInt();
   int arr []= new int [n];
      System.out.print("Enter " + n+ " elements of array");
      for(int i=0;i<n;i++){
        arr[i]= mk.nextInt();
      }

for(int i=0;i<n;i++){
    System.out.print(arr[i]+ " ");
}

}


static int count_x(int arr [],int x){


    Scanner mk=new Scanner(System.in);
    // System.out.print("Enter size of array");
    // int n=mk.nextInt();
    // System.out.print("Enter search element");
    // int num= mk.nextInt();

    int count=0;
    // int arr []= new int [n];


    // for(int i=0;i<n;i++){
    //     arr[i]=mk.nextInt();
    // }
for(int i=0;i<arr.length;i++){
    if(arr[i]==x){
        count++;
    }
}
return count;

}

static int lastoccurence(int arr [],int x){
 int ans=-1;
for(int i=0;i<arr.length;i++){
    if(arr[i]==x){
        ans=i;
    }
}
        return ans;
}


static int greaternum(int arr [],int x){
    int count =0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>x){
            count++;
        }
    }
    return count;
}


static boolean sortingg(int arr []){
    boolean check = true;
    for(int i=1;i<arr.length;i++){
        if(arr[i]<arr[i-1]){
            check= false;
            break;
        }
    }
     return check ;
}

static   int [] smallLarge(int [] arr){
    Arrays.sort(arr);
   int [] ans={arr[0],arr[arr.length-1]};
   return ans;
}


static int  targetsum(int arr[],int target){
    int n=arr.length;
    int ans=0;
     for(int  i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target)
            ans++;
        }
     }
  return ans;

}


static int triplesum(int arr [],int target){
    int ans=0;
    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=j+1;j<n;k++){
                if(arr[i]+arr[j]+arr[k]==target)
                ans++;
            }
        }
    }
    return ans;
}






    public static void main(Strings args []){
        // int arr []= {1,3,27,27,5,27,67};
        int arr []={3,5,4,3,1,6,7,2};
            int target=8;             



            System.out.println(triplesum(arr, target));
// System.out.println(targetsum(arr, target));
            // System.out.print(smallLarge(arr));

// System.out.print(sortingg(arr));
// System.out.print("Element greater than x is " + greaternum(arr, x));
            // System.out.print(lastoccurence(arr, x));
// System.out.println( "Count of x = " +count_x( arr , x));
// input();
// search();
        // max();

        // sum();
        // whileloop();/
// foreach();
// forloop();
        // ar();

    }


    public static List<String> asList(String string, String string2, String string3, String string4, String string5) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }


    public static int[] copyOf(int[] mapping, int v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copyOf'");
    }


    public static void fill(int[] mapping, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fill'");
    }
    
}
