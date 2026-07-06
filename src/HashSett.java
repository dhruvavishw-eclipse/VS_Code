import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class HashSett {
    
    public int LongestConsecutive(int [] nums){
        HashSet <Integer> st= new HashSet<>();
        for(int num :nums) st.add(num);
        int maxStreak=0;
        for(int num: st){
            if(!st.contains(num-1)){
                int currNum=num;
                int currStreak=1;
                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak= Math.max(maxStreak, currStreak)
            }
        }
        return maxStreak;

    }
       

   static int maxNumbersOnTable(int [] bag){
    HashSet <Integer> table = new HashSet<>();
      int max=0;
      for(int i=0;i<bag.length;i++){
        int num= bag[i];
        if(table.contains(num)){
            table.remove(num);
        }
        else{
            table.add(num);
            max=Math.max(max,table.size());
        }
      }
      return max;
   }




    public static void main(String[] args) {
        

        // HashSet<String> st= new HashSet<>();
        // st.add("Eclipse");
        // st.add("Rushboy");
        // st.add("Eclipse");
        // System.out.println(st);//[Eclipse,Rushboy];
        // System.out.println(st.contains("Eclipse"));// True
        // System.out.println(st.size()); // 2
        // st.remove("Eclipse");
        // System.out.println(st.contains("Eclipse"));//False
        // System.out.println(st.size());//1
        // st.add("0456");//
        // for(String s : st){
        //     System.out.println(s);// Rushboy,0456
        // }


        int nums []={2,1,1,3,2,3};
        System.out.println(maxNumbersOnTable(nums));
    }
}
