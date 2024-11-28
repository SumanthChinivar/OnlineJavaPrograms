package assignment;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicate {
	public static void main(String[] args) {
        String input = "Ananth";

        Map<Character, Long> occurrences = input.chars()                          // Convert string to IntStream
                                                .mapToObj(c -> (char) c)          // Convert int to Character
                                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Group by character and count


        occurrences.entrySet().stream()
                   .filter(entry -> entry.getValue() > 1) 
                   .forEach(entry -> System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times."));
    }
}
