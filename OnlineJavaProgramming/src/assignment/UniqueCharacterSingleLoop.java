package assignment;

public class UniqueCharacterSingleLoop {
	public static void main(String[] args) {
		String s="ananth";
		String op="";
		for(int i=0;i<s.length();i++) {
			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
				op=op+s.charAt(i);
			}
		}
		System.out.println(op);
	}
}
