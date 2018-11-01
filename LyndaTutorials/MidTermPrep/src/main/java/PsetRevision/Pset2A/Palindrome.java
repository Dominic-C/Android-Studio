package PsetRevision.Pset2A;

import java.util.Arrays;

public class Palindrome {
    private boolean isPalindrome(String s)
    {
        if(s.length() == 1 || s.length() == 0)
            return true;
        char[] chararray = s.toCharArray();
        if(chararray[chararray.length-1] == chararray[0])
        {
            chararray = Arrays.copyOfRange(chararray, 1, chararray.length-1);
            String ans = "";
            for(char c: chararray)
            {
                ans += c;
            }
            return isPalindrome(ans);
        }
        else return false;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("Zeez"));
    }
}
