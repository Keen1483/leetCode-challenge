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
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode list = mergeTwoLists(list1, list2);
		System.out.println(list);
	}
	
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	if (list1 == null) {
    		return list2;
    	}
    	if (list2 == null) {
    		return list1;
    	}
        ListNode temp, current, tail, before, newHead;
        while (list1 != null) {
        	current = list1;
        	temp = list2;
        	tail = getTailListNode(list2);
        	if (current.val <= temp.val) {
        		newHead = new ListNode(current.val, temp);
        		list2 = newHead;
        	} else if (current.val >= tail.val) {
        		while (temp.next != null) {
        			temp = temp.next;
        		}
        		temp.next = new ListNode(current.val);
        	} else {
        		before = new ListNode();
        		while (current.val >= temp.val && temp.next != null) {
        			before = temp;
        			temp = temp.next;
        		}
        		if (current.val < temp.val) {
        			before.next = new ListNode(current.val, temp);
        		}
        	}
        	list1 = list1.next;
        }
        return list2;
    }
    
    public static ListNode getTailListNode(ListNode head) {
		ListNode tail = head;
		while (head != null && head.next != null) {
			tail = head.next;
			head = head.next;
		}
		return tail;
	}

}
