class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> ll = new ArrayList<>();ListNode temp = head;
        while(temp!=null){
            ll.add(temp.val);
            temp = temp.next;
        }
        int max = 0, n = ll.size();
        for(int i=0;i<n;i++){
            int x = ll.get(i)+ll.get(n-i-1);
            max = Math.max(x,max);
        }
        return max;
    }
}