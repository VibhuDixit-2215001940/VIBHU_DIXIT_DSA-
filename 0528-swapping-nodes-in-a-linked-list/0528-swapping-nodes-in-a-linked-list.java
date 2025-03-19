class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;int l = 0;
        while(temp!=null){
            temp = temp.next;
            l++;
        }
        int k_1 = k;ListNode n1=head;
        for(int i=1;i<k_1;i++){
            n1  = n1.next;
        }
        int k_2 = l-k;ListNode n2=head;
        for(int i=0;i<k_2;i++){
            n2  = n2.next;
        }
        int x = n1.val;
        n1.val = n2.val;
        n2.val = x;
        return head;
    }
}