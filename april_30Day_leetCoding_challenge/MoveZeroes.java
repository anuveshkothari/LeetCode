package april_30Day_leet_coding_challenge;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		MoveZeroes obj = new MoveZeroes();

		int arr[] = { 0, 1, 0, 3, 12 };

		obj.moveZeroes(arr);
	}

	public void moveZeroes(int[] nums) {

		int start = 0;
		int end = nums.length;
		int pointer = 0;

		while (start < end) {
			if (nums[start] != 0) {
				nums[pointer++] = nums[start];
			}
			start++;
		}
		while (pointer < end) {
			nums[pointer++] = 0;
		}

		System.out.println(Arrays.toString(nums));
	}

	public void moveZeroes_2(int[] nums) {

		int len = nums.length;

		int pointer = 0;

		int formattedArray[] = new int[len];
		// index pointer to formatted array
		int index = 0;
		Arrays.fill(formattedArray, 0);

		while (pointer < len) {
			if (nums[pointer] != 0) {
				formattedArray[index++] = nums[pointer];
			}
			pointer++;
		}

		nums = formattedArray;
		System.out.println(Arrays.toString(formattedArray));

	}
}
