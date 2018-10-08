package Palindrome;

public class Palindrome {

    public static String checkPalindrome(String s)
    {
        int length = s.length();
        int counter = 0;
        if(s.charAt(0) == s.charAt(length))

        {
            if(s.substring(++counter, length-counter).length() == 1)
            {
                return s + " is a palindrome";
            }
            else
                checkPalindrome(s.substring(++counter, length-counter));
        }
        else
            return s + " is not a palindrome";


    }
}
