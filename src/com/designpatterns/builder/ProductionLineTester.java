package com.designpatterns.builder;

public class ProductionLineTester {
    public static void main(String[] args) {
        BusBuilder ulm = new UlmFactory();
        BusDirector bd = new BusDirector(ulm);
        bd.makeBus();
        bd.getBus();
    }


}
