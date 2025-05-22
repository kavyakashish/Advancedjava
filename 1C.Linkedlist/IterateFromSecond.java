package ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class IterateFromSecond {
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");
	        list.add("Orange");

	        // Start iterating from the 2nd position (index 1)
	        ListIterator<String> iterator = list.listIterator(1);

	        System.out.println("Iterating from the 2nd position:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


