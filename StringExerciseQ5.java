package Arraylist;
public class StringExerciseQ5 {
    public static void main(String[] args) {
        String testString = "   Hello   World   ";

        String result = removeWhitespace(testString);
        System.out.println("Original String: '" + testString + "'");
        System.out.println("String without whitespace: '" + result + "'");
    }

    // User-defined function to remove all whitespace characters from the string
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }
}
