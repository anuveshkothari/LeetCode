package april_30Day_leet_coding_challenge;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {

	public static void main(String[] args) {

		int nums[] = { 2, 2, 1 ,1,4 };

		SingleNumber obj = new SingleNumber();
		System.out.println(obj.singleNumber(nums));

	}

	public int singleNumber(int[] nums) {

		int value = 0;

		for (int temp : nums) {
			value ^= temp;
		}

		return value;
	}

}