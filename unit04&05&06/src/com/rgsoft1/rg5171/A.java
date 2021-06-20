package com.rgsoft1.rg5171;

public class A {

    private int x, y, z;
    public A() {
        x = y = z = 1;
        System.out.println("default constructor called");
    }

    public A(int x,int y,int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("constructor called");
    }

    public void print() {
        System.out.println(x + " " + y + " " + z);
    }

}
