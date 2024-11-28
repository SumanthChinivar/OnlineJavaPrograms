package arrayPrograms;

import java.util.Arrays;

public class ShiftZeroes {
	public static void main(String[] args) {
		int[] a= {1,2,3,0,3,0,4,3,2,1,0};//{0,0,0,1,2,3,3,4,3,2,1}
		int[] arr=new int[a.length];//[0,0.........2,1]
		int last=a.length-1;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]!=0) {
				arr[last--]=a[i];
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
