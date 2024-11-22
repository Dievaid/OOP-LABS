package oop.pub.observer;

import java.util.Random;

public class PrinterObserver implements Observer {
    private final Random random = new Random();

    @Override
    public void update() {
        System.out.println("Your magic number is " + random.nextInt(100));
    }
}
