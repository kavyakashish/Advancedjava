package Arraylist;
import java.util.Scanner;

public class StringOperationsFullDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of String 1: " + str1.length());
        if (str1.length() > 0)
            System.out.println("Character at index 0 of String 1: " + str1.charAt(0));

        // 3. String Comparison
        System.out.println("String 1 equals String 2: " + str1.equals(str2));
        System.out.println("String 1 equalsIgnoreCase String 2: " + str1.equalsIgnoreCase(str2));
        System.out.println("String 1 compareTo String 2: " + str1.compareTo(str2));

        // 4. String Searching
        String sample = "This is an example string.";
        System.out.println("Sample String: " + sample);
        System.out.println("Index of 'example': " + sample.indexOf("example"));
        System.out.println("Does sample contain 'an'? " + sample.contains("an"));

        // 5. Substring Operations
        System.out.println("Substring from index 5: " + sample.substring(5));
        System.out.println("Substring from 5 to 10: " + sample.substring(5, 10));

        // 6. String Modification
        String modified = sample.replace("example", "demo");
        System.out.println("Modified String: " + modified);

        // 7. Whitespace Handling
        String withWhitespace = "   Hello AIET   ";
        System.out.println("Original with whitespace: '" + withWhitespace + "'");
        System.out.println("After trim: '" + withWhitespace.trim() + "'");

        // 8. String Concatenation
        String combined = str1 + " " + str2;
        System.out.println("Concatenated String: " + combined);

        // 9. String Splitting
        String csv = "Java,Python,C++,C#,JavaScript";
        String[] langs = csv.split(",");
        System.out.println("Languages:");
        for (String lang : langs) {
            System.out.println(lang);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" is a college");
        sb.insert(4, " - Awesome");
        sb.replace(0, 4, "Our College");
        sb.delete(0, 4);
        System.out.println("StringBuilder Output: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int marks = 95;
        System.out.printf("Formatted Output: Name = %s, Marks = %d%n", name, marks);

        // 12. Validate Email with contains(), startsWith(), endsWith()
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        if (email.contains("@") && email.endsWith(".com") && email.startsWith("user")) {
            System.out.println("✅ Email format is likely valid.");
        } else {
            System.out.println("❌ Email format is invalid.");
        }

        scanner.close();
    }
}
