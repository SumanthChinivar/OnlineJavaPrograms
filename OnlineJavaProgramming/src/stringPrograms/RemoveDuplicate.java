package stringPrograms;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String s="Bharath";//Bhart
		String op="";//Bhart
		for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		//-1---or +ve
			if(op.indexOf(ch)==-1) {
				op+=ch;
			}
		}
		System.out.println(op);
	}
}

//contains
//Fish
//array
//arrayList
