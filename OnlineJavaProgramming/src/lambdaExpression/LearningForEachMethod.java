package lambdaExpression;

import java.util.ArrayList;

public class LearningForEachMethod {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Rakesh");
		list.add("Vikas");
		list.add("Abhay");
		list.add("Sai Chaitanya");
		
		list.forEach((a)->System.out.println(a));
	}
}
