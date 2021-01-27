package com.designpatterns.strategy;

public class CanNotFly implements  Flyable {
    @Override
    public void fly() {
        System.out.println("Cannot Fly :/");
    }
}
