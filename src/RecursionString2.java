import java.util.*;

public class RecursionString2 {
   
    
    static String removeA(String s,int index){
        //   base case
        if(index==s.length()) return " ";
        // revursive work
        String smallans= removeA(s, index+1);
        char current=s.charAt(index);
        
        // self work
        if(current!='a')
        return current+smallans;
        else
        return smallans;
    }

    
    
        static String removeA2(String s){
            if(s.length()==0) return " ";
            String smallAns=removeA2(s.substring(1));
    
            char current=s.charAt(0);
            if(current!='a')
            return current+smallAns;
            else
            return smallAns;
        }


        static String reverseStr(String s,int idx){
            if(idx==s.length()) return " ";
           String smallAns= reverseStr(s, idx+1) ;
           return smallAns+s.charAt(idx);
            
        }



        static String reverseStr2(String s){
            if(s.length()==0) return " ";
            String ans=reverseStr2(s.substring(1));
            return ans+s.charAt(0);
        }


        static boolean palindrome(String s,int l,int r){
            if(l>=r) return true;
            return (s.charAt(l)==s.charAt(r) && palindrome(s, l+1, r-1));

        }


        static ArrayList<String> getSSQ(String s){
            ArrayList<String> ans=new ArrayList<>();
            if(s.length()==0){
                ans.add("");
                return ans;
            }

            char curr=s.charAt(0);
            ArrayList<String> smallans =getSSQ(s.substring(1));

            for(String ss: ans){
                ans.add(ss);
                ans.add(curr + ss);
            }
            return ans;
        }


        static void subsetSum(int arr [],
        int n, int idx,int sum){
            if(idx>=arr.length){
              System.out.println(sum);
              return;
            }
        subsetSum(arr, n, idx+1, sum+arr[idx]);
        subsetSum(arr, n, idx+1, sum);
           

            
        }



        static void printSSQ(String s,String currAns){ //s ="abc",currAns=""
         if(s.length()==0){
            System.out.println(currAns);
            return;
         }
            char curr=s.charAt(0); // a
            String remString=s.substring(1);
            printSSQ(remString, currAns+curr); // add curr
            printSSQ(remString, currAns); // do not add curr

        }

        static int frogJump(int h[],int n
        ,int index){

            if(index==n-1) return 0;
            int op1=Math.abs(h[index] -h [index+1]) + frogJump(h, n, index+1);
            if(index==n-2) return op1;
            int op2=Math.abs(h[index] -h [index+2]) + frogJump(h, n, index+2);
          return Math.min(op1, op2);

        }


        static void keyPadCobination(String dig,
        String []kp,String res){
            if(dig.length()==0) {
                System.out.print(res+" ");
                return;
            }

            int currNum=dig.charAt(0)-'0';
            String currchoices=kp[currNum];
            for(int i=0;i<currchoices.length();i++){
                keyPadCobination(dig.substring(1), kp, res+currchoices.charAt(i));

            }

        }


         



    public static void main(String BKP []){
        // Scanner rcb=new Scanner (System.in);
        // System.out.println("Enter Input String");
        // String s=rcb.nextLine();
        // String palindrome=reverseStr2(s);
        // System.out.println(removeA(s, 0));
        // System.out.println(removeA2(s));
        // System.out.println(reverseStr(s, 0));
        // System.out.println(reverseStr2(s));
        
        // if(palindrome.equals(s))
        // System.out.println("Palindrome");
        // else
        // System.out.println("! Palindrome");
        // System.out.println(palindrome(s, 0, s.length()-1));

        // ArrayList<String> ans1=getSSQ("abc");
        // for(String ss: ans1){
        //     System.out.println(ss);
        // }
        // printSSQ("abc", "");
        // int arr  []={2,4,5};
        // subsetSum(arr, 3, 0, 0);
        // int h[]={10,30,40,20};
        // int n=h.length;
        // System.out.println(frogJump(h, n, 0));
        String kp[]={"","","abc","def","ghi","jkl","mno"
    ,"pqrs","tuv","wxyz"};

    keyPadCobination("253", kp, "");

    }
}
