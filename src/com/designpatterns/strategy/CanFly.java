package com.designpatterns.strategy;

public class CanFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Can Fly :)");
    }
}
