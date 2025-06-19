class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return head.next;
        int l = 0;ListNode temp = head;
        while(temp != null){
            l++;temp = temp.next;
        }
        int mid = 0;
        if(l%2==0) mid = l/2;
        else mid = (l-1)/2;
        ListNode prev = null,curr = head;
        for(int i=0;i<mid;i++){
            prev = curr;
            curr = curr.next;
        }
        if(prev != null) prev.next = curr.next;
        return head;
    }
}