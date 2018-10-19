package Inheritance;
// note, Java does'nt support multiple inheritance

public class Main {

    public static void main(String [] args)
    {
        System.out.println("Calculator class");
        Calculator c1 = new Calculator();
        int result = c1.add(1,2);

        System.out.println(result);

        System.out.println("\nCalculator Advanced class");
        CalculatorAdvanced c2 = new CalculatorAdvanced();
        int result2 = c2.add(1, 2);
        int result3 = c2.sub(4,2);

        System.out.println(result2);
        System.out.println(result3);
    }
}
