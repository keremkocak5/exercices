package com.designpatterns.prototype;

public class Inanli implements Village {
    @Override
    public Village makeClone() {
        Village vil = null;
        try {
            vil = (Village) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return vil;
    }
}
