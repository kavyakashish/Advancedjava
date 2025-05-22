package Arraylist;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;

public class ListOperations {

    // Method to add elements to ArrayList and LinkedList
    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
    }

    // Method to add element at specific index
    public static void addElementAtIndex(List<String> list, int index, String element) {
        list.add(index, element);
    }

    // Method to add multiple elements
    public static void addMultipleElements(List<String> list) {
        list.addAll(List.of("Mango", "Grapes", "Peach"));
    }

    // Method to access elements by index
    public static void accessElements(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }

    // Method to update elements by index
    public static void updateElement(List<String> list, int index, String newElement) {
        list.set(index, newElement);
    }

    // Method to remove an element
    public static void removeElement(List<String> list, String element) {
        list.remove(element);
    }

    // Method to search for an element
    public static boolean searchElement(List<String> list, String element) {
        return list.contains(element);
    }

    // Method to get list size
    public static void listSize(List<String> list) {
        System.out.println("List size: " + list.size());
    }

    // Method to iterate over the list
    public static void iterateList(List<String> list) {
        System.out.println("Iterating over list:");
        for (String item : list) {
            System.out.println(item);
        }
    }

    // Method to use Iterator
    public static void useIterator(List<String> list) {
        Iterator<String> iterator = list.iterator();
        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Method to sort the list
    public static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }

    // Method to get a sublist
    public static void sublist(List<String> list, int start, int end) {
        List<String> sublist = list.subList(start, end);
        System.out.println("Sublist: " + sublist);
    }

    // Method to clear the list
    public static void clearList(List<String> list) {
        list.clear();
        System.out.println("List cleared.");
    }

    public static void main(String[] args) {

        // Using ArrayList
        System.out.println("ArrayList Operations:");
        List<String> arrayList = new ArrayList<>();
        addElements(arrayList);
        addElementAtIndex(arrayList, 1, "Strawberry");
        addMultipleElements(arrayList);
        accessElements(arrayList);
        updateElement(arrayList, 0, "Blueberry");
        removeElement(arrayList, "Banana");
        System.out.println("Is Orange in the list? " + searchElement(arrayList, "Orange"));
        listSize(arrayList);
        iterateList(arrayList);
        useIterator(arrayList);
        sortList(arrayList);
        sublist(arrayList, 1, 4);
        clearList(arrayList);

        // Using LinkedList
        System.out.println("\nLinkedList Operations:");
        List<String> linkedList = new LinkedList<>();
        addElements(linkedList);
        addElementAtIndex(linkedList, 1, "Strawberry");
        addMultipleElements(linkedList);
        accessElements(linkedList);
        updateElement(linkedList, 0, "Blueberry");
        removeElement(linkedList, "Banana");
        System.out.println("Is Orange in the list? " + searchElement(linkedList, "Orange"));
        listSize(linkedList);
        iterateList(linkedList);
        useIterator(linkedList);
        sortList(linkedList);
        sublist(linkedList, 1, 4);
        clearList(linkedList);
    }
}


