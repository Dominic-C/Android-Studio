package com.example.dominic.finalsprep.nestedClasses.InnerClass;

public class TestOuterClass {
    public static void main(String[] args) {
        OuterClass outerClass  = new OuterClass(); // instantiates outer class variable "a" to be 10

        OuterClass.innerClass innerclass = outerClass.new innerClass();

        innerclass.innerPrintA(); // shows that innerclass can access variables in outer class

        OuterClass newouter = innerclass.giveBackOuter(); // shows that innerclass stores a reference to the outer class.
        // object newouter stores the reference to OuterClass.this of innerClass object
        newouter.outerPrintA();


    }
}
