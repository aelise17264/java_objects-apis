package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        //elements are unordered
        //we can access elements by their keys

        System.out.println(fruitCalories);

        fruitCalories.put("lemon", 17);//overrides existing value

        System.out.println(fruitCalories);

        //to avoid accidentally overriding
        fruitCalories.putIfAbsent("lemon", 25);
        System.out.println(fruitCalories);

        //replace will not add a new element but will replace data for a specific entry
        System.out.println("banana: " + fruitCalories.get("banana"));


    }
}
