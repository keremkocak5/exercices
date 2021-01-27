package com.designpatterns.observer;

public class SakalliOlucu implements Olucu {

    private static int id = 0;
    private int idTracker = 0;
    private double mach3Price;
    private double erikliSuPrice;
    private double acikParfumPrice;
    private SicakFirsatlar sicakFirsatlar;

    public SakalliOlucu(SicakFirsatlar sicakFirsatlar) {
        this.sicakFirsatlar = sicakFirsatlar;
        this.idTracker = ++id;
        sicakFirsatlar.register(this);
    }

    @Override
    public void update(double mach3Price, double erikliSuPrice, double acikParfumPrice) {
        this.mach3Price = mach3Price;
        this.erikliSuPrice = erikliSuPrice;
        this.acikParfumPrice = acikParfumPrice;
        System.out.println("id" + idTracker);
        System.out.println("mach3" + mach3Price);
        System.out.println("erikli" + erikliSuPrice);
        System.out.println("parfum" + acikParfumPrice);
    }
}
