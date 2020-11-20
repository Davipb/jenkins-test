package com.davipb.jenkinstest;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.print("2 + 2 = ");
        System.out.println(add(2, 2));
    }
}
