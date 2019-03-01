package LeetCode.No82;

/**
 * @Author: zl
 * @Date: 2019/2/28 20:35
 * @Description:
 */
public class DeleteRepetitionNode {

    public ListNode unRecursionSolution(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode dummyHead = new ListNode(0);   // 建立一个虚拟节点
        dummyHead.next = head;  // 让头节点指向虚拟节点的下一个节点（在原本的链表的头节点前放置一个虚拟节点，便于使用）
        ListNode pre = dummyHead;   // 前驱节点的引用
        ListNode cur = dummyHead.next;  // 当前节点的引用
        boolean isDelete = false;   // 标识位，用来判断是否需要被删除。true表示需要

        while (cur.next != null){
            if(cur.val == cur.next.val){    // 如果找到相同值的两个节点，则删除后面出现的重复元素节点，并更新标识位
                cur.next = cur.next.next;
                isDelete = true;
            }
            else {
                if(isDelete == true){   // 否则判断是否出现过删除节点操作，如果出现的话，则再删除当前节点
                    pre.next = cur.next;
                    cur = pre.next;     // 维护cur节点的指向
                    isDelete = false;
                }
                else {  // 否则进行节点维护。分别让pre和cur节点指向下一个节点
                    pre = cur;
                    cur = cur.next;
                }
            }
        }
        // 用于最后一次对出现重复节点的维护
        if(isDelete == true)
            pre.next = cur.next;

        return dummyHead.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
