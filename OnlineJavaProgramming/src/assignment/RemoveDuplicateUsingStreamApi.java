package assignment;

import java.util.stream.Collectors;

public class RemoveDuplicateUsingStreamApi {
	public static void main(String[] args) {
		String s="Ananth";
		String op=s.toLowerCase()
				  .chars()
				  .distinct()
				  .mapToObj(c->String.valueOf((char)c))
				  .collect(Collectors.joining());
		System.out.println(op);
		
	}
}
