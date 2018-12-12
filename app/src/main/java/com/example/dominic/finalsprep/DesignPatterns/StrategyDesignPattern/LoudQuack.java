package com.example.dominic.finalsprep.DesignPatterns.StrategyDesignPattern;

public class LoudQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("QUACK");
    }
}
