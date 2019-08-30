package 揭尹.剑指offer.链表_两个链表的公共结点;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/26
 * \* Time: 17:34
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ArrayList<ListNode> arrayList = new ArrayList<>();
        while(pHead1!=null){
            arrayList.add(pHead1);
            pHead1=pHead1.next;
        }
        while(pHead2!=null){
            if(arrayList.contains(pHead2))
                return pHead2;
            pHead2=pHead2.next;
        }
        return null;
    }
}
