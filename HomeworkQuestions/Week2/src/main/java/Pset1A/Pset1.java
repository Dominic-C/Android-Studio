package Pset1A;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pset1 {

    public static boolean isAllCharacterUnique(String sIn)
    {
        // ascii standard, A-Z, 65 - 90. a-z , 97 - 122
        char [] inputString = sIn.toCharArray();
        Arrays.sort(inputString); // arrays.sort does not return anything, so we cannot assign the variable inputString to it

        int arrayLength = inputString.length;

        for(int i = 0; i < arrayLength; i++)
        {
            if(i < arrayLength-1)
            {
                if(inputString[i] == inputString[i+1])
                {
                    return false; // return false if adjacent elements are the same
                }
            }

        }
        return true;
    }

    public static boolean isPermutation(String sIn1, String sIn2)
    {
        char [] inputString1 = sIn1.toCharArray();
        char [] inputString2 = sIn2.toCharArray();

        Arrays.sort(inputString1);
        Arrays.sort(inputString2);

        for(int i = 0; i < inputString1.length; i++) // In my implementation, i assume both arrays have the same length
        {
            if(inputString1[i] != inputString2[i])
                return false;
        }
        return true;
    }
}
