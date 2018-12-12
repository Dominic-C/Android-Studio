package com.example.dominic.finalsprep.DesignPatterns.StrategyDesignPattern;

public abstract class Duck {
    // Strategy design pattern is used when we need to change some behaviour
    private FlyBehaviour flyBehaviour; // fly behaviour and quack behaviour are custom interfaces.
    private QuackBehaviour quackBehaviour;
    String name;

    public Duck(){
    }

    public Duck(String name)
    {
        this.name = name;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour)
    {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour)
    {
        this.quackBehaviour = quackBehaviour;
    }

    public void performFly()
    {
        flyBehaviour.fly();
    }

    public void performQuack()
    {
        quackBehaviour.quack();
    }

    public abstract void display();
}


