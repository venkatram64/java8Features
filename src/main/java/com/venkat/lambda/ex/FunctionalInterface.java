package com.venkat.lambda.ex;

public class FunctionalInterface {

    //Functional interface
    interface Multiplier {
        int multiply(int i, int j);
    }

    //Lambda expression
    static Multiplier m = (p, q) -> p * q;

    public static void main(String[] args) {
        FunctionalInterface fi = new FunctionalInterface();
        System.out.println("mulitiplication " + m.multiply(4,5));
    }
}
