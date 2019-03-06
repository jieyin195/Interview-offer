package JianzhiOffer.从尾到头打印链表;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * @Author: zl
 * @Date: 2019/3/6 19:01
 * @Description:输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class Solution {

    public static void main(String[] args) {

    }

    // 非递归逆序建立一个新链表，然后存放在list中
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode newHead = new ListNode(0);
        ListNode cur = newHead;
        while(listNode != null){
            ListNode dummy = listNode.next;
            listNode.next = cur.next;
            cur.next = listNode;
            listNode = dummy;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (cur.next != null){
            cur = cur.next;
            list.add(cur.val);
        }

        return list;
    }

    // 直接用Collections的reverse方法解决问题
    public ArrayList<Integer> ollectionsSolution(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = listNode;
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        Collections.reverse(list);
        return list;
    }

    // 利用栈的性质来处理
    public ArrayList<Integer> stackSolution(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty())
            list.add(stack.pop());
        return list;
    }

    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) { this.val = val; }
    }
}
