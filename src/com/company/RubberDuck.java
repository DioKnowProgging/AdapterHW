package com.company;

public class RubberDuck implements NotRealDuck{

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
