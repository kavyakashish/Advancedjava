package Arraylist;
public class StringExerciseQ2 {
    public static void main(String[] args) {
        String mainString = "Java is fun, Java is powerful";
        String subString = "Java";

        int count = countOccurrences(mainString, subString);
        System.out.println("The substring '" + subString + "' appears " + count + " times.");
    }

    // User-defined function to count occurrences of a substring in a string
    public static int countOccurrences(String mainString, String subString) {
        int count = 0;
        int index = 0;
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }
        return count;
    }
}

