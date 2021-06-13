package com.rgsoft.rg4998;

import java.util.*;

public class rg4998 {

    public static void main(String[] args) {

        int mark;
        Scanner sc = new Scanner(System.in);
        mark = sc.nextInt();
        if(mark >= 60)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }

}
