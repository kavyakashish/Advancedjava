package arraylistexample;
import java.util.*;
public class SubListColors {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

	        System.out.println("Original Colors: " + colors);
	        List<String> subList = colors.subList(0, 2); // From index 0 to 2 (exclusive)
	        System.out.println("SubList (1st and 2nd elements): " + subList);
	    }
	}
