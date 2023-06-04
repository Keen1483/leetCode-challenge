package leetCodePalindrome;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
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
		ListNode head = new ListNode(11);
		
		ListNode second = new ListNode(17);
		head.next = second;
		
		ListNode third = new ListNode(2);
		second.next = third;
		
		ListNode fourth = new ListNode(2);
		third.next = fourth;
		
		ListNode fith = new ListNode(17);
		fourth.next = fith;
		
		ListNode sixth = new ListNode(11);
		fith.next = sixth;
		
		boolean palind = isPalindrome(head);
		System.out.println(palind);

	}
	
	public static boolean isPalindrome(ListNode head) {
		ListNode tail = getTailListNode(head);
		
		if (head.val != tail.val) {
			return false;
		}
		if (head == tail) {
			return true;
		}
		if (head.next == tail && head.val == tail.val) {
			return true;
		}
		if (head.next == tail && head.val != tail.val) {
			return false;
		}
		if (head.val == tail.val) {
			return isPalindrome(deleteTailListNode(head, tail).next);
		}
		return false;
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
