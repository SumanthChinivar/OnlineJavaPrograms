package arrayPrograms;

public class HighestLowest{
	public static void main(String[] args) {
		int[] a= {1,23,2,5,6,3,7};//23 1
		int highest=a[0];
		int lowest=a[0];
		for(int i=1;i<a.length;i++) {
			if(lowest>a[i]) {
				lowest=a[i];
			}
			if(highest<a[i]) {
				highest=a[i];
			}
		}
		
		System.out.println("Highest:"+highest);
		System.out.println("Lowest:"+lowest);
	}
}
