package april_30Day_leet_coding_challenge;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();

		// int nums[] = { 7, 1, 5, 3, 6, 4 };
		// int nums[] = { 1, 2, 3, 4, 5 };
		int nums[] = { 7, 6, 4, 3, 1 };
		// int nums[] = { 7, 1, 5, 3, 6, 4 };

		System.out.println(obj.maxProfit(nums));

	}

	public int maxProfit(int[] prices) {

		int maxSum = 0, tempSum = 0;
		boolean buySellFlag = true;

		for (int i = 0; i < prices.length; i++) {

			// temp storing the value

			// we have to buy a stock
			if (buySellFlag == true) {
				// System.out.println("1---i = " + i + ", buySellFlag = " + buySellFlag + ",
				// maxSum = " + maxSum);
				while (i < (prices.length - 1) && prices[i] > prices[i + 1])
					i++;

				tempSum -= prices[i];
				buySellFlag = false;
				// System.out.println("2---i = " + i + ", buySellFlag = " + buySellFlag + ",
				// maxSum = " + maxSum);
			}
			// we have to sell a stock
			else {
				while (i < (prices.length - 1) && prices[i + 1] > prices[i])
					i++;

				tempSum += prices[i];
				buySellFlag = true;
				// System.out.println("3---i = " + i + ", buySellFlag = " + buySellFlag + ",
				// maxSum = " + maxSum);
				maxSum = Math.max(maxSum, tempSum);

			}

			// System.out.println("4---i = " + i + ", buySellFlag = " + buySellFlag + ",
			// maxSum = " + maxSum);
		}

		if (buySellFlag == false && maxSum == 0)
			return 0;
		else
			return maxSum;
	}
}
