package A2;

import A1.Person;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MainA2 {

    public static void main(String[] args) {
        final Person p1 = new Person("Kai", "Ley", 23);
        final Person p2 = new Person("Jonte", "Zehring", 56);
        final Person p3 = new Person("Alex", "Sturm", 20);
        final Person p4 = new Person("Ron", "Tanner", 21);

        final Map<String, Person> personMap = new HashMap<>();         // Creating a new Hashmap and implement
        personMap.put(p1.toString(), p1);                              // the persons above in it by using
        personMap.put(p2.toString(), p2);                              // name.put(personx.toString(), personx)
        personMap.put(p3.toString(), p3);
        personMap.put(p4.toString(), p4);

        for (Person person : personMap.values()){                       // Using for-each loop to print every
            System.out.println(person);                                 // single element on console
        }

        System.out.println("------------Ende der Aufgabe Nr. 1------------");

        /*
        b)
        Die HashMap hat eine Zugriffszeit von O(1) durch das Schlüssel Schloss Prinzip und das Durchsuchen der Liste
        läuft in O(n) (n ist Anzahl der Elemente)
         */

        //c)
        System.out.println("------------1. (weitere) Option------------");
        personMap.values().forEach(System.out::println);
        System.out.println("------------2. (weitere) Option------------");
        personMap.forEach((s, person) -> System.out.println(person));
    }
}
