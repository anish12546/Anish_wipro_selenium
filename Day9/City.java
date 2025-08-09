package Assignment9;
//q9

import java.util.*;

class City {
    String name;
    int population;

    City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return name + " - Population: " + population;
    }

    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Delhi", 30000000));
        cities.add(new City("Mumbai", 20000000));
        cities.add(new City("Bangalore", 12000000));

        cities.sort(Comparator.comparingInt(c -> c.population));

        System.out.println("Cities sorted by population:");
        cities.forEach(System.out::println);
    }
}
