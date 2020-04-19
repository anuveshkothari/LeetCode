package april_30Day_leetCoding_challenge;

import java.util.Arrays;

public class LastStoneWeight {
	public static void main(String[] args) {

		int arr[] = { 2, 7, 4, 1, 8, 1 };
		LastStoneWeight obj = new LastStoneWeight();
		System.out.println(obj.lastStoneWeight(arr));
	}

	public int lastStoneWeight(int[] stones) {

		int remainingSum = 0;

		for (int stone : stones)
			remainingSum += stone;
//		System.out.println(remainingSum);

		if (stones.length < 2)
			return stones[0];

		for (int i = 0; i < stones.length; i++) {
			Arrays.sort(stones);

//			System.out.println(Arrays.toString(stones));
			remainingSum -= (2 * stones[stones.length - 2]);
			stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
			stones[stones.length - 2] = 0;

			// System.out.println(remainingSum);
		}

		return remainingSum;

	}
}
