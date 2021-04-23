package A4;

public class MainA4 {

    public static void main(String[] args) {
        final Zaehler zaehler = new Zaehler();

        Thread thread1 = new Thread(new Inkrementierer(zaehler), "Thread 1");
        Thread thread2 = new Thread(new Inkrementierer(zaehler), "Thread 2");
        Thread thread3 = new Thread(new Inkrementierer(zaehler), "Thread 3");
        Thread thread4 = new Thread(new Inkrementierer(zaehler), "Thread 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
