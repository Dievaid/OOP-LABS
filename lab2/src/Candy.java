import java.util.Objects;

public class Candy {
    private String name;
    private String flavor;
    private int price;

    public Candy() {
        this.name = "";
        this.flavor = "";
        this.price = OtherMain.rand.nextInt(100);
    }

    public Candy(String name, String flavor, int price) {
        this.name = name;
        this.flavor = flavor;
        this.price = price;
    }

    public Candy(Candy candy) {
        this.name = candy.name;
        this.flavor = candy.flavor;
        this.price = candy.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return price == candy.price && Objects.equals(name, candy.name) && Objects.equals(flavor, candy.flavor);
    }
}
