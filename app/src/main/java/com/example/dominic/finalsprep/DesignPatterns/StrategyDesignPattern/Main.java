package com.example.dominic.finalsprep.DesignPatterns.StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        // assemble duck during run time, gives us the flexibility of changing its behaviour if needed.
        Duck duck = new MallardDuck("Donald");
        duck.setFlyBehaviour(new FlapWings());
        duck.setQuackBehaviour(new LoudQuack());
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
