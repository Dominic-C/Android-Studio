package Eniya_1293;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int a = n.nextInt();
        int b = n.nextInt();
        int N = n.nextInt();

        System.out.println(a*b*N*2); // coating both sides of panel
    }
}
