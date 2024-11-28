package assignment;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintUnique {
	public static void main(String[] args) {
        String input = "Ananth";

        Map<Character, Long> occurrences = input.toLowerCase()
        										.chars()                          
                                                .mapToObj(c -> (char) c)          
                                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Group by character and count

        
        occurrences.entrySet().stream()
                   .filter(entry -> entry.getValue() == 1) 
                   .forEach(entry -> System.out.print(entry.getKey()));
    }
}
