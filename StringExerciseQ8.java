package Arraylist;
public class StringExerciseQ8 {
    public static void main(String[] args) {
        String inputString = "123456";

        if (isNumeric(inputString)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does not contain only numeric characters.");
        }
    }

    // User-defined function to verify if the string contains only numeric characters
    public static boolean isNumeric(String str) {
        return str.matches("[0-9]+");
    }
}
