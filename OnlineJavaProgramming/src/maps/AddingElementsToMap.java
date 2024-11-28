package maps;

import java.util.HashMap;

public class AddingElementsToMap {
	public static void main(String[] args) {
		HashMap hash=new HashMap();
		hash.put(7, "Dhoni");
		hash.put("Eighteen", "Virat");
		hash.put(null,null);
		hash.put(10, null);
		
		System.out.println(hash);
	}
}
