package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnIterator {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Sumanth");
		list.add("Sangam");
		list.add("Rakesh");
		
		Iterator i1=list.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}