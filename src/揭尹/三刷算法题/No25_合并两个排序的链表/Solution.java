package 揭尹.三刷算法题.No25_合并两个排序的链表;

import 揭尹.再刷剑指offer.structure.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode mergeList;
        if(l1.val<=l2.val){
            mergeList=l1;
            mergeList.next=mergeTwoLists(l1.next,l2);
        }else {
            mergeList=l2;
            mergeList.next=mergeTwoLists(l1,l2.next);
        }
        return mergeList;
    }
}
