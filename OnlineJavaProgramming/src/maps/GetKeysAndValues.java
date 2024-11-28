package maps;

import java.util.HashMap;

public class GetKeysAndValues {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(10, "Sachin");
		map.put(20, "Ganguly");
		map.put(30, "Virat");
		map.put(40, "Rohit");
		
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
}
