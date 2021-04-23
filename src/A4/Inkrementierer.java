package A4;

public class Inkrementierer implements Runnable {
    private final Zaehler zaehler;

    public Inkrementierer(Zaehler zaehler) {
        this.zaehler = zaehler;
    }

    @Override
    public void run() {                     // Using method ikrementiereCounter by adding 1 in every step
        for (int i = 0; i < 1000; i++) {
            zaehler.inkrementiereCounter();
        }
    }
}
