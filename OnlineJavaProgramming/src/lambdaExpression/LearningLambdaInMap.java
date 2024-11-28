package lambdaExpression;

import java.util.HashMap;

public class LearningLambdaInMap {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap();
		map.put(10, "Sachin");
		map.put(20, "Ganguly");
		map.put(30, "Virat");
		map.put(40, "Rohit");
		
		map.forEach((a,b)->{
			System.out.print(a+" ");
			System.out.print(b);
			System.out.println();
		});
	}
}
