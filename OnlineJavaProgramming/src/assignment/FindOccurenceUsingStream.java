package assignment;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurenceUsingStream {
	public static void main(String[] args) {
		String s="Ananth";
		Map<Character,Long> map=s.toLowerCase()
									.chars()
									.mapToObj(c->(char)c)
									.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}
}
