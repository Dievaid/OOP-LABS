package org.example;

import java.util.Objects;

public class Beverage {
    protected String name = "Unknown";

    public Beverage() {}

    public void drink() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beverage beverage = (Beverage) o;
        return Objects.equals(name, beverage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
