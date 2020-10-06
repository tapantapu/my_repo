package collectiontest;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapShortValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> m = new HashMap<String, Integer>();

		m.put("Kumar", 5);
		m.put("Tapan", 10);
		m.put("Parida", 20);
		m.put("abc", 7);
		m.put("def", 9);

		System.out.println("Before Sorting = "+m);
		Map<String, Integer> print = shortedMap(m);
		System.out.println("After Sorting");
		for(Map.Entry<String, Integer> sortMap: print.entrySet()) {
		
			System.out.println("Key = "+sortMap.getKey() + " , Value = "+sortMap.getValue());
		}

	}

	private static Map<String, Integer> shortedMap(Map<String, Integer> m) {

		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(m.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());

			}

		});
		
		
		HashMap<String, Integer> tempMap=new LinkedHashMap<String,Integer>();
		
		for(Map.Entry<String, Integer> m1: list) {
			tempMap.put(m1.getKey(), m1.getValue());
		}

		return tempMap;
	}

}
