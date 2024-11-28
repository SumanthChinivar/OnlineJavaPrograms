package arrayPrograms;

public class SecondLargest {
	public static void main(String[] args) {
		int[] a= {1,2,3,5,6,7,0,2,7};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				smax=max;
				max=a[i];
			}else if(smax<a[i] && a[i]!=max) {
				smax=a[i];
			}
		}
		System.out.println("SecondMax:"+smax);
	}
}
