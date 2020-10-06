package maptest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTestDataRetrive {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		map.put(4, "4");
		map.put(5, "5");
		map.put(6, "6");
		map.put(7, "7");
		
		System.out.println(map);

		// get all Keys from map
		Set<Integer> set = map.keySet();
		System.out.println(set);

		// get all values from map
		Collection<String> c = map.values();
		System.out.println(c);

		// get all key & Values from map
		Set newSet = map.entrySet();
		Iterator itr = newSet.iterator();

		while (itr.hasNext()) {
			Map.Entry me = (Map.Entry) itr.next();

			if (((Integer) me.getKey()).intValue() == 5) {
				me.setValue("10");
			}
			
			System.out.println(me.getKey() + " " + me.getValue());
		}
		
		for(Map.Entry entry :map.entrySet()) {
			System.out.println("Key : "+entry.getKey()+" Value :  "+entry.getValue());
		}
		
	}
}
