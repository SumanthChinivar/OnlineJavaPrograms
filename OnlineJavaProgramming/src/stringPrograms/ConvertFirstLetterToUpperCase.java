package stringPrograms;

public class ConvertFirstLetterToUpperCase {
	public static void main(String[] args) {
		String s="Welcome to tp office";
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			String s1=arr[i];
			System.out.print(Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ");
		}
	}
}
