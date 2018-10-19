package com.example.gettingstarted;

public class MyClass {

    public static void main(String[] args)
    {
        String userInput = "entertainment";
        String uppercase = userInput.toUpperCase();
        System.out.println(uppercase);

        char firstCharacter = userInput.charAt(0); // choose char in a string
        System.out.println(firstCharacter);

        System.out.println("Contains: " + userInput.contains("enter")); // check if string has a particular pattern

    }
}
