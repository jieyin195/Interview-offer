package LeetCode.No21;

/**
 * @Author: zl
 * @Date: 2019/3/4 16:27
 * @Description:
 */
public class MergeTwoList {

    public static void main(String[] args) {

    }

    public static ListNode unRecursionSolution(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)    return null;
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null && l2 != null){
            if(l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        // 当其中一条链表为空时，让新链表的下一个节点指向另一条不为空的链表
        if(l1 == null)  cur.next = l2;
        if(l2 == null)  cur.next = l1;
        return dummyHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
