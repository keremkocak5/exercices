package com.designpatterns.observer;

public class KurtlarSofrasi {

    public static void main(String[] args) {
        DonanimHaberSicakFirsatlar sicakFirsatlar = new DonanimHaberSicakFirsatlar();
        SakalliOlucu sakalliOlucu = new SakalliOlucu(sicakFirsatlar);
        SakalliOlucu sakalliOlucu2 = new SakalliOlucu(sicakFirsatlar);
        sicakFirsatlar.setAcikParfumPrice(1);
        sicakFirsatlar.setErikliSuPrice(2);
        sicakFirsatlar.setMach3Price(4);

    }
}
