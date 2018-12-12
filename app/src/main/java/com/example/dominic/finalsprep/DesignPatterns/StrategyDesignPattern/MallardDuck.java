package com.example.dominic.finalsprep.DesignPatterns.StrategyDesignPattern;

public class MallardDuck extends Duck {

    MallardDuck(String name)
    {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("I am " + name + ", the Mallard Duck");
    }
}
