package stringPrograms;

public class AddDigitsInString {
	public static void main(String[] args) {
		String s="aa1b3c4&*%i09";//17
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9'/*Character.isDigit(ch)*/) {
				sum+=ch-48;
			}
		}
		System.out.println(sum);
	}
}
