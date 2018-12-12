package com.example.dominic.finalsprep.nestedClasses.InnerClass;

public class OuterClass {

    int a;
    OuterClass(){a = 10;}
    void outerPrintA()
    {
        System.out.println(a);
    }
    public class innerClass
    {
        int c;
        innerClass(){c = 100; }

        void innerPrintA(){
            System.out.println(a);
        }

        OuterClass giveBackOuter(){
            return OuterClass.this;
        }
    }
}
