import java.util.*;

public class HashMap2 {
    

    static HashMap<Character,Integer> makeFrMap(String mky){
      HashMap<Character,Integer> mp=new HashMap<>();
      for(int i=0;i<mky.length();i++){
        Character ch=mky.charAt(i);
        if(!mp.containsKey(ch)){
          mp.put(ch,1);
        }
        else{
          int curr=mp.get(ch);
          mp.put(ch, curr+1);
        }
      }
      return mp;
    }




    // public boolean isAnagram(String s,String t){
    //     if(s.length()!= t.length())
    //        return false;

    //      HashMap<Character, Integer> mp1=makeFreqMap(s);
    //        HashMap<Character, Integer> mp2=makeFreqMap(t);
    //        return mp1.equals(mp2);


    // public boolean isIsomorphic(String s, String t){
    //     HashMap<Character,Character> mp=new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //       Character sCh= s.charAt(i);
    //       Character tCh= t.charAt(i);
    //         if(mp.containsKey(sCh)){
    //           if(mp.get(sCh)!=tCh)
    //           return false;
    //         }
    //       else  if(mp.containsValue(tCh)){
    //           return false;
    //         }
    //         else 
    //         mp.put(sCh, tCh);
    //     }
    //     return true;
    // }//

// public int [] twoSum(int []nums,int target){
//   int n=nums.length;
//    int ans []={-1};
//       HashMap<Integer,Integer> mp=new HashMap<>();
//       for(int i=0;i<n;i++){
//         int partner=target-nums[i];
//            if(mp.containsKey(partner)){
//             ans=new int []{i,mp.get(partner)};
//             return ans;
//            }
//            mp.put(nums[i], i);

//       }


//      return ans;
// }


HashMap<Integer,Integer> mp=new HashMap<>();
 int maxLen=0,prefSum=0;
     mp.put(0,-1);
     for(int i=0;i<arr.length;i++){
      prefSum+=arr[i];
     if(mp.containsKey(prefSum)){
      maxLen=Math.max(maxLen, i-mp.get(prefSum));

     }
     else{
      mp.put(prefSum,i);
     }

     }
     return maxLen;




}
