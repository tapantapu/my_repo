package stringtest;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurredCharString {

	public static void main(String[] args) {

		String s = "abcdsgiahidwgwiegweig";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}

		int maxCharCount = 0;
		char maxChar = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCharCount) {
				maxCharCount = entry.getValue();
				maxChar = entry.getKey();
			}

		}
		System.out.println("Maximum Occurring char and its count  is -->" + maxChar + " : " + maxCharCount);
	}

}
