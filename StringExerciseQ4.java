package Arraylist;
public class StringExerciseQ4 {
    public static void main(String[] args) {
        String testString = "A man, a plan, a canal, Panama";

        if (isPalindrome(testString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // User-defined function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lower case
        String cleanedString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        return cleanedString.equals(reversedString);
    }
}
