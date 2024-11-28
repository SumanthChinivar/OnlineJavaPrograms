package collections;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class ContainsTheElement {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Chiken");
		list.add("Puffs");
		list.add("Chole bature");
		
//		System.out.println(list.contains("Puffs"));
		System.out.println(list.indexOf("Chiken"));
	}
}
