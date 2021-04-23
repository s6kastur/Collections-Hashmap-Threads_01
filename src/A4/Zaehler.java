package A4;

public class Zaehler {
    private int counter;

    public synchronized void inkrementiereCounter() {       // "synchronized" is used to let the threads
        if (counter < 1000) {                               // work "together"
            System.out.println(Thread.currentThread().getName() + " :: " + counter++);  // printing on console
        }
    }
}
