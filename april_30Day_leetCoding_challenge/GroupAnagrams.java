package april_30Day_leet_coding_challenge;

import java.io.*;
import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) throws IOException {

		String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

		GroupAnagrams obj = new GroupAnagrams();

		System.out.println(obj.groupAnagrams(str));

	}

	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> anagramsList = new ArrayList<List<String>>();

		Map<String, ArrayList<String>> hmap = new HashMap();

		for (String str : strs) {
			char[] arr = new char[26];

			for (int i = 0; i < str.length(); i++)
				arr[str.charAt(i) - 'a']++;

			String tempStr = new String(arr);

			if (hmap.containsKey(tempStr)) {
				hmap.get(tempStr).add(str);
			} else {
				ArrayList<String> addToExistingAnagram = new ArrayList();
				addToExistingAnagram.add(str);
				hmap.put(tempStr, addToExistingAnagram);
			}
			// System.out.println(hmap.toString());
		}
		anagramsList.addAll(hmap.values());

		return anagramsList;
	}
}
