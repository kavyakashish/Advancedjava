package Arraylist;
public class StringExerciseQ10 {
    public static void main(String[] args) {
        String inputString = "This is a test string";

        int wordCount = countWords(inputString);
        System.out.println("The number of words in the string is: " + wordCount);
    }

    // User-defined function to count the number of words in a string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
