package LeetCode.No141;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: zl
 * @Date: 2019/3/12 12:31
 * @Description: 给定一个链表，判断链表中是否有环。（判断一个链表是否包含环，可以转化为判断是否有一个节点之前已经出现过）
 */
public class CycleNode {

    public static void main(String[] args) {

    }

    // 用set集合来存储节点，当包含重复的节点，则表明包含环形链表（时间复杂度O（n））
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;

        Set<ListNode> set = new HashSet<>();
        while (head != null){
            if(set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }

        return false;
    }

    // 快慢指针
    /**
     *  借用两个指针，一个快指针和一个慢指针，快指针每次移动两个节点而慢指针则每次移动一个节点。
     *  如果链表中不存在环，则快指针会先于慢指针到达链表的尾部，两个指针永远也不可能“相遇”；
     *  相反，如果链表中存在环，则快指针一定会“追上”慢指针
     */
    public boolean twoListNode(ListNode head) {
        if(head == null || head.next == null)
            return false;

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
                return true;
        }

        return false;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
