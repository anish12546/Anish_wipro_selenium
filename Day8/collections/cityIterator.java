//Q8
package Assignment8_Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class cityIterator {
    public static void main(String[] args) {
      
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Kolkata");

        
        Iterator<String> itr = cities.iterator();

        
        System.out.println("List of Cities:");
        while (itr.hasNext()) {
            String city = itr.next();
            System.out.println(city);
        }
    }
}
