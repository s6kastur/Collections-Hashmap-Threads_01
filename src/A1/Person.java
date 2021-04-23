package A1;

import org.jetbrains.annotations.NotNull;

// Comparable gets implemented with type "Person"
public class Person implements Comparable<Person> {
    final String name, lastName;
    final int age;

// Creating constructor and handle egde cases
    public Person(@NotNull String name, @NotNull String lastName, int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative"); // Strings can't be Null right now,
        this.name = name;                                                          // age can't also be negative now.
        this.lastName = lastName;
        this.age = age;
    }

    public void print(){
        System.out.println(this);       // Method print() gets implemented by just using sout(this) which means
    }                                   // that name, lastname and age will be printed on console

    @Override
    public int compareTo(@NotNull Person person) {
        final int lastNameInt = this.lastName.compareTo(person.lastName);   // Method compareTo checks value of
        if (lastNameInt != 0) return lastNameInt;                           // return from Comparable.compareTo.
                                                                            // Handeling edge cases
        final int nameInt = this.name.compareTo(person.name);               // Creating "sort-algorithm" for
        if (nameInt != 0) return nameInt;                                   // (1.) lastName (2.) name (3.) age

        return this.age - person.age;
    }

    @Override                                                               // Creating toString method just for
    public String toString() {                                              // other exercises
        return name + " " + lastName + " (" + age + ")";
    }
}