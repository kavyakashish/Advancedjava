package Arraylist;
import java.util.ArrayList;

public class RemoveNthElement {
    public static void main(String[] args) {
        // Creating an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Deleting the nth element (for example, the 3rd element, index 2)
        int n = 2; // Change this value to remove a different element
        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("Updated colors list after removing " + (n+1) + "th element: " + colors);
        } else {
            System.out.println("Invalid index.");
        }
    }
}
