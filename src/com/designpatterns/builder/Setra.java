package com.designpatterns.builder;

public class Setra implements Bus {

    private String engine;
    private String transmission;

    public String getTransmission() {
        return transmission;
    }

    @Override
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }
}
