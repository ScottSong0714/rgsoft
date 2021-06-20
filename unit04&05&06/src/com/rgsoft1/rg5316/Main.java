package com.rgsoft1.rg5316;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();
        int i = fibonacci.Fibonacci(scanner.nextInt());
        System.out.println(i);

    }

}
