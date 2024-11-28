package stringPrograms;

import java.util.LinkedHashMap;

public class NumberOfOccurence {
	public static void main(String[] args) {
		String s="aaabbbabcac";//a-5 b-4 c-2
		//insertion order is maintained
		LinkedHashMap<Character, Integer> map=new LinkedHashMap();
		//iterate over string
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			//character is present in map
			if(map.containsKey(ch)) {
				//increase the count by 1
				map.put(ch, map.get(ch)+1);
			}else
				//add the character to map and initialize the count to 1
				map.put(ch, 1);
		}
		System.out.println(map);
	}
}
