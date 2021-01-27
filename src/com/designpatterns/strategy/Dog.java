package com.designpatterns.strategy;

public class Dog extends Animal {

    Dog(String name, int age, int speed) {
        super(name, age, speed, new CanFly());
    }
}
