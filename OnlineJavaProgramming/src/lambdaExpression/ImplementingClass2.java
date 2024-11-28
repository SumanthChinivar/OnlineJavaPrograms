package lambdaExpression;

public class ImplementingClass2 {
	public static void main(String[] args) {
		LambdaExpression2 l1=(a,b)->{
			System.out.println(a);
			System.out.println(b);
		};
		l1.print(2, 4);
	}
}
