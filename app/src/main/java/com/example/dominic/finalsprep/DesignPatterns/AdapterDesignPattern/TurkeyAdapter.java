package com.example.dominic.finalsprep.DesignPatterns.AdapterDesignPattern;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    TurkeyAdapter(Turkey turkey)
    {
        this.turkey = turkey;
    }
    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
