package arrayPrograms;

import java.util.Arrays;

public class SumOfArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {4,5,6,4};//result={5,7,9,8,5}
		int noe=Math.max(a.length, b.length);
		int[] result=new int[noe];
		for(int i=0;i<result.length;i++) {
			if(i<a.length) {
				result[i]+=a[i];
			}
			if(i<b.length) {
				result[i]+=b[i];
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
