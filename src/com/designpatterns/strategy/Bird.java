package com.designpatterns.strategy;

public class Bird extends  Animal {

    Bird(String name, int age, int speed) {
        super(name, age, speed, new CanNotFly() );
    }
}
