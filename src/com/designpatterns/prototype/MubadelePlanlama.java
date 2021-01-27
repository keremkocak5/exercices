package com.designpatterns.prototype;

public class MubadelePlanlama {
    public static void main(String[] args) {
        Inanli inanli = new Inanli();
        Inanli ikinciKoy = (Inanli) inanli.makeClone();
    }
}
