package com.company;

public class Main {

    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        NotRealDuck notRealDuck = new RubberDuck();

        NotRealDuck duckAdapter =  new DuckAdapter(redHeadDuck);

        redHeadDuck.fly();
        redHeadDuck.makeSound();

        notRealDuck.quack();

        duckAdapter.quack();
    }
}
