package com.designpatterns.builder;

public class BusDirector {

    private BusBuilder busBuilder;

    public BusDirector(BusBuilder busBuilder) {
        this.busBuilder = busBuilder;
    }

    public Bus getBus() {
        return this.busBuilder.getRobot();
    }

    public void makeBus() {
        busBuilder.buildEngine("MAN");
        busBuilder.buildTransmission("ZF");
    }


}
