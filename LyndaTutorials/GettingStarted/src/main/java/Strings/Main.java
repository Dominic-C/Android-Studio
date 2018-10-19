package Strings;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        // Scan for a string
//        Scanner sc = new Scanner(System.in); // System.in is an InputStream, System.out is an output Stream
//        String userInput = sc.next(); // sc.next is only going to get the first word we see
//
//        String uppercased = userInput.toUpperCase();
//
//        System.out.println(userInput);
//        System.out.println(uppercased);
//
//        char firstchar = userInput.charAt(0);
//        System.out.println(firstchar);
//        System.out.println("Contains: " + userInput.contains("enter"));

//        // Scan for an integer
//        Scanner sc = new Scanner(System.in);
//        int userInput = sc.nextInt(); // takes in an int, else error, nextDouble for double etc

//        System.out.println(userInput);

        String s  = "dog";
        // replace method returns a new string
        String replacedF = s.replace("d", "f");
        System.out.println(replacedF);
    }
}
