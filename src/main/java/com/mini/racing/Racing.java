package com.mini.racing;

public class Racing {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        Horse h2 = new Horse();
        h1.start();
        h2.start();
        HorseRunnable h3 = new HorseRunnable();
        Thread td = new Thread(h3);
        td.start();
    }


}
