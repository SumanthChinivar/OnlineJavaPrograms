package stringPrograms;

public class ReverseStringWithoutReversingSpace {
	public static void main(String[] args) {
		String s="I love Hanuman";//n anmu naHevolI
		String s1=s.replaceAll(" ", "");//IloveHanuman
		String rev="";//output string
		int last=s1.length()-1;//get the char from last position
		//iterate over original string
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				rev+=s.charAt(i);//n amun 
			}else {
				rev+=s1.charAt(last--);//n amun aHevolI
			}
		}
		System.out.println(rev);
	}
}
