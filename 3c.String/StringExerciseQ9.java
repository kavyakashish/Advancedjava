package Arraylist;
import java.util.Random;

public class StringExerciseQ9 {
    public static void main(String[] args) {
        int length = 10; // Specified length for the random string

        String randomString = generateRandomString(length);
        System.out.println("Generated Random String: " + randomString);
    }

    // User-defined function to generate a random string of specified length
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            randomString.append(characters.charAt(randomIndex));
        }

        return randomString.toString();
    }
}
