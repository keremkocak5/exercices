package com.leetcode;

interface Shape {
    public double calculateAre();
}

public class MaximumSubarray {

    public static void main(String args[]) {

        double areaOfCircle = new Circle(3).calculateAre();
        double areaOfRectangle = new Rectangular(1, 2).calculateAre();
    }

}

class Rectangular implements Shape {
    double a, b;

    Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateAre() {
        return a * b;
    }
}

class Circle implements Shape {
    double PI = 3.14D;
    double a;

    Circle(double a) {
        this.a = a;
    }

    @Override
    public double calculateAre() {
        return PI * a * a;
    }
}