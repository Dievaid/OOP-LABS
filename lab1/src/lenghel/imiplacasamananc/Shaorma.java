package lenghel.imiplacasamananc;

public class Shaorma {
    private int tomatoesCount;
    private int friesQuantity;
    private int saladQuantity;
    private int meatQuantity;
    private boolean garlicSauce;
    private boolean ketchupSauce;
    private boolean mayonaiseSauce;

    public void prepare() throws InterruptedException {
        System.out.println("Preparing Shaorma...");
        Thread.sleep(1000);
        System.out.println("Shaorma prepared");
        System.out.printf("This shaorma has %s tomatoes", tomatoesCount);
    }

    public void eat() {
        System.out.println("Nom nom nom nom nom nom nom nom nom");
    }

    public int getTomatoesCount() {
        return tomatoesCount;
    }

    public void setTomatoesCount(int tomatoesCount) {
        this.tomatoesCount = tomatoesCount;
    }

    public int getFriesQuantity() {
        return friesQuantity;
    }

    public void setFriesQuantity(int friesQuantity) {
        this.friesQuantity = friesQuantity;
    }

    public int getSaladQuantity() {
        return saladQuantity;
    }

    public void setSaladQuantity(int saladQuantity) {
        this.saladQuantity = saladQuantity;
    }

    public int getMeatQuantity() {
        return meatQuantity;
    }

    public void setMeatQuantity(int meatQuantity) {
        this.meatQuantity = meatQuantity;
    }

    public boolean isGarlicSauce() {
        return garlicSauce;
    }

    public void setGarlicSauce(boolean garlicSauce) {
        this.garlicSauce = garlicSauce;
    }

    public boolean isKetchupSauce() {
        return ketchupSauce;
    }

    public void setKetchupSauce(boolean ketchupSauce) {
        this.ketchupSauce = ketchupSauce;
    }

    public boolean isMayonaiseSauce() {
        return mayonaiseSauce;
    }

    public void setMayonaiseSauce(boolean mayonaiseSauce) {
        this.mayonaiseSauce = mayonaiseSauce;
    }
}
