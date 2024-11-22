package oop.pub.observer;

public class CounterObserver implements Observer {
    private static int counter = 0;

    @Override
    public void update() {
        System.out.println("Counter: " + ++counter);
    }
}
