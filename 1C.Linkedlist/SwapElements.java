package Arraylist;
import java.util.LinkedList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        // Creating a LinkedList and adding elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Swapping the first and third elements (index 0 and 2)
        Collections.swap(colors, 0, 2);

        // Displaying the LinkedList after swap
        System.out.println("LinkedList after swapping first and third elements: " + colors);
    }
}
