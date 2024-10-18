package lenghel.imiplacasamananc;

public class ShaormaNation {
    private Worker[] workers = new Worker[10];

    public void hireWorkers() {
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }
    }

    public void prepareShaormas() throws InterruptedException {
        for (int i = 0; i < workers.length; i++) {
            Shaorma shaorma = workers[i].makeShaorma();
            shaorma.prepare();
            System.out.println();
            shaorma.eat();
        }
    }
}
