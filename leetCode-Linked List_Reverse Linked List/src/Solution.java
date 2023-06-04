class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public String toString() {
		String str = "" + this.val;
		ListNode temp = this;
		while (temp.next != null) {
			temp = temp.next;
			str += " -> " + temp.val;
		}
		return str;
	}
}

public class Solution {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2); head.next = second;
		ListNode third = new ListNode(3); second.next = third;
		third.next = new ListNode(4, new ListNode(5));
		ListNode reverse = reverseList(head);
		System.out.println(head);
		System.out.println(reverse);
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null) {
            return head;
        }
		ListNode tail = getTailListNode(head);
		ListNode reverse = new ListNode(tail.val);
		if (head == tail) {
			return reverse;
		}
		ListNode temp = reverse;
		while (head.next != null) {
			head = deleteTailListNode(head, tail);
			tail = getTailListNode(head);
			temp.next = new ListNode(tail.val);
			temp = temp.next;
		}
		head = null;
		return reverse;
	}

	public static ListNode getTailListNode(ListNode head) {
		ListNode tail = head;
		while (head != null && head.next != null) {
			tail = head.next;
			head = head.next;
		}
		return tail;
	}

	public static ListNode deleteTailListNode(ListNode head, ListNode tail) {
		ListNode newHead = new ListNode();
		ListNode temp = newHead;
		while (head != null && head != tail && head.next != null) {
			temp.val = head.val;
			if (head.next != tail) {
				temp.next = new ListNode();
				temp = temp.next;
			}
			head = head.next;
		}
		head = null;
		return newHead;
	}

}
