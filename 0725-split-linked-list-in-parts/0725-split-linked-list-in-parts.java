class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;int L = 0;
        while(temp!=null){
            L++;
            temp = temp.next;
        }
        int eachBucketNode = L/k, remainderNode = L%k;
        ListNode[] res = new ListNode[k];
        ListNode curr = head,prev=null;
        for(int i=0;curr!=null && i<k;i++){
            res[i] = curr;
            for(int count=1;count<=eachBucketNode+(remainderNode>0 ? 1:0);count++){
                prev = curr;
                curr = curr.next;
            }
            if(prev!=null) prev.next = null;
            remainderNode--;
        }
        return res;
    }
}