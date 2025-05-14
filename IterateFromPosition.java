package Arraylist;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromPosition {
    public static void main(String[] args) {
        // Creating a LinkedList and adding elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Using ListIterator to iterate starting from the 2nd position (index 1)
        ListIterator<String> iterator = colors.listIterator(1); // Start from the 2nd element (index 1)
        
        System.out.println("Iterating from the 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
