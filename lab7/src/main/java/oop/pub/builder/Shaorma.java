package oop.pub.builder;

public class Shaorma implements ShaormaBuilder {
    private boolean hasSauce;
    private int meatCount;
    private boolean hasPickles;
    private boolean hasSalad;
    private boolean hasFries;
    private boolean hasTomatoes;

    public void setHasSauce(boolean hasSauce) {
        this.hasSauce = hasSauce;
    }

    @Override
    public Shaorma addSauce(boolean hasSauce) {
        this.hasSauce = hasSauce;
        return this;
    }

    @Override
    public Shaorma addMeat(int no) {
        this.meatCount = no;
        return this;
    }

    @Override
    public Shaorma addPickles(boolean hasPickles) {
        this.hasPickles = hasPickles;
        return this;
    }

    @Override
    public Shaorma addSalad(boolean hasSalad) {
        this.hasSalad = hasSalad;
        return this;
    }

    @Override
    public Shaorma addFries(boolean hasFries) {
        this.hasFries = hasFries;
        return this;
    }

    @Override
    public Shaorma addTomatoes(boolean hasTomatoes) {
        this.hasTomatoes = hasTomatoes;
        return this;
    }
}
