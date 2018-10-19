package Challenge2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args)
    {
//        String numberOfDice = args[0];
//        int num = Integer.parseInt(numberOfDice); // using arg parser

        Scanner numOfDice = new Scanner(System.in); // using prompted user input
        int num = numOfDice.nextInt();

        for (int i = 0; i < num; i++)
        {
            Dice d = new Dice();
            System.out.println("Dice "+ (i+1) + " rolled");
            System.out.println("Result of roll: " + d.roll() + "\n");
        }
    }
}
