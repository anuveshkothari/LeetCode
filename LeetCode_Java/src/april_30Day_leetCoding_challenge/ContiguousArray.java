package april_30Day_leetCoding_challenge;

import java.util.*;

public class ContiguousArray {

	public static void main(String[] args) {

		ContiguousArray obj = new ContiguousArray();
		int arr[] = { 0, 0, 1, 0, 0, 0, 1, 1 };

		System.out.println(obj.findMaxLength(arr));

	}

	// using hashmap
	public int findMaxLength(int[] nums) {

		// storing the max length
		int max_length = 0;

		// storing the counts and indexes ---counts = keys, values = indexes
		Map<Integer, Integer> hmap = new HashMap();

		// increment if 1 encountered and -1 if 0 encountered
		int counter = 0;

		// initial stage
		hmap.put(0, -1);

		// loop through the array
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				counter -= 1;
			else
				counter += 1;

			if (hmap.containsKey(counter)) {
				// max_length will be the difference between current index and the last index
				// between which number of zeros are same
				max_length = Math.max(max_length, i - hmap.get(counter));
			} else
				hmap.put(counter, i);
		}

		return max_length;
	}

	// brute force approach
	public int findMaxLength_1(int[] nums) {

		int answer = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			int numOfZeros = 0;
			int numOfOnes = 0;
			for (int j = i; j < nums.length; j++) {

				if (nums[j] == 0)
					numOfZeros++;
				else if (nums[j] == 1)
					numOfOnes++;

				if (numOfZeros == numOfOnes) {

					answer = Math.max(answer, j - i + 1);
				}
			}
			System.out.println(answer);
		}

		return answer;
	}
}
