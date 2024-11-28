package maps;

import java.util.HashMap;

public class ContainsMethod {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(10, "Sachin");
		map.put(20, "Ganguly");
		map.put(30, "Virat");
		map.put(40, "Rohit");
		
		System.out.println(map.containsKey(20));
		System.out.println(map.containsValue("Sachin"));
		System.out.println(map.containsKey(80));
		System.out.println(map.containsValue("Kumble"));
	}
}
