package A1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainA1 {
    public static void main(String[] args) {
        final PersonenSortierer personenSortierer = new PersonenSortierer();

        final Person p1 = new Person("Kai", "Ley", 23);             // Creating some elements for
        final Person p2 = new Person("Jonte", "Zehring", 56);       // Person.
        final Person p3 = new Person("Alex", "Sturm", 20);
        final Person p4 = new Person("Ron", "Tanner", 21);

        List<Person> personList = Arrays.asList(p1, p2, p3, p4);                      // Creating an ArrayList with
        System.out.println("Unsortiert: " + Arrays.toString(personList.toArray()));   // elements created above
        System.out.println("Comparable, Maximales Element: " + Collections.max(personList));
        System.out.println("Comparable, Minimales Element: " + Collections.min(personList));
        System.out.println("Comparator, Maximales Element: " + Collections.max(personList, personenSortierer));
        System.out.println("Comparator, Minimales Element: " + Collections.min(personList, personenSortierer));

        Collections.sort(personList);                                                 // Using Interface Comparable
        System.out.println("Sortiert nach Nachname: " + Arrays.toString(personList.toArray()));

        personList = Arrays.asList(p1, p2, p3, p4);                                   // Re-creating the ArrayList
                                                                                      // for a different sorting type
        Collections.sort(personList, personenSortierer);                              // Using Interface Comparator
        System.out.println("Sortiert nach Vorname: " + Arrays.toString(personList.toArray()));

    }
}
