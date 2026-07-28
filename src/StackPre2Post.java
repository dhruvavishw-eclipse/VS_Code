import java.util.*;
public class StackPre2Post {
    public static void main(String []BKP){
        String s="-9/*+5346"; //-9/*+5346
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
                String ans=v1+v2+op;
                val.push(ans);
            }
        }
        System.out.println(val.peek());
    }
}
