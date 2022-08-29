package hashmap;

import java.util.HashMap;

public class CountElements {
	//display the count of each element in an unsorted array
	
	//Using HashMap to solve it
	//<key=element,value=count of element>
	public static void displayFreqOfEachElement(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int x : arr) {
			if(!map.containsKey(x)) {
				map.put(x,1);
			} else {
				map.put(x,map.get(x)+1);
			}
		}
		map.forEach((key, value) -> System.out.println(key + " : " + value));
	}
	public static void main(String[] args) {
		displayFreqOfEachElement(new int[] 
				{1,4,1,2,2,3,1,3,6,1,1,5,4,4,1,6,2,5,2,5,2,5});

	}

}
