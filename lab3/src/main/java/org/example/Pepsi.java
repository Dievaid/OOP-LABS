package org.example;

public class Pepsi extends Beverage {
    public Pepsi() {
        super();
        this.name = "Pepsi";
    }

    @Override
    public void drink() {
        System.out.println("Sipping from some Pepsi");
    }

    public void brew() {
        System.out.println("Brewing pepsi");
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "name='" + name + '\'' +
                '}';
    }


}
