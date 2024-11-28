package collections;

import java.util.ArrayList;

public class RemovingElementFromList {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Vikas");
		list.add("Rakesh");
		list.add("RP");
		
		System.out.println(list);
		list.remove("RP");
		list.remove("Vikas");
		System.out.println(list);
	}
}
