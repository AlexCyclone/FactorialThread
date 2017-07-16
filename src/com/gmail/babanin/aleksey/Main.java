package com.gmail.babanin.aleksey;

public class Main {

    public static void main(String[] args) {
        Thread[] th = new Thread[100];

        for (int i = 0; i < th.length; i++) {
            th[i] = new Thread(new FactorialThread(i));
        }

        for (int i = 0; i < th.length; i++) {
            th[i].start();
        }

        try {
            for (int i = 0; i < th.length; i++) {
                th[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
