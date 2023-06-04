
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	
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
		ListNode head = new ListNode(4);
		
		ListNode second = new ListNode(5);
		head.next = second;
		
		second.next = new ListNode(1);
		second.next.next = new ListNode(9);
		
		System.out.println(head);
		
		deleteNode(second);
		System.out.println(head);
	}
	
	public static void deleteNode(ListNode node) {
	    ListNode nextNode = node.next;
	    node.val = nextNode.val;
	    node.next = nextNode.next;
	    nextNode = null;
	}

}
