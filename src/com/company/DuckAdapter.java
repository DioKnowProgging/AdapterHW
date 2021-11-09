package com.company;

public class DuckAdapter implements NotRealDuck{

    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.makeSound();
    }
}
