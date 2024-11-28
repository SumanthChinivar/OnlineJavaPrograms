package collections;

import java.util.ArrayList;

public class AddCollectionAtAnIndex {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		System.out.println("===================");
		
		ArrayList list1=new ArrayList();
		list1.add(40);
		list1.add(50);
		list1.add(60);
		System.out.println(list1);
		System.out.println("===============");
		
		list.addAll(2,list1);
		System.out.println(list);
	}
}
