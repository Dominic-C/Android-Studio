package com.example.dominic.finalsprep.Polymorphism;

public class polymorphism {
    public static void main(String[] args) {
        A x = new A(); // legal
        A xx = new B(); // legal, methods unique to child not in parent cannot be called, .g in this case
        // xx.g(1);

        B y = new B(); // legal can call both parent and child methods
        // B yy = new A(); illegal, incompatible type error

        /*For case B, what are the advantages and disadvantages of each of them?
        * difference between B y = new B() and A yy = new B()
        *
        * for A yy = new B(), where A is the parent of B
        * can be used for yy to accept methods for A, used when we dont know if the instance yy will be dealing with A or B types of objects
        *
        * eg, method1 returns arraylist or linkedlist or vector etc
        *
        * if we dont know what method1 returns, we use a parent class to create an instance
        *
        *
        * B y = new B() where B is a child
        * We use this when we know the exact type of methods we will be going to use
        *
        * */
    }
}

class A{
    void f(int x){
        System.out.println("A");
    }
}

class B extends A{
    void f(int x){
        System.out.println("Bf");
    }

    void g(int x)
    {
        System.out.println("Bg");
    }
}