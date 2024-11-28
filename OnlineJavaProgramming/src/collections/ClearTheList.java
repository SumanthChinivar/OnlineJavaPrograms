package collections;

import java.util.ArrayList;

public class ClearTheList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Rakesh");
		list.add("Sukesh");
		list.add("Sanket");
		System.out.println("List:" + list);
		
		list.clear();
		System.out.println(list);
	}
}
