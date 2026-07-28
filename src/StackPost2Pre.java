import java.util.*;
public class StackPost2Pre {

    static void pre2Infix(String s){
  
        //  HERE WE WROTE CODE FOR CONVERSION OF PREFIX TO POSTFIX IN STRING NOT BY EVALUTATION

        // String s="-9/*+5346";
        //  Output="(9-(((5+3)*4)/6))";

        Stack<String> val=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else{
                String v1=val.pop();
                String v2=val.pop();
                char op=ch;
                String ans='('+v1+op+v2 +')';
                val.push(ans);
            }

        }
        System.out.println(val.peek());
    }



    static void post2Infix(String s){
        // Here we are done POSTFIX TO INFIX CONVERISON

    //      s="953+4*6/-";
    // Output=(9-(((5+3)*4)/6));

        Stack<String> val=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else{
                String v2=val.pop();
                String v1=val.pop();
                char op=ch;
                String ans= '(' +v1+op+v2+')';
                val.push(ans);
            }
        }
        System.out.println(val.peek());
    }



    public static void main(String [] BKP){
        // String s="953+4*6/-";
        String s="-9/*+5346";
        // Stack<String> val=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     int ascii=(int)ch;
        //     if(ascii>=48 && ascii<=57){
        //         val.push(ch+"");
        //     }
        //     else{
        //         String v2=val.pop();
        //         String v1=val.pop();
        //         char op=ch;
        //         String ans=op+v1+v2;
        //         val.push(ans);
        //     }
        // }
        // System.out.println(val.peek());

        // post2Infix(s);
        pre2Infix(s);
    }
}
