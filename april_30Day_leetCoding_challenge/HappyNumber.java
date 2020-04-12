package april_30Day_leet_coding_challenge;

import java.util.HashMap;
import java.util.Map;

public class HappyNumber {

	public static void main(String[] args) {

		HappyNumber obj = new HappyNumber();

		int n = 19;
		System.out.println(obj.isHappy(n));
	}

	public boolean isHappy(int n) {

		boolean isHappy = false;

		Map<Integer, Integer> hmap = new HashMap();
		while (n != 1) {
			n = squareAndAdd(n);

			if (!hmap.containsKey(n))
				hmap.put(n, 1);
			else
				break;

		}
		if (n == 1)
			return true;
		else
			return false;
	}

	public int squareAndAdd(int n) {

		int value = 0;
		while (n > 0) {
			int temp = n % 10;
			n /= 10;

			value += (temp * temp);
		}
		return value;

	}

}
