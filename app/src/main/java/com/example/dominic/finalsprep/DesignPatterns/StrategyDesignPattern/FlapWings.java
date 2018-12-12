package com.example.dominic.finalsprep.DesignPatterns.StrategyDesignPattern;

public class FlapWings implements FlyBehaviour{
    @Override
    public void fly()
    {
        System.out.println("Flapping my wings");
    }
}