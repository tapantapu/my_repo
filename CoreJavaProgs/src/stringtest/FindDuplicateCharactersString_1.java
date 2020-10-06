package stringtest;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersString_1 {

	public static void main(String[] args) {

		String s = "asdwswaadhdhsbhsberd";

		// System.out.println( s.contains("a"));

		char c[] = s.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : c) {
			if (map.containsKey(ch))
				map.put(ch,map.get(ch) + 1);
			else
				map.put(ch, 1);
		}
		
		System.out.println(map);
		
		for (Map.Entry entry : map.entrySet()) {

			System.out.print(entry.getKey() + "" + entry.getValue());

		}

	}

}
