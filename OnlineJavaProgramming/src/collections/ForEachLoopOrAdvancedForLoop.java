package collections;

import java.util.ArrayList;

public class ForEachLoopOrAdvancedForLoop {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("Sumanth");
		list.add("Sangam");
		list.add("Rakesh");
		
		for(String o:list) {
			System.out.println(o);
		}
	}
}
