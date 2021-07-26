package 揭尹.三刷算法题.No24_反转链表;

import 揭尹.再刷剑指offer.structure.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode pre = null;
        ListNode reverNode = null;
        while(node!=null){
            ListNode Next = node.next;
            if(Next==null){
                reverNode = node;
            }
            node.next=pre;
            pre=node;
            node=Next;
        }
        return reverNode;
    }
}
