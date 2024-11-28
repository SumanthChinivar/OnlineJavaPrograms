package maps;

import java.util.HashMap;

public class ReplaceMethod {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(10, "Sachin");
		map.put(20, "Ganguly");
		map.put(30, "Virat");
		map.put(40, "Rohit");
		
		System.out.println(map);
		map.replace(10, "Dhoni");
		System.out.println(map);
		map.replace(10, "Dhoni", "Sachin");
		System.out.println(map);
	}
}
