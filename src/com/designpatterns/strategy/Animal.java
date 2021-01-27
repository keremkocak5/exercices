package com.designpatterns.strategy;

public class Animal {

    String name;
    int age;
    int speed;
    Flyable flyable;

    Animal(String name, int age, int speed, Flyable flyable) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.flyable = flyable;
    }

    public void fly()
    {
        flyable.fly();
    }
}
