package LonesomeKnight_1197;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner position = new Scanner(System.in);
        int numberOfPos = position.nextInt();
        for (int i = 0; i < numberOfPos; i++) {
            String pos = position.next();

            char poschar = pos.charAt(0);
            int posint = Character.getNumericValue(pos.charAt(1));

            int moveLeftFirst = (int) poschar - 2;
            int moveRightFirst = (int) poschar + 2;

            int truecount = 0;

            if (moveLeftFirst >= 97 && moveLeftFirst <= 104) // check if piece's character is still within a to h
            {
                int moveup = posint + 1;
                int movedown = posint - 1;
                if (moveup >= 1 && moveup <= 8) {
                    truecount++;
                }
                if (movedown >= 1 && movedown <= 8) {
                    truecount++;
                }
            }
            if (moveRightFirst >= 97 && moveRightFirst <= 104) // check if piece's character is still within a to h
            {
                int moveup = posint + 1;
                int movedown = posint - 1;
                if (moveup >= 1 && moveup <= 8) {
                    truecount++;
                }
                if (movedown >= 1 && movedown <= 8) {
                    truecount++;
                }
            }

            int moveUpFirst = posint + 2;
            int moveDownFirst = posint - 2;

            if (moveUpFirst >= 1 && moveUpFirst <= 8) // check if piece's int is still within 1 to 8
            {
                int moveleft = (int) poschar + 1;
                int moveright = (int) poschar - 1;
                if (moveleft >= 97 && moveleft <= 104)
                    truecount++;
                if (moveright >= 97 && moveright <= 104)
                    truecount++;
            }

            if (moveDownFirst >= 1 && moveDownFirst <= 8) // check if piece's int is still within 1 to 8
            {
                int moveleft = (int) poschar + 1;
                int moveright = (int) poschar - 1;
                if (moveleft >= 97 && moveleft <= 104)
                    truecount++;
                if (moveright >= 97 && moveright <= 104)
                    truecount++;
            }
            System.out.println(truecount);
        }
    }
}
