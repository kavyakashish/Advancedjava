package Arraylist;
import java.util.ArrayList;

public class RemoveColors {
    public static void main(String[] args) {
        // Creating an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Remove 2nd element (index 1) and the color "Blue"
        colors.remove(1);  // Removing the 2nd element (index starts from 0)
        colors.remove("Blue");  // Removing the color "Blue"

        // Displaying the updated ArrayList
        System.out.println("Updated colors list: " + colors);
    }
}

