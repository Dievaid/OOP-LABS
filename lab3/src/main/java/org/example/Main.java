package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Beverage b1 = new Pepsi();
        Beverage b2 = new Jb();

        ArrayList<Beverage> beverages = new ArrayList<>();
        beverages.add(b1);
        beverages.add(b2);

        System.out.println(beverages);

        for (Beverage beverage : beverages) {
            beverage.drink();

            //AVOID THIS, IT'S CANCEROUS
            if (beverage instanceof Pepsi) {
                Pepsi pepsi = (Pepsi) beverage;
                pepsi.brew();
            }
        }
    }
}