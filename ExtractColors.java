package Arraylist;
import java.util.ArrayList;
import java.util.List;

public class ExtractColors {
    public static void main(String[] args) {
        // Creating an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Extracting the 1st and 2nd elements (index 0 and 1)
        List<String> sublist = colors.subList(0, 2);

        // Displaying the extracted sublist
        System.out.println("Extracted colors (1st and 2nd): " + sublist);
    }
}
