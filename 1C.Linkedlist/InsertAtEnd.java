package Arraylist;
import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        // Creating a LinkedList and adding elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        
        // Inserting the element "Pink" at the end of the list
        colors.offerLast("Pink");

        // Displaying the updated LinkedList
        System.out.println("Updated LinkedList: " + colors);
    }
}
