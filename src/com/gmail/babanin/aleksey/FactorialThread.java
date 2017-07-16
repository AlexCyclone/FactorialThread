package com.gmail.babanin.aleksey;

import java.math.BigInteger;

public class FactorialThread implements Runnable {
    private int number;

    public FactorialThread(int number) {
        super();
        this.number = number;
    }

    private BigInteger calculateFactorial(int number) {
        BigInteger fact = new BigInteger("1");
        for (int i = 0; i < number; i += 1) {
            fact = fact.multiply(new BigInteger(Integer.toString(i + 1)));
        }
        return fact;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        System.out.println(th.getName() + " -> " + number + "! = " + calculateFactorial(number));
    }
}
