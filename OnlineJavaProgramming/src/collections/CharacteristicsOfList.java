package collections;

import java.util.ArrayList;

public class CharacteristicsOfList {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Sumanth");
		list.add(10);
		list.add(10);
		list.add(null);
		list.add(null);
		
		System.out.println(list);
	}
}

//Order of insertion is maintained
//Duplicates are allowed
//Heterogeneous 
//Null
