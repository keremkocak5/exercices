package com.designpatterns.builder;

public class UlmFactory implements BusBuilder {

    private Bus bus;

    public UlmFactory() {
        this.bus = new Setra();
    }

    @Override
    public void buildEngine(String engine) {
        bus.setEngine(engine);
    }

    @Override
    public void buildTransmission(String transmission) {
        bus.setTransmission(transmission);
    }

    @Override
    public Bus getRobot() {
        return this.bus;
    }
}
