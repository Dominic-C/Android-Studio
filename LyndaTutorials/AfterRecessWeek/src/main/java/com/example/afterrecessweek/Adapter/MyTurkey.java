package com.example.afterrecessweek.Adapter;

public class MyTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("My turkey is noisy");
    }

    @Override
    public void fly() {
        System.out.println("My turkey can't really fly");
    }
}
