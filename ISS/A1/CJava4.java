//String & Arrays
public class CJava4 {
    // String Operations
    public static void performStringOperations(String input) {
        // Length of the string
        int length = input.length();
        System.out.println("Length of the string = " + length);

        // Convert the String to Uppercase
        String uppercase = input.toUpperCase();
        System.out.println("Uppercase string = " + uppercase);

        // Convert the String to Lowercase
        String lowercase = input.toLowerCase();
        System.out.println("Lowercase string = " + lowercase);

        // Check if the string starts with a specific prefix
        boolean startsWithPrefix = input.startsWith("is");
        System.out.println("Starts with 'is'? - " + startsWithPrefix);

        boolean startsWithPrefix2 = input.startsWith("This");
        System.out.println("Starts with 'This'? - " + startsWithPrefix2);

        // Check if the string ends with a specific suffix
        boolean endsWithSuffix = input.endsWith("Words");
        System.out.println("Ends with 'Words'? - " + endsWithSuffix);

        // Extract a substring from the original string
        String substring = input.substring(6, 13);
        System.out.println("Substring = " + substring);

        // Replace a specific character or substring
        String replaced = input.replace("Words", "Java");
        System.out.println("Replaced string = " + replaced);

        // Split the string into an array of substrings
        String[] words = input.split(" ");
        System.out.print("Words = ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // Remove leading and trailing whitespaces from the string
        String trimmed = input.trim();
        System.out.println("Trimmed string = " + trimmed);
    }

    // Array linear search
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Element found, return the index
            }
        }
        return -1; // Element not found
    }

    // Array indexing
    public static int getElementAtIndex(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid Index!");
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Get element at index eg
        int getIndex = 2;
        try {
            int elementAtIndex = getElementAtIndex(numbers, getIndex);
            System.out.println("Element @ index " + getIndex + " = " + elementAtIndex);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        // Linear search eg
        int searchKey = 30;
        int foundIndex = linearSearch(numbers, searchKey);
        if (foundIndex <= -1) {
            System.out.println("Element " + searchKey + " is not present in the Array");
        } else {
            System.out.println("Element " + searchKey + " is present @ index = " + foundIndex);
        }
        // String operations
        String input = "   This is a String of Words   ";
        performStringOperations(input);
    }
}
