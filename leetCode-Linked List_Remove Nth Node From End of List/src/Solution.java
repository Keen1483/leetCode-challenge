class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     
     public int size() {
    	 ListNode temp = this;
    	 int sz = 0;
		 while (temp != null) {
			 sz++;
			 temp = temp.next;
		 }
		 return sz;
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
		ListNode second = new ListNode(2);
		head.next = second;
		/*
		second.next = new ListNode(3);
		second.next.next = new ListNode(4, new ListNode(5));
		*/
		System.out.println(head);
		System.out.println(sizeNode(head));
		
		head = removeNthFromEnd(head, 2);
		
		System.out.println(head);
		System.out.println(sizeNode(head));
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		int m = sizeNode(head) - n;
		ListNode temp = head;
		int i = 0;
		while (i < m && temp != null) {
			i++;
			if (i < m) {
				temp = temp.next;
			}
		}
		if (i == m && m != 0) {
			ListNode deleteNode = temp.next;
			temp.next = deleteNode.next;
			deleteNode = null;
		} else if (i == m && m == 0) {
			head = temp.next;
			temp = null;
		}
        return head;
    }
	
	public static int sizeNode(ListNode node) {
		ListNode temp = node;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

}
