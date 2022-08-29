package hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Membership {
	//find items present in first array, but not second array
	//solve this with HashSet
	
	public static List<Integer> findMissingElements(int[] first, int [] second){
		List<Integer> missingElements = new ArrayList<>();
		HashSet<Integer> hashSet = new HashSet<>();
		for(int x : second) {
			hashSet.add(x);
		}
		for(int x : first) {
			if(!hashSet.contains(x)) {
				missingElements.add(x);
			}
		}
		return missingElements;
	}
	
	public static void main(String[] args) {
		findMissingElements(new int[]{1,2,3,4,5}, new int[]{1,3,5,1})
			.forEach(System.out::println);
		System.out.println("~~~");
		findMissingElements(new int[]{10,0,3,2,7}, new int[]{9,3,5,7})
			.forEach(System.out::println);
	}

}
