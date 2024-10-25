package org.example;

public class Jb extends Beverage {
    public Jb() {
        this.name = "Shitty drink";
    }

    @Override
    public void drink() {
        System.out.println("For sure I am getting drunk tonight");
    }

    @Override
    public String toString() {
        return "Jb{" +
                "name='" + name + '\'' +
                '}';
    }
}
