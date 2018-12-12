package com.example.dominic.finalsprep.DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Tea teatwo = new Tea.TeaBuilder().setSugar(false).setMilk(true).build();
        teatwo.printTea();
    }
}
