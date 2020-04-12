package april_30Day_leet_coding_challenge;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		MiddleOfLinkedList obj = new MiddleOfLinkedList();

	}

	public ListNode middleNode(ListNode head) {

		ListNode pointer = head;
		int counter = 1;

		while (pointer.next != null) {
			counter++;
			pointer = pointer.next;
		}

		counter = counter / 2;

		for (int i = 0; i < counter; i++)
			head = head.next;

		return head;

	}

}
