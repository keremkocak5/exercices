package com.designpatterns.observer;

import java.util.ArrayList;

public class DonanimHaberSicakFirsatlar implements SicakFirsatlar {

    private ArrayList<Olucu> oluculist;
    private double mach3Price;
    private double erikliSuPrice;
    private double acikParfumPrice;

    DonanimHaberSicakFirsatlar() {
        oluculist = new ArrayList<>();
    }

    @Override
    public void register(Olucu olucu) {
        oluculist.add(olucu);
    }

    @Override
    public void unregister(Olucu olucu) {
        oluculist.remove(olucu);
    }

    @Override
    public void notifyObserver() {
        oluculist.stream().forEach(c -> c.update(mach3Price, erikliSuPrice, acikParfumPrice));
    }

    public void setMach3Price(double mach3Price) {
        this.mach3Price = mach3Price;
        notifyObserver();
    }

    public void setErikliSuPrice(double erikliSuPrice) {
        this.erikliSuPrice = erikliSuPrice;
        notifyObserver();
    }

    public void setAcikParfumPrice(double acikParfumPrice) {
        this.acikParfumPrice = acikParfumPrice;
        notifyObserver();
    }
}