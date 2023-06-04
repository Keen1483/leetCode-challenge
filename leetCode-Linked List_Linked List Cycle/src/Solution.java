import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
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
		sixth.next = head;
		
		System.out.println(hasCycle(head));
	}
	
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        boolean repeat = true;
        ListNode currentNode = head;
        while (currentNode != null) {
        	repeat = nodeSet.add(currentNode);
        	if (!repeat) {
        		return true;
        	}
        	currentNode = currentNode.next;
        }
        return false;
    }

}
