package com.example.dominic.finalsprep.DesignPatterns.Builder;

public class Tea {


        private boolean sugar;
        private boolean milk;
        private boolean ice;
        private boolean toGo;

        Tea(TeaBuilder teaBuilder) // uses teabuilder's parameters to set Tea's parameters
        {
            this.sugar = teaBuilder.sugar;
            this.milk = teaBuilder.milk;
        }

        void printTea()
        {
            System.out.println("sugar: " + this.sugar);
            System.out.println("milk: " + this.milk);
        }
/*
        If we wrote constructors for each combination of the ingredients, then we would have too many constructors.... so we have a builder design pattern

        public static Tea teh()
        {
            return new Tea(true,true);
        }

        public static Tea tehkosong()
        {
            return new Tea (false, true);
        }*/

    static class TeaBuilder{
        private boolean sugar;
        private boolean milk;

        TeaBuilder(){}

        // allow user to state true or false for each variable

        public TeaBuilder setSugar(boolean sugar)
        {
            this.sugar = sugar;
            return this;
        }

        public TeaBuilder setMilk(boolean milk)
        {
            this.milk = milk;
            return this;
        }
        // code above sets teabuilder object's parameters

        // from the teaBuilder, we return the teaBuilder methods to the constructor

        public Tea build()
        {
            // "this" in the argument is a teabuilder object
            return new Tea(this);
        }
    }



}
