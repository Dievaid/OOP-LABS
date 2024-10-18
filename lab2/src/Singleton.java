import java.util.ArrayList;

public class Singleton {
    private Singleton() {
        candyList = new ArrayList<>();
    }

    private final ArrayList<Candy> candyList;

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public ArrayList<Candy> getCandyList() {
        return candyList;
    }
}
