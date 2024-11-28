package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class LearningListIterator {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Sumanth");
		list.add("Sangam");
		list.add("Rakesh");
		
		ListIterator ls = list.listIterator(1);
		
		while(ls.hasNext()) {
			System.out.println(ls.next());
		}
	}
}
