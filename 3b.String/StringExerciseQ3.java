package Arraylist;
public class StringExerciseQ3 {
    public static void main(String[] args) {
        String originalString = "AIET College";

        String reversedString = reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    // User-defined function to reverse the string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
