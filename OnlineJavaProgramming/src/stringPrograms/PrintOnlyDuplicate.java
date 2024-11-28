package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintOnlyDuplicate {
	public static void main(String[] args) {
	String s="aaabbbabcacdef";//a-5 b-4 c-2 d-1 e-1 f-1
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
	
	//access the key value from the pair
	//entrySet()----Entry<Character,Integer>---advance for loop
	for(Map.Entry<Character,Integer> hash:map.entrySet()) {
		if(hash.getValue()>1) {
			System.out.print(hash.getKey());
		}
	}
}
}
