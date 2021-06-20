package com.rgsoft2.rg5410;

public class Main {

    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        char c[] = {'h','e','l','l','o'};
        System.out.println(s.equals(t));
        System.out.println(s == t);
        System.out.println(t.equals(c));
    }

}
