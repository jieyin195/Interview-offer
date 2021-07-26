package 揭尹.三刷算法题.No6_从尾到头打印链表;

import 揭尹.再刷剑指offer.structure.ListNode;

public class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode cur = head;
        int count=0;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        cur =head;
        int[] arr =new int[count];
        for (int i = count-1; i>=0 ; i--) {
            arr[i]=cur.val;
            cur=cur.next;
        }
        return arr;
    }
}
