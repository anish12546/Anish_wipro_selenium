package Assignment9;
//q14
import java.util.*;

class Person2 {
    private String name;
    private int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        List<Person2> people = Arrays.asList(
            new Person2("Bob", 25),
            new Person2("Alice", 30),
            new Person2("Charlie", 20)
        );

        // Sort by name using method reference
        people.sort(Comparator.comparing(Person2::getName));

        System.out.println("Sorted by name:");
        people.forEach(System.out::println);

        // Sort by age
        people.sort(Comparator.comparingInt(Person2::getAge));

        System.out.println("\nSorted by age:");
        people.forEach(System.out::println);
    }
}
