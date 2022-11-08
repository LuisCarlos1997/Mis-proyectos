package com.co.bombonite.interaction;

public class Time {

    public static void sleep (int milisegundo)  {
        try {
            Thread.sleep(milisegundo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
