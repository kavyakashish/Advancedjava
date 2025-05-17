package Arraylist;
public class StringOperationsDemo {

    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello"));

        // 4. String Searching
        String sample = "Java is powerful";
        System.out.println("Index of 'is': " + sample.indexOf("is"));
        System.out.println("Contains 'power': " + sample.contains("power"));

        // 5. Substring Operations
        System.out.println("Substring from index 5: " + sample.substring(5));
        System.out.println("Substring from 5 to 7: " + sample.substring(5, 7));

        // 6. String Modification
        String modified = sample.replace("powerful", "awesome");
        System.out.println("Modified String: " + modified);

        // 7. Whitespace Handling
        String withSpaces = "   Java Programming   ";
        System.out.println("Before trim: '" + withSpaces + "'");
        System.out.println("After trim: '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        String combined = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + combined);

        // 9. String Splitting
        String csv = "apple,banana,cherry";
        String[] fruits = csv.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(4, " Language");
        sb.replace(5, 13, " is");
        sb.delete(5, 8);
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        System.out.printf("Name: %s, Age: %d%n", name, age);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "example@domain.com";
        if (email.contains("@") && email.endsWith(".com") && email.startsWith("ex")) {
            System.out.println("Email format is likely valid.");
        } else {
            System.out.println("Email format is invalid.");
        }
    }
}
