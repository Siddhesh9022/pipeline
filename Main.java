import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "avocado", "orange", "grape");

        // Create a stream from the list
        strings.stream()
            // Filter out strings starting with "a"
            .filter(s -> !s.startsWith("a"))
            // Convert remaining strings to uppercase
            .map(String::toUpperCase)
            // Print the result
            .forEach(System.out::println);
    }
}

