package lenghel.imiplacasamananc;

import java.util.Random;

public class Worker {
    private String name;
    private int age;
    private int salary;

    public Shaorma makeShaorma() {
        Shaorma shaorma = new Shaorma();
        Random rand = new Random();
        shaorma.setMeatQuantity(100);
        shaorma.setFriesQuantity(100);
        shaorma.setTomatoesCount(rand.nextInt(5));
        return shaorma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
