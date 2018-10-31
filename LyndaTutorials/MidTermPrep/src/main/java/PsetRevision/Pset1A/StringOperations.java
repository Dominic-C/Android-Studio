package PsetRevision.Pset1A;

import java.util.Arrays;
public class StringOperations {

    public static boolean isUnique(String s)
    {
        char [] chars = s.toCharArray();
        for(int i = 0; i <= s.length() -1; i++)
        {
            for(int j = 0; j <= s.length()-1; j++)
            {
                if(i != j && chars[i] == chars[j])
                    return false;
            }
        }
        return true;
    }

    private static boolean isPermutation(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;

        // both strings must be same length to enter here.
        char [] char1 = s1.toCharArray();
        char [] char2 = s2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);
        // Old way of checking if two character arrays are equal to each other.
//        for(int i = 0; i <= s1.length()-1; i++)
//            if(char1[i] != char2[i])
//                return false;
//        return true;

        // New way of checking
        return Arrays.equals(char1, char2);
    }

    public static void main(String[] args) {

                System.out.println(isUnique("abcdefghijklmnopqrstuvABC"));

                System.out.println(isUnique("abcdefgghijklmnopqrstuvABC"));

                System.out.println(isPermutation("@ab", "a@b"));

                System.out.println(isPermutation("abcd", "bcdA"));
    }
}
