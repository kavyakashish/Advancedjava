package Arraylist;
public class StringExerciseQ6 {
    public static void main(String[] args) {
        String inputString = "hello world from aiet";

        String capitalizedString = capitalizeWords(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Capitalized String: " + capitalizedString);
    }

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word.substring(0, 1).toUpperCase())
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        
        return result.toString().trim();
    }
}

