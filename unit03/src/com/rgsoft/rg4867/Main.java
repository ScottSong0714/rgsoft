package com.rgsoft.rg4867;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        double a, b, c, perimeter;
        double area;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            perimeter = a+b+c;
            double s = (a+b+c)/2;
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            String result = String.format("%.6f",area);
            System.out.println("area = "+result+" perimeter = "+perimeter);
        }else {
            System.out.println("These sides do not correspond to a valid triangle");
        }

    }
}
