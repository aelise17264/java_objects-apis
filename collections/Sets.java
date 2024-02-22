package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        // this repeat element will not be added
        fruits.add("apple");
        // our elements will not print out in the order they were added since sets are unordered
        System.out.println(fruits);

        System.out.println("have lemon? " + fruits.contains("lemon"));

        fruits.remove("lemon");
        System.out.println("number of elements after making lemonade " + fruits.size());

        // @SuppressWarnings("rawtypes")
        // Set moreFruit = Set.of("orange", "pear", "cherry");
        // moreFruit.add("cranberry");
        // moreFruit.remove("pear");
        // System.out.println(moreFruit);


}
}
