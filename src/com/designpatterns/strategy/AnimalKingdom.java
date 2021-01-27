package com.designpatterns.strategy;

public class AnimalKingdom {

    public static void main(String[] args) {
        Animal dog = new Dog("milu", 10, 10);
        Animal bird = new Bird("marti", 2, 30);
        dog.fly();
        bird.fly();
    }
}
