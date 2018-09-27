package piwords;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;

public class AlphabetGenerator {
    /**
     * Given a numeric base, return a char[] that maps every digit that is
     * representable in that base to a lower-case char.
     * 
     * This method will try to weight each character of the alphabet
     * proportional to their occurrence in words in a training set.
     * 
     * This method should do the following to generate an alphabet:
     *   1. Count the occurrence of each character a-z in trainingData.
     *   2. Compute the probability of each character a-z by taking
     *      (occurrence / total_num_characters).
     *   3. The output generated in step (2) is a PDF of the characters in the
     *      training set. Convert this PDF into a CDF for each character.
     *   4. Multiply the CDF value of each character by the base we are
     *      converting into.
     *   5. For each index 0 <= i < base,
     *      output[i] = (the first character whose CDF * base is > i)
     * 
     * A concrete example:
     * 	 0. Input = {"aaaaa..." (302 "a"s), "bbbbb..." (500 "b"s),
     *               "ccccc..." (198 "c"s)}, base = 93
     *   1. Count(a) = 302, Count(b) = 500, Count(c) = 198
     *   2. Pr(a) = 302 / 1000 = .302, Pr(b) = 500 / 1000 = .5,
     *      Pr(c) = 198 / 1000 = .198
     *   3. CDF(a) = .302, CDF(b) = .802, CDF(c) = 1
     *   4. CDF(a) * base = 28.086, CDF(b) * base = 74.586, CDF(c) * base = 93
     *   5. Output = {"a", "a", ... (29 As, indexes 0-28),
     *                "b", "b", ... (46 Bs, indexes 29-74),
     *                "c", "c", ... (18 Cs, indexes 75-92)}
     * 
     * The letters should occur in lexicographically ascending order in the
     * returned array.
     *   - {"a", "b", "c", "c", "d"} is a valid output.
     *   - {"b", "c", "c", "d", "a"} is not.
     *   
     * If base >= 0, the returned array should have length equal to the size of
     * the base.
     * 
     * If base < 0, return null.
     * 
     * If a String of trainingData has any characters outside the range a-z,
     * ignore those characters and continue.
     * 
     * @param base A numeric base to get an alphabet for.
     * @param trainingData The training data from which to generate frequency
     *                     counts. This array is not mutated.
     * @return A char[] that maps every digit of the base to a char that the
     *         digit should be translated into.
     */
    public static char[] generateFrequencyAlphabet(int base,
                                                   String[] trainingData) {
        // TODO: Implement (Problem f)

        if(base<0)
            return null;

        String combinedString = "";
        for(String x : trainingData)
        {
            combinedString = combinedString + x;
        }

        // sorting the array
        char[] chararray = combinedString.toCharArray();
        ArrayList<Character> filteredCharArray = new ArrayList<>();
        for(Character x : chararray)
        {
            if((int)x >= 97 && (int)x <= 122) // check if small character
            {
                filteredCharArray.add(x);
            }
        }

        // arraylist of sorted alphabets
        Collections.sort(filteredCharArray);

        System.out.println(filteredCharArray);

        // use hashmap to generate key value pairs
        Map<Character, Integer> UndividedCDF = new HashMap<>();
        for(Character c : filteredCharArray)
        {
            if(UndividedCDF.get(c) == null) // if values of the key does not exist, set to 1
            {
                UndividedCDF.put(c, 1);
            }
            else // if value of key exists, add 1
            {
                int value = UndividedCDF.get(c);
                UndividedCDF.put(c, value + 1);
            }
        }

        // int PDFs
        Object [] PDF = UndividedCDF.values().toArray();
        Object [] characters = UndividedCDF.keySet().toArray();

        // create integer PDF array
        int [] PDFint = new int[PDF.length];
        for(int i = 0; i < PDF.length; i++)
        {
            PDFint[i] = (Integer)PDF[i];
        }
        // create character array in the corresponding order
        char [] charOrder = new char[PDF.length];
        for(int j = 0; j < PDF.length; j++)
        {
            charOrder[j] = (char)characters[j];
        }


        // int CDFs
        int [] CDFint = new int[PDF.length];
        int countIndexCDF = 0;
        int sum = 0;
        for(int x: PDFint)
        {
            sum += x;
            CDFint[countIndexCDF] = sum;
            countIndexCDF++;
        }
        System.out.println(Arrays.toString(CDFint));

        // double CDF * base/total
        int arrayLength = filteredCharArray.size();
        double [] CDFdouble = new double[PDF.length];
        for(int i = 0; i < PDF.length; i++)
        {
            CDFdouble[i] = (double)CDFint[i] * (base)/arrayLength;
        }
        System.out.println(Arrays.toString(CDFdouble));


        int ansIndex = 0;
        char [] ans = new char[base];
        for(int i = 0; i < PDF.length; i++)
        {
            System.out.println(charOrder[i]);
            for(int j = 0; ansIndex < CDFdouble[i]; j++)
            {
                ans[ansIndex] = charOrder[i];
                ansIndex++;
            }
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
