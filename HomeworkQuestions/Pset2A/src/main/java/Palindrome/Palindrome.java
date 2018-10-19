package Palindrome;

import java.util.Arrays;

public class Palindrome {

//    public static String checkPalindrome(String s)
//    {
//        if(s.length() == 0 || s.length() ==1)
//            return "Is palindrome";
//        if(s.charAt(0) == s.charAt(s.length()-1))
//        {
//            return checkPalindrome(s.substring(1, s.length()-1));
//        }
//        return "is not palindrome";
//    }

    public static boolean isPalindrome(char [] S)
    {
        if(S.length == 0 || S.length == 1)
        {
            return true;
        }
        if(S[0] == S[S.length - 1])
        {
            return isPalindrome(Arrays.copyOfRange(S, 1, S.length -1));
        }
        return false;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();


        char [] arraytest = {'a', 'b', 'a'};
        System.out.println(p.isPalindrome(arraytest));
    }
}
