package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        @SuppressWarnings("rawtypes")
        List fruits = new ArrayList();
        fruits.add("watermelon");
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.add("orange");

        System.out.println(fruits);

        System.out.println(fruits.get(2));

        //replace an element in the list by using the set method
        // id the particular index you want to replace
        fruits.set(2, "grape");

        System.out.println(fruits);
        System.out.println(fruits.get(2));

        fruits.add("orange");
        System.out.println(fruits);

        System.out.println("index of first orange " + fruits.indexOf("orange") );
        System.out.println("index of last orange " + fruits.lastIndexOf("orange") );

        fruits.remove(4);
        System.out.println(fruits);

    }
}