public class Main {
    public static void main(String[] args) {
        Candy candy = new Candy("Snickers", "Hazelnut", 5);
        Candy copyCandy = new Candy(candy);
        candy.setFlavor("Caramel");

        System.out.println(candy);
        System.out.println(copyCandy);
        System.out.println(candy == copyCandy);
        System.out.println(candy.equals(copyCandy));

        System.out.println(OtherMain.rand.nextInt());

        Singleton.getInstance().getCandyList().add(candy);
        Singleton.getInstance().getCandyList().add(copyCandy);

        for (Candy c : Singleton.getInstance().getCandyList()) {
            System.out.println(c);
        }
    }
}