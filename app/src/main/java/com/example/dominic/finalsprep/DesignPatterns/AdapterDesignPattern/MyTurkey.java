package com.example.dominic.finalsprep.DesignPatterns.AdapterDesignPattern;

public class MyTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("My turkey cant really fly");
    }
}
