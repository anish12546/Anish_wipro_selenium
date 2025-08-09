package assignment_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class evenoddfilter {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        
        Predicate<Integer> isEven = n -> n % 2 == 0;

       
        Predicate<Integer> isOdd = n -> n % 2 != 0;

       
        List<Integer> evens = numbers.stream()
                                     .filter(isEven)
                                     .collect(Collectors.toList());

       
        List<Integer> odds = numbers.stream()
                                    .filter(isOdd)
                                    .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
    }
}
