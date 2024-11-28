package assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortingElementsThatStartWithSAndConvertingThemToUpperCase {
	public static void main(String[] args) {
		List<List<String>> ls=Arrays.asList(
				Arrays.asList("Sanket","Navneet","Sisodiya"),
				Arrays.asList("Java","Selenium","Stream"),
				Arrays.asList("Structure","State","Salute"));
		
		Set<String> set=new HashSet();
		
				   List<String> list = ls.stream()
							.flatMap(List::stream)
							.filter(s->s.startsWith("S"))
							.map(String::toUpperCase)
							.distinct()
							.sorted()
							.peek(s->set.add(s))
							.collect(Collectors.toList());
	   System.out.println(set);
	   System.out.println("============");
	   System.out.println(list);	
	}
}
