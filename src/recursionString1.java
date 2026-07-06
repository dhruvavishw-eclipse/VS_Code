import java.util.*;
public class recursionString1 {


   static String removeA(String s,int index){
      if(index==s.length()) return " ";

      String smallans= removeA(s, index+1);
      
      char currchar=s.charAt(index);

      if(currchar!='a'){
        return currchar+ smallans;
      }
      else 
      return smallans;

   }



     public static void main(String [] eclipse){

     Scanner Css = new Scanner(System.in);

     int index= 0;
        String s=Css.nextLine();
    System.out.println(removeA(s,index));
}

}
