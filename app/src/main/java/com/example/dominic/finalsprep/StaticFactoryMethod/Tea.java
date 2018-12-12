package com.example.dominic.finalsprep.StaticFactoryMethod;

public class Tea {

    private boolean sugar;
    private boolean milk;

    Tea(boolean sugar, boolean milk)
    {
        this.sugar = sugar;
        this.milk = milk;
    }

    public static Tea teh()
    {
        return new Tea(true,true);
    }

    public static Tea tehkosong()
    {
        return new Tea (false, true);
    }

}
