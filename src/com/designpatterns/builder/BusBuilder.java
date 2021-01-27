package com.designpatterns.builder;

public interface BusBuilder {
    void buildEngine(String engine);

    void buildTransmission(String transmission);

    Bus getRobot();
}
