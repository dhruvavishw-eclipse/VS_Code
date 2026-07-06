import java.util.*;

public class StringQ {

    static void subString(String str) {
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j <= 4; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    static void swapCase(String s) {

        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            char ch = s.charAt(i);
            if (ch == ' ')
                continue;

            int ascii = (int) ch;

            if (ascii >= 97)
                flag = false;
            if (flag == true) {
                ascii += 32;
                char ch2 = (char) ascii;
                s = s.substring(0, i) + ch2 +
                        s.substring(i + 1);
            } else {
                ascii -= 32;
                char ch3 = (char) ascii;
                s = s.substring(0, i) + ch3 +
                        s.substring(i + 1);

            }
        }
        System.out.println(s);

    }

    static void stringgBuilder() {
        StringBuilder s = new StringBuilder("AlIeNwaRe");
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            char ch = s.charAt(i);
            if (ch == ' ')
                continue;
            int ascii = (int) ch;
            if (ascii >= 97)
                flag = false;
            if (flag == true) {
                ascii += 32;
                char ch2 = (char) ascii;
                s.setCharAt(i, ch2);
            } else {
                ascii -= 32;
                char ch3 = (char) ascii;
                s.setCharAt(i, ch3);
            }
        }
        System.out.println(s);

    }

    static void palindrome(StringBuilder s) {
        StringBuilder palin = new StringBuilder(s);

        int i = 0, j = s.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag == true)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        // palin.reverse();
        // System.out.println(palin);
        // if(palin.equals(s)){
        // System.out.println("Palindrome");
        // }
        // else
        // System.out.println("It is not ");
    }

    static boolean palindromeSubSt(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static void reverseWord(String s) {
        StringBuilder sb = new StringBuilder();
        String ans = " ";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != s.charAt(i)) {
                sb.append(ch);
            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder(" ");
            }
        }
        // sb.append(' ');
        sb.reverse();
        ans += sb;
        System.out.print(ans);
    }

    static void stringCompression(String s) {
        String ans = " " + s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char pre = s.charAt(i - 1);
            if (curr == pre)
                count++;
            else {

                if (count > 1)
                    ans += count;
                count = 1;
                ans += curr;
            }
        }
        if (count > 1)
            ans += count;
        System.out.println(ans);
    }

    public static void main(String[] BKP) {
        Scanner rcb = new Scanner(System.in);
        // StringBuilder s=new StringBuilder(rcb.nextLine());
        // System.out.println(s);
        String s = rcb.nextLine();
        // int count =0;
        // for(int i=0;i<s.length();i++){
        // for(int j=i+1;j<=s.length();j++){
        // if(palindromeSubSt(s.substring(i, j))==true){
        // System.out.print(s.substring(i, j)+" ");
        // count++;
        // }
        // }
        // }
        // System.out.println("Number of Palindrome substring " + count);

        stringCompression(s);
        // reverseWord(s);

        // String s="AlienWaRE";

        // System.out.println(s);

        // palindrome(s);
        // swapCase(s);

        // String str="Alienware";
        // String str="abcd";
        // subString(str);
        // stringgBuilder();

    }
}
