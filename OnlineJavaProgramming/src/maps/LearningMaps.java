package maps;

import java.util.HashMap;

public class LearningMaps {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap();
		map.put(10, "Sachin");
		map.put(20, "Ganguly");
		map.put(30, "Virat");
		map.put(40, "Rohit");
		
		System.out.println(map);
		System.out.println(map.getOrDefault(10, "Rahul"));
		map.clear();
		System.out.println(map);
		
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map);
		map.put(10, map.getOrDefault(10, "Rahul"));
		System.out.println(map);
	}
}
