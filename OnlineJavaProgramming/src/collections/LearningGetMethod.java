package collections;

import java.util.ArrayList;
import java.util.List;

public class LearningGetMethod {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Sam");
		list.add("John");
		list.add(25);
		list.add(30);
		list.add("Alex");
		list.add(22);
		
		System.out.println(list);
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
