package collections;

import java.util.ArrayList;

public class AddElementAtAnIndex {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Rakesh");
		list.add("Vikas");
		list.add("Abhay");
		list.add("Sai Chaitanya");
		list.add(4,"RP");
		
		System.out.println(list.toString());
	}
}
