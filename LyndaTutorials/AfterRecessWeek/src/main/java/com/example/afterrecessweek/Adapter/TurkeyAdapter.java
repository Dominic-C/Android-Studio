package com.example.afterrecessweek.Adapter;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    // constructor
    TurkeyAdapter(Turkey turkey)
    {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
