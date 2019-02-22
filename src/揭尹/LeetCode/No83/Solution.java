package 揭尹.LeetCode.No83;

/**
 * Created by Jline on 2019/2/22.
 * 删除排序链表中的重复元素
 */
public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null)
            return head;
        ListNode cur = head;
        while(cur.next!=null){
            if(cur.val==cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }

}
