package oop.pub.builder;

public interface ShaormaBuilder {
    Shaorma addSauce(boolean hasSauce);
    Shaorma addMeat(int no);
    Shaorma addPickles(boolean hasPickles);
    Shaorma addSalad(boolean hasSalad);
    Shaorma addFries(boolean hasFries);
    Shaorma addTomatoes(boolean hasTomatoes);
}
