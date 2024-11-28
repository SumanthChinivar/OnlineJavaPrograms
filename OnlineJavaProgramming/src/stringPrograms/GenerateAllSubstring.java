package stringPrograms;

public class GenerateAllSubstring {
	public static void main(String[] args) {
		String s="India";//s su sum u um m
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.print(s.substring(i,j)+" ");
			}
		}
	}
}
//length > 3
/*
 * aabbaacada 
 * aabbaa ada aca
 * 
 * main(){
 * String s1=substring
 * if(isPalindrome(s1))
 * {
 * Syso(s1);
 * }
 * }
 * public static boolean isPalindrome(String s){
 * reverse--->check if it is palindrome true/false
 * }
 */