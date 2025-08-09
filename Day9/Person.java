package Assignment9;
//q4

import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public int compareTo(Person other) {
        return this.age - other.age; // Ascending by age
    }

    
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        System.out.println("Before sorting:");
        for (Person p : people) System.out.println(p);

        Collections.sort(people);

        System.out.println("\nAfter sorting by age (ascending):");
        for (Person p : people) System.out.println(p);
    }
}
