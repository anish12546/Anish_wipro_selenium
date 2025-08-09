//Q15
package Assignment9;

import java.util.*;

class Person3 {
    String name;
    int age;

    Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() { return age; }
    public String getName() { return name; }

    
    public String toString() {
        return name + " (" + age + ")";
    }

    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person3)) return false;
        Person3 other = (Person3) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }

    
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        // Custom comparator by age
        Comparator<Person3> ageComparator = Comparator.comparingInt(Person3::getAge);

        Set<Person3> people = new TreeSet<>(ageComparator);

        people.add(new Person3("Alice", 30));
        people.add(new Person3("Bob", 25));
        people.add(new Person3("Charlie", 35));
        people.add(new Person3("David", 25)); // Will be kept if name is different

        System.out.println("People sorted by age using TreeSet:");
        for (Person3 p : people) {
            System.out.println(p);
        }
    }
}
