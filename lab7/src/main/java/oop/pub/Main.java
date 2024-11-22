package oop.pub;

import oop.pub.builder.Shaorma;
import oop.pub.factory.method.CommandFactory;
import oop.pub.observer.CounterObserver;
import oop.pub.observer.PrinterObserver;
import oop.pub.observer.Publisher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));

        var command1 = CommandFactory.getCommand("add", list, "d");
        var command2 = CommandFactory.getCommand("remove", list, "a");

        command1.execute();
        System.out.println(list);
        command2.execute();
        System.out.println(list);

        CounterObserver counterObserver = new CounterObserver();
        PrinterObserver printerObserver = new PrinterObserver();
        Publisher publisher = new Publisher();

        publisher.registerObserver(counterObserver);
        publisher.registerObserver(printerObserver);
        publisher.registerObserver(counterObserver);

        for (int i = 0; i < 10; i++) {
            publisher.notifyObservers();
            Thread.sleep(1000);
        }

        Shaorma shaorma = new Shaorma()
                .addFries(true)
                .addMeat(5)
                .addPickles(true)
                .addSauce(true);
    }
}