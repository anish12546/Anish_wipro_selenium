//Q3
package Assignment8_LinkedHashSet;

import java.util.LinkedHashSet;

public class MergeLinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Blue");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Yellow");
        set2.add("Green"); 
        set2.add("Pink");

        
        LinkedHashSet<String> mergedSet = new LinkedHashSet<>(set1);
        mergedSet.addAll(set2);

        System.out.println("Merged LinkedHashSet:");
        for (String color : mergedSet) {
            System.out.println(color);
        }
    }
}
