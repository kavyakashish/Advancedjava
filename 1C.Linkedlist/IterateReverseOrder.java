package Arraylist;
import java.util.LinkedList;
import java.util.Iterator;

public class IterateReverseOrder {
    public static void main(String[] args) {
        // Creating a LinkedList and adding elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Using descendingIterator to iterate in reverse order
        Iterator<String> reverseIterator = colors.descendingIterator();
        
        System.out.println("Iterating in reverse order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
