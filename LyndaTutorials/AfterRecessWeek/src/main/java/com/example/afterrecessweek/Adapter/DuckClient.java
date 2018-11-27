package com.example.afterrecessweek.Adapter;

import java.util.ArrayList;

public class DuckClient {
    static ArrayList<Duck> myDucks;

    public static void main(String[] args){
        myDucks = new ArrayList<>();
        Turkey turkey = new MyTurkey();
        myDucks.add(new TurkeyAdapter(turkey));

        makeDucksFlyQuack();

    }

    static void makeDucksFlyQuack()
    {
        for(Duck duck : myDucks)
        {
            duck.fly();
            duck.quack();
        }
    }
}
