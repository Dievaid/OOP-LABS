package oop.pub.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (var observer : observers) {
            observer.update();
        }
    }
}
