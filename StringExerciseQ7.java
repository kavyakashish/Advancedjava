package Arraylist;
public class StringExerciseQ7 {
    public static void main(String[] args) {
        String inputString = "This is a long string that needs to be shortened.";
        int maxLength = 20;

        String truncatedString = truncate(inputString, maxLength);
        System.out.println("Original String: " + inputString);
        System.out.println("Truncated String: " + truncatedString);
    }

    // User-defined function to truncate the string and add ellipsis if necessary
    public static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str;
        } else {
            return str.substring(0, length) + "...";
        }
    }
}
