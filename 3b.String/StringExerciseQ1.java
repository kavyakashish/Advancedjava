package Arraylist;
public class StringExerciseQ1 {
    public static void main(String[] args) {
        String testString = "   "; // Example input

        if (isNullOrEmpty(testString)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is not null and contains non-whitespace characters.");
        }
    }

    // User-defined function to check if the string is null or contains only whitespace
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
