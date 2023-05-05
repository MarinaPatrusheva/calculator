package org.example;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        BinOps binOps = new BinOps();
        System.out.println(calc.sum(2, 5));
        System.out.println(calc.pow(3, 5));
        System.out.println(calc.mult(25, 10));
        System.out.println(Integer.parseInt(binOps.sum(Integer.toBinaryString(25), Integer.toBinaryString(26)), 2));
        System.out.println(binOps.mult(Integer.toBinaryString(25), Integer.toBinaryString(39)));
    }
}