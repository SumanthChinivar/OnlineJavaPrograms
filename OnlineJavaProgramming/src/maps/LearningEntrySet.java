package maps;

import java.util.HashMap;
import java.util.Map;

public class LearningEntrySet {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap();
		map.put(10, "Sachin");
		map.put(20, "Ganguly");
		map.put(30, "Virat");
		map.put(40, "Rohit");
		
		for(Map.Entry<Integer,String> hash:map.entrySet()) {
			System.out.println(hash.getKey()+" "+hash.getValue());
		}
	}
}
