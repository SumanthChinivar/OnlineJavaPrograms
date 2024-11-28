package stringPrograms;

public class ReverseEachWordInString {
	public static void main(String[] args) {
		String s="Welcome to tp office";
		String[] arr=s.split(" ");//Welcome to tp office
		for (int i = 0; i < arr.length; i++) {
			String s1=arr[i];
			StringBuilder sb=new StringBuilder(s1);
			System.out.print(sb.reverse()+" ");
			
			//for(){}
		}
		//public static String reverse(String s){for(){}}
	}
}
