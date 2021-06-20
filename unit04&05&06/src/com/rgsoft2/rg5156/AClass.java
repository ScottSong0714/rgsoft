package com.rgsoft2.rg5156;

public class AClass {

    private int x;
    AClass(int x) {
        this.x = x;
    }
    int add(AClass ref) {
        return ref.x + x;
    }

}
