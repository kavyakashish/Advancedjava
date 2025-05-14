package Arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class SortColors {
    public static void main(String[] args) {
        // Creating an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Sorting the ArrayList
        Collections.sort(colors);

        // Displaying the sorted list
        System.out.println("Sorted colors list: " + colors);
    }
}
