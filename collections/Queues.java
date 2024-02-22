package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        Queue fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println(fruits);

        Object removed = fruits.remove();
        //we don't have to specify which element because it will automaticlaly
        //remove the first one in the queue (the head)

        System.out.println(removed);

        System.out.println("new head of queue: " + fruits.peek());
    }
}
