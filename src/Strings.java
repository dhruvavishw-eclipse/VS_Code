import java.util.*;

public class Strings {




    public static void main(String[] args) {
        Scanner mk=new Scanner(System.in);
        // String name=mk.nextLine();
        // String s="Glorious Purpose";

//         // concatenation means merging of two diff string/
//           String firstName="Glorious ";
//           String secName=" Purpose";
//           String ans=firstName+  secName;
// // charAt using for print i characters;
// for(int i=0;i<ans.length();i++){
//         System.out.println(ans.charAt(i));
//     // System.out.println(" Your name "+ name);
// }




// String s1="Eclipse";
// String s2="RushBoy";

// ***"compareTo", This function is used for using condition like
//   s1>s2;
//   s1==s2;
//   s1<s2;
// It is better than normal comparision because in normal if-else
// there is chance to get incorrect answer;

//      if(s1.compareTo(s2)==0){
//     System.out.println("String are equal");
// }
// else{
//     System.out.println("Strings are not equal");
// }
String ss="ZAlienware";
String vr="Victus";
System.out.println(ss.compareTo(vr));


  
// "substring" ,it is use to print substring ;

    // String sentence="Born to Glorious Purpose";
    // String name="F22Raptor";
    
    // // String ans=sentence.substring(17,sentence.length());

    // // If we did not give the ending index for substring then it
    // // will automatically give the value till last index;

    // String ans=name.substring(3);
    // System.out.println(ans);

// Strings are Immutable; Means if declare a string in 
// memory then it won't be change ,we need to create a new string
// varible






// StringBuilder

// with this help we can modify our string .

// For using this we have a keyword "StringBuilder".

StringBuilder sb=new StringBuilder("Eclipse");
System.out.println(sb);



//*** */ "charAt "index 0;
// Using for print char at given index.
System.out.println(sb.charAt(0));




// *** "indexOf" ;
// This is used for determining the index no. of char
  int ans =sb.indexOf("e");
System.out.println("Index of e is " + ans);



// *** "setCharAt" index 0;
// This is used for replacing any char at string .
sb.setCharAt(0, 'M');
System.out.println(sb);



// *** "insert" index 3;
// using this for add any char and string at any positon in a String.
sb.insert(3, "hkhksk");
System.out.println(sb);
System.out.println(sb.length());



// *** "delete" index 2-4.
// Using this for deleting one or more char in a String.
sb.delete(2, 04);
System.out.println(sb);




StringBuilder sb1= new StringBuilder("H");
// *** "append" 
// It is used for add any char or string at last index of String.
sb1.append('e');
sb1.append('l');
sb1.append('l');
sb1.append('o');
System.out.println(sb1.length());

for(int i=0;i<sb.length()/2;i++){
    int front =i;
    int back =sb.length()-1-i;

    char frontChar=sb.charAt(front);
    char backChar= sb.charAt(back);

sb.setCharAt(front, backChar);
sb.setCharAt(back, frontChar);
}
System.out.println(sb);




// *** "contains"
// This keyword is used for checking a charcter or string in given string.
String mky="Glorious Purpose";
System.out.println(mky.contains("po"));



// *** "startsWith";
// This keyword is used for checking string start with given 
// char or not .
System.out.println(mky.startsWith("g"));




// *** "endsWith".
// This keyword is used for checking last char or substring 
// with give string or char.
System.out.println(mky.endsWith("Purpose"));




// *** "toLowerCase"
// This is used for making whole string in lower case char.
System.out.println(mky.toLowerCase());




// ***"toUpperCase";
// This is used for making whole string into upper case char.
System.out.println(mky.toUpperCase());



// ***"concat";
// This is used for adding another string backside in a given string.
// System.out.println(sb.concat(mky));



// *** "substring"
// This is used for making substring ,using start and end index.
System.out.println(mky.substring(3,10));
 String  s=mky.substring(0, 2)+"MK14"+mky.substring(11);
System.out.println(s);



// *** ".equals" and "=="

// "==" It gives incorrect value due to it only checks address
// of two diffrent string.
// While ".equals" is checking two whole string.
String s1="Hello";
String s2="Hello";
String s3= new String ("Hello");
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1.equals(s3));



// *** "reverse()"
// This keyword is used for reversing the whole string 
        //    s3.reverse();


        



    }
}
