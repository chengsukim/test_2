package org.example;


public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}