package arrayPrograms;

import java.util.LinkedHashSet;

public class TargetSum {
	public static void main(String[] args) {
		int[] a= {10,5,7,8,6,9,9,10,7};
		int targetSum=15;
		LinkedHashSet set=new LinkedHashSet();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==targetSum) {
					String result=a[i]<a[j]?"("+a[i]+","+a[j]+")":"("+a[j]+","+a[i]+")";
					set.add(result);
				}
			}
		}
		System.out.println(set);
	}
}
