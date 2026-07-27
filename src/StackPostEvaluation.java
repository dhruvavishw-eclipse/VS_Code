import java.util.*;
public class StackPostEvaluation {
    public static void main(String  []BKP){
        String s="953+4*6/-";
        Stack<Integer> val=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int )ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else{
                int v2=val.pop();
                int v1=val.pop();
                if(ch=='+') val.push(v1+v2);
                 if(ch=='-') val.push(v1-v2);
                  if(ch=='*') val.push(v1*v2);
                   if(ch=='/') val.push(v1/v2);
                
            }
        }
        System.out.println(val.peek());
    }
}
