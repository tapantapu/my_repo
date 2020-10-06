package stringtest;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar_3 {

	public static void main(String[] args) {

		System.out.println("First Non repearting Character : " + getgetFirstNonRepeatedChar("qapvbvqqq"));

	}

	public static char getgetFirstNonRepeatedChar(String s) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();// insertion order preserved
		for (char ch : s.toCharArray()) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}

		System.out.println(map);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return '0';

	}

}
