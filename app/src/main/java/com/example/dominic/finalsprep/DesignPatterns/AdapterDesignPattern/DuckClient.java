package com.example.dominic.finalsprep.DesignPatterns.AdapterDesignPattern;

import java.util.ArrayList;

public class DuckClient {

    static ArrayList<Duck> myDucks;

    public static void main(String[] args) {
        myDucks = new ArrayList<>();
        myDucks.add(new MallardDuck());

        // use turkeyAdapter which implements Duck, then fill in the methods that Duck has
        Duck fakeDuck = new TurkeyAdapter(new MyTurkey());
        // add adapted duck into the list of Ducks
        myDucks.add(fakeDuck);


        makeDucksFlyQuack();

    }

    static void makeDucksFlyQuack(){
        for(Duck duck: myDucks)
        {
            duck.fly();
            duck.quack();
        }
    }
}
