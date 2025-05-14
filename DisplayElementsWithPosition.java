package Arraylist;
import java.util.LinkedList;

public class DisplayElementsWithPosition {
    public static void main(String[] args) {
        // Creating a LinkedList and adding elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Displaying elements and their positions
        System.out.println("Displaying elements with positions:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}
