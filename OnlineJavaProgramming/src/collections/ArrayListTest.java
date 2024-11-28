package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("Sam");
		list.add("John");
		list.add(25);
		list.add(30);
		list.add("Alex");
		list.add(22);

		System.out.println(list);

//		Iterator<Object> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			Object element = iterator.next();
//			if (element instanceof String) {
//				iterator.remove();
//			}
//		}
//		System.out.println(list);
		
		list.removeIf(e->e instanceof String);
		System.out.println(list);
	}
}
