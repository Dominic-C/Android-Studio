package Challenge2;

import java.util.Random;

public class Dice {

    public int roll()
    {
        Random result = new Random();
        int n = result.nextInt(6) + 1; // random from 0 to 5, then add 1.

        return n;
    }
}
