class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while (a != null && b != null) {
				if (a.val < b.val) {
					Dummy.next = a;
					Dummy = Dummy.next;
					a = a.next;
				} else {
					Dummy.next = b;
					Dummy = Dummy.next;
					b = b.next;
				}
			}
			if (a != null) Dummy.next = a;
			if (b != null) Dummy.next = b;
			return temp.next;  
    }
}