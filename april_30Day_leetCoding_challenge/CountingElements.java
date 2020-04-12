package april_30Day_leet_coding_challenge;

import java.io.*;
import java.util.*;

public class CountingElements {

	public static void main(String[] args) {

		// int arr[] = { 1, 3, 2, 3, 5, 0 };
		// int arr[] = { 1, 1, 2, 2 };
		int arr[] = { 1, 2, 3 };
		CountingElements obj = new CountingElements();

		System.out.println(obj.countElements(arr));
	}

	public int countElements(int[] arr) {

		int countValues[] = new int[1001];

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			countValues[arr[i]]++;
		}

		for (int i = 1; i < countValues.length; i++) {
			if (countValues[i] != 0)
				count += countValues[i - 1];
		}

		return count;
	}
}
