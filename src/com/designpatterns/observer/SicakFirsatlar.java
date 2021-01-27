package com.designpatterns.observer;

public interface SicakFirsatlar {
    void register(Olucu olucu);

    void unregister(Olucu olucu);

    void notifyObserver();
}
