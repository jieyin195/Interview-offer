package 揭尹.再刷剑指offer.No25_合并两个排序的链表;

import 揭尹.再刷剑指offer.structure.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/14
 * \* Time: 15:49
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public ListNode Merge( ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode mergeList = null;
        if(list1.val<=list2.val){
            mergeList=list1;
            mergeList.next=Merge(list1.next,list2);
        }else{
            mergeList=list2;
            mergeList.next=Merge(list1,list2.next);
        }
        return mergeList;
    }
}
