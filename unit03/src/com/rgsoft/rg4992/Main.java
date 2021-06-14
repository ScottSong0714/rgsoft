package com.rgsoft.rg4992;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double perimeter, area;

        if(a+b>c && a+c > b && b+c>a){
            perimeter = a+b+c;
            double s = (a+b+c)/2;
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            String result = String.format("%.2f",area);
            String result2 = String.format("%.2f",perimeter);
            System.out.println("area = "+result);
            System.out.println("perimeter = "+result2);
        }else{
            System.out.println("This is not a valid triangle");
        }

    }

}
