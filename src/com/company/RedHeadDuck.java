package com.company;

public class RedHeadDuck implements Duck {

    @Override
    public void fly() {
        System.out.println("Flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
}
