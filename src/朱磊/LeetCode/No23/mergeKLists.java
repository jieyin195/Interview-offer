package 朱磊.LeetCode.No23;

/**
 * @Author: zl
 * @Date: 2019/3/4 17:37
 * @Description:
 */
public class mergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        int k = lists.length;   // 一共有k条链表
        while (k > 1) {
            for (int i = 0; i < k / 2; i++)     // 1到（k + 1）/2，两两合并链表
                lists[i] = mergeTwoLists(lists[i], lists[i + (k + 1) / 2]);
            k = (k + 1) / 2;
        }
        return lists[0];
    }
    // 两条链表合并（No21）
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 == null) cur.next = l2;
        if (l2 == null) cur.next = l1;
        return dummyHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
