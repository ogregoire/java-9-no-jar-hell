package com.greetings;

public class Main implements Runnable {
    @Override
    public void run() {
        System.out.println("Greetings from version TWO!");
    }

    public static void main(String[] args) {
        new Main().run();
    }
}