package A1;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

// Comparator gets implemented with type "Person"
public class PersonenSortierer implements Comparator<Person> {

    @Override
    public int compare(@NotNull Person person1, @NotNull Person person2) {      // Handeling egde cases
        final int nameInt = person1.name.compareTo(person2.name);               // Creating "sort-algorithm" for
        if (nameInt != 0) return nameInt;                                       // (1.) name (2.) lastName (3.) age

        final int lastNameInt = person1.lastName.compareTo(person2.lastName);
        if (lastNameInt != 0) return lastNameInt;

        return person1.age - person2.age;
    }
}
