package LinkedList;

public class Q206ReverseLinkedList {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	    public static ListNode reverseList(ListNode head) {
	        ListNode current = head;
	        ListNode prev = null;
	        ListNode temp = null;
	        while(current != null){
	            temp = current.next;
	            current.next = prev;
	            prev = current;
	            current = temp;
	        }        
	        return prev;
	    }
	public static void main(String[] args) {

	}

}
