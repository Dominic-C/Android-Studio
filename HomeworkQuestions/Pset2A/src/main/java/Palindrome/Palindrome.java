package Palindrome;

public class Palindrome {

    public static String checkPalindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return "is a palindrome"; // base case
        if(s.charAt(0) == s.charAt(s.length()-1))
        {
            return checkPalindrome(s.substring(1, s.length()-1));
        }

        return "not true";
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();

        System.out.println(p.checkPalindrome("124321"));
    }
}
