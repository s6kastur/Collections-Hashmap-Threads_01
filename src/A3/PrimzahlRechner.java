package A3;

import java.util.ArrayList;
import java.util.List;

// extends Thread --> "inherit" from Thread
public class PrimzahlRechner extends Thread {
    private final int u, o;
    private final List<Integer> pNumbers = new ArrayList<>();      // Creating new ArrayList "pNumbers"

    public PrimzahlRechner(int u, int o) {                         // Handle egde cases
        if (u > o) {                                               // short "swaping-algorithm" that swaps
            final int tmp = o;                                     // both elements if the first one is
            o = u;                                                 // "smaller" than the other
            u = tmp;
        }
        this.u = u;
        this.o = o;
    }

    @Override
    public void run() {                                        // Run method is implemented by "Thread"
        for (int i = u; i <= o; i++) {                         // Using "isPrim" method below and adds the
            if (isPrim(i)) pNumbers.add(i);                    // element on the list
        }
    }

    public List<Integer> getpNumbers(){
        return pNumbers;
    }

    private boolean isPrim(int n){                             // Creating a "Prime-Number-checker"
        if (n < 2) return false;                               // Handle egde cases

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public void print(){
        pNumbers.forEach(System.out::println);                 // Printing all elements on console
    }
}
