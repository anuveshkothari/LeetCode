package april_30Day_leet_coding_challenge;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MinStack {

	ArrayList<Integer> stack;
	int pointer;

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(2);
		minStack.push(0);
		minStack.push(3);
		minStack.push(0);
		minStack.getMin();// --> Returns -3.
		minStack.pop();
		minStack.getMin();// --> Returns -3.
		minStack.pop();
		minStack.getMin();// --> Returns -3.
		minStack.pop();
		minStack.getMin();// --> Returns -3.

	}

	public MinStack() {
		stack = new ArrayList();
		pointer = -1;
	}

	public void push(int x) {

		stack.add(x);
		// System.out.println(stack.toString());
		pointer++;

	}

	public void pop() {

		// System.out.println(pointer + ", " + stack.size());
		// System.out.println();
		stack.remove(pointer);
		pointer--;

	}

	public int top() {

		// System.out.println(stack.get(pointer));
		return stack.get(pointer);
	}

	public int getMin() {

		// System.out.println(stack.toString());

		int minimum = Integer.MAX_VALUE;

		for (int temp : stack) {
			if (temp < minimum)
				minimum = temp;
		}
		// System.out.println(minimum);
		return minimum;
	}
}
