package collectiontest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set s = new HashSet();

		s.add("Tapan");
		s.add("Kumar");
		s.add("Parida");
		s.add("Tapan");
		s.add(12);

		System.out.println(s);

		Map m = new HashMap();

		m.put("Tapan", 10);
		m.put("Kumar", 5);
		m.put("Parida", 20);
		m.put(10, 20);
		m.put(null, 12);
		m.put(null, 10);

		System.out.println(m);

		Map hm = new Hashtable();
		hm.put(10, 12);
		// hm.put(null, 10);
		System.out.println(hm);

	}

}
