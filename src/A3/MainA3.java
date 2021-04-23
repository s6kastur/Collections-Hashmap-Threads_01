package A3;

public class MainA3 {

    public static void main(String[] args) throws InterruptedException {
        PrimzahlRechner prim1 = new PrimzahlRechner(0, 1000);       // Creating 4 threads
        PrimzahlRechner prim2 = new PrimzahlRechner(1001, 2000);
        PrimzahlRechner prim3 = new PrimzahlRechner(2001, 3000);
        PrimzahlRechner prim4 = new PrimzahlRechner(3001, 4000);

        System.out.println("Ausgabe aller Primzahlen von 0 - 4000:");

        prim1.start();      // Starting every single thread
        prim2.start();
        prim3.start();
        prim4.start();

        prim1.join();      // "Ends" every single thread
        prim2.join();      // means, let the thread "die"
        prim3.join();      // before printing on console
        prim4.join();

        prim1.print();
        prim2.print();
        prim3.print();
        prim4.print();

        /*
        b)
        1. Lambdas: Thread thread = new Thread(() -> //Code//);
        2. Statt von Thread erben, Interface runnable implementieren und dann in Thread Konstruktor einsetzen
        */
    }
}
