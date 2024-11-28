package arrayPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PrintDuplicatedPositions {
	public static void main(String[] args) {
		int[] a= {1,2,3,1,2,3,3,4};//1-3,2-4, 3-5,6
		LinkedHashMap<Integer, ArrayList<Integer>> map=new LinkedHashMap();
		//iterate over the array
		for (int i = 0; i < a.length; i++) {
			//checking if element is present or not
			if(map.containsKey(a[i])) {
				map.get(a[i]).add(i);
			}else {
				map.put(a[i], new ArrayList<Integer>());
			}
		}
		
		for(Map.Entry<Integer, ArrayList<Integer>> hash:map.entrySet()) {
			if(!hash.getValue().isEmpty()) {
				System.out.println(hash.getKey()+"-"+hash.getValue());
			}
		}
	}
}
