package stringPrograms;

public class ReverseAString {
	public static void main(String[] args) {
		String s="Rakesh";//malayalaM
		String op="";
		for(int i=s.length()-1;i>=0;i--) {
			op+=s.charAt(i);
		}
//		System.out.println(op);
		
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
		if(s.equalsIgnoreCase(op)) {
			System.out.println(s+" is palindrome");
		}else
			System.out.println(s+" is not palindrome");
	}
}
//Reverse the string using recursion
/*
*If a method try to call itself we call it as recurion
*Method call 
*Method chaining
*
*public static void reverse(String s)
*{
*reverse(s);
*}
*
*malayalam, madam, MOM, DAD
*
*Reversed==Original
*/