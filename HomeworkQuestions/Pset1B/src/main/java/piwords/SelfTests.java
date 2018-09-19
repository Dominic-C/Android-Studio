package piwords;

import java.util.Arrays;

public class SelfTests {
    public static void main(String [] args)
    {
        PiGenerator pg = new PiGenerator();

        // powerMod test cases
        System.out.println("========== powerMod Test cases ==========");
        // Power mod test case 1: expected output - 0
        int result1 = pg.powerMod(2, 3, 2);
        System.out.println("PowerMod test case 1: " + result1);

        // Power mod test case 1: expected output - 2
        int result2 = pg.powerMod(2, 3, 3);
        System.out.println("PowerMod test case 2: " + result2);


        // computePiInHex test cases
        System.out.println("========== computePiInHex Test cases ==========");

        int[] result3 = pg.computePiInHex(2); // expected value [2,4]
        System.out.println("computePiInHex test case 1: " + Arrays.toString(result3)); // to print an array as string

        int[] result4 = pg.computePiInHex(5); // expected value [2,4,3,15,6]
        System.out.println("computePiInHex test case 2: " + Arrays.toString(result4)); // to print an array as string

        int[] result5 = pg.computePiInHex(10); // expected value [2,4,3,15,6,10,8,8,8,5]
        System.out.println("computePiInHex test case 3: " + Arrays.toString(result5)); // to print an array as string

        // convertBase test cases
        System.out.println("========== convertBase Test cases ==========");

        BaseTranslator bt = new BaseTranslator();

        // convertBase Test cases
        int [] input6 = {2, 4, 3, 15, 6};
        int [] result6 = bt.convertBase(input6, 16, 26, 5);
        System.out.println("convertBase test case 1: " + Arrays.toString(result6));

        int [] input7 = {2, 4, 3, 15, 6, 10, 8, 8};
        int [] result7 = bt.convertBase(input7, 16,26, 8);
        System.out.println("convertBase test case 2: " + Arrays.toString(result7));


        System.out.println("========== convertDigitsToString Test cases ==========");

        DigitsToStringConverter dc = new DigitsToStringConverter();

        int [] digits1 = {3, 17, 18, 16, 11};
        char [] alphabets1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String result8 = dc.convertDigitsToString(digits1, 26, alphabets1);
        System.out.println("convertDigitsToString test case 1: " + result8);

        int [] digits2 = {3, 17, 18, 16, 11, 14, 10, 25};
        char [] alphabets2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String result9 = dc.convertDigitsToString(digits2, 26, alphabets2);
        System.out.println("convertDigitsToString test case 2: " + result9);

    }
}
