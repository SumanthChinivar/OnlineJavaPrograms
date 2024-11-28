package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCollection {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Rakesh");
		list.add("Sukesh");
		list.add("Sanket");
		System.out.println("List:"+list);
		
		ArrayList list1=new ArrayList();
		list1.add("Vikas");
		list1.add("Ganesh");
		list1.add("Sagar");
		System.out.println("List1:"+list1);
		

		list.addAll(list1);
		System.out.println("List:"+list);
		list.removeAll(list);
		System.out.println("List:"+list);
	}
}
