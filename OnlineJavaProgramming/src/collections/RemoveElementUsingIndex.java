package collections;

import java.util.ArrayList;

public class RemoveElementUsingIndex {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Anish");
		list.add("Apoorva");
		list.add("Neha");
		
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
	}
}
