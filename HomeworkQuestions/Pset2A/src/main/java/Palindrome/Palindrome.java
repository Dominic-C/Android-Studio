package Palindrome;

public class Palindrome {

    public static String checkPalindrome(String s)
    {
        int length = s.length();
        int counter = 0;

        boolean isPalindrome = false;
        if(s.charAt(0) == s.charAt(length))

        {
            if(s.substring(++counter, length-counter).length() == 1)
            {
                isPalindrome = true;
            }
            else
                checkPalindrome(s.substring(++counter, length-counter));
        }
        else
            isPalindrome = false;

        if(isPalindrome == true)
            return s + " is a palindrome";
        else
            return s + " is not a palindrome";


    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();

        System.out.println(p.checkPalindrome("abba"));
    }
}
