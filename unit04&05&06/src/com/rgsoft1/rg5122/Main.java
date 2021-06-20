package com.rgsoft1.rg5122;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        String str = "BeiJing-China 2008";
        char[] str2 = new char[str.length()];
        for (int i = 0; i < str2.length; i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                str2[i] = (char)(str.charAt(i)-32);
            } else {
                str2[i] = str.charAt(i);
            }
        }
        System.out.println(new String(str2));
    }

}
