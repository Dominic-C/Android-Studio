package piwords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        // check the length of each string in the array
        System.out.println(Arrays.toString(trainingData));

        // concatenate array into one large array, check if all in ASCII range (a-z and A-Z), then make all lower case, and sort

        String combinedString = "";
        for(String x : trainingData)
        {
            // might need to do a character check here.
            x.toLowerCase();
            combinedString = combinedString + x;
        }

        // sorting the array
        char[] chararray = combinedString.toCharArray();
        Arrays.sort(chararray);

        // create a string from sorted array: {'a', 'b'} to ab
//        String b = new String(chararray);
//        System.out.println(b);

        // 97 to 122
//        Map<String, Integer> hmap = new HashMap<>();
//        for(int i = 97; i < 122; i++)
//        {
//            System.out.println(b.indexOf((char)i));
//        }

        // generate alphabets
        ArrayList<Character> checklist = new ArrayList<>();
        for(int i = 97; i <= 122; i++)
        {
            checklist.add((char)(i));
        }

        // create a hashmap and initialize to all 0;
        Map<Character, Integer> hmap = new HashMap<>();
        for(Character x: checklist)
        {
            hmap.put(x, 0);
        }


        // for loop to increase

        for(Character y: chararray)
        {
            int value = hmap.get(y);
            hmap.put(y,value+1);
        }

        System.out.println(hmap);
        return null;
    }
}
