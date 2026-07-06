import java.util.*;
public class Stringg {



    public static void main(String BKP []){
        Scanner rcb=new Scanner(System.in);
        // String s=rcb.nextLine();
         String s= "Alienware";
        //  System.out.println(s);
        String s2=" To FAANG";

         String s1="Welcome Alienware";
        //  int length=s1.length();
        //  System.out.println(s1.length());
        //  char ch=s1.charAt(8);
        //  System.out.println(s1.charAt(8));


         //---.indexOf()
        //  It can get the index of the char we wrote
        //  here,if the char are repeated it will gives
        //  the value of first occurence.
        // System.out.println(s1.indexOf('n'));


        //---.compareTo()
        // It compares the total size of the stirngs
        // by their ASCII values and then give the ans
        // System.out.println(s1.compareTo(s));


        //---.contains()
        // It is used to check the given string is
        // in another string or not and gives the ans in Boolean
        // System.out.println(s1.contains("Alenware"));


        //---.startsWith()
        // This is used for finding the string stats
        // with given string or not, it gives ans in Boolean
        // System.out.println(s1.startsWith("Welcome"));


        //---.endsWith()
        // Used to figure out the ending
        // System.out.println(s1.endsWith("wre"));


        //---.toLowerCase()
        // Used to lowercase whole string
        // System.out.println(s1.toLowerCase());



        //---.toUpperCase()
        // Used to Convert whole string in Upper case
        // System.out.println(s1.toUpperCase());

      
        //---.concat()
        // Used to merge two string ,2nd followed 
        // 1st
        // System.out.println(s1.concat(s2));



        // String str="ROG";
        // str+=" ALienware ";
        // System.out.println(str);;
        // str+='B';
        // System.out.println(str);
        // str+=18;
        // System.out.println(str);
        

        //---.substring(0,2)
        // A substring is define as the continous 
        // part of a string
        // "abcd"---a,ab,abc,abcd,b,bc,bcd,c,cd,d
        // System.out.println(s1.substring(3));
        // System.out.println(s1.substring(3, 5));



        //---.equals()
        // It is used to compare and figuring out
        // two string are same or not,THis first
        // use address of those string then compare
        // them char to char
        // String s4="Alienware";
        // System.out.println(s.equals(s4));



        

       //---JAVA STRING BUILDER CLASS---
        
       //---.append()
       //    Used to merger or extend the string when
       //    using StringBuilder

       StringBuilder str=new StringBuilder("Welcome");
    //    str.append(" Alienware");
    //    System.out.println(str);


    //---.setCharAt()
    //    Used to replace the char at any strin
    //     str.setCharAt(0, 'B');
    //    System.out.println(str);

    //--.insert()
    // Used for inserting the values in any strint
    // at our preferd index
    // System.out.println(str.insert(3,'K'));



    //--.deleteCharAt()
    // For deletion of any char at required index
    // System.out.println(str.deleteCharAt(5));


    //--.reverse()
    // In build function used for reversing the string
    // System.out.println(str.reverse());


    //--.delete()
    // Used to delete the characters of string
    // btw in range i-j index
    // System.out.println(str.delete(2, 4));




 

    }
}
