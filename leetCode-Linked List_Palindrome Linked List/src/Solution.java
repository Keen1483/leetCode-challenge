import java.util.ArrayList;
import java.util.List;

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
		List<Integer> vals = new ArrayList<>();
		
		ListNode currentNode = head;
		while (currentNode != null) {
			vals.add(currentNode.val);
			currentNode = currentNode.next;
		}
		
		int front = 0;
		int back = vals.size() - 1;
		while (front < back) {
			if (!vals.get(front).equals(vals.get(back))) {
				return false;
			}
			front++;
			back--;
		}
		return true;
	}

}
