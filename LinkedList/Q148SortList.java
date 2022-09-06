package LinkedList;

public class Q148SortList {
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
	    public ListNode sortList(ListNode head) {
	        if(head == null || head.next == null) return head;
	        ListNode tail = head;
	        int len = 0;
	        while (tail != null) {
	            tail = tail.next;
	            len++;
	        }
	        ListNode dummy = new ListNode(Integer.MIN_VALUE);
	        dummy.next = head;
	        head = mergeSort(dummy, head, len);
	        return head;
	    }
	    
	    public ListNode mergeSort(ListNode preHead, ListNode head, int len) {
	        if(head == null || len <= 1) return head;
	        int left = len/2;
	        int right = len - left;
	        
	        //sorting left
	        head = mergeSort(preHead, head, left);
	        //sorting right
	        ListNode pMid = head;
	        for(int i = 0; i < left -1; i++){
	            pMid = pMid.next;
	        }
	        mergeSort(pMid, pMid.next, right);
	        
	        //merging
	        ListNode pre1 = preHead;
	        ListNode p1 = head;
	        ListNode pre2 = pMid;
	        ListNode p2 = pMid.next;
	        if(p1.val > p2.val) head = p2; //switch head
	        while(left > 0 && right > 0){
	            //merge second part to the first one
	            if(p1.val > p2.val){
	                //inserting p2 before p1
	                pre2.next = p2.next;
	                p2.next = p1;
	                pre1.next = p2;
	                pre1 = p2;
	                p2 = pre2.next;
	                right--;
	            } else { 
	            //set to next
	                pre1 = p1;
	                p1 = p1.next;
	                left--;
	            }
	        }
	    return head;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
