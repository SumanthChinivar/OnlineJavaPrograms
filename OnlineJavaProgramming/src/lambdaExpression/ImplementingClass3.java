package lambdaExpression;

public class ImplementingClass3 {
	public static void main(String[] args) {
		LambdaExpression3 l1 = (a, b) -> {
			return a + b;
		};
		System.out.println(l1.add(2, 4));
	}
}
