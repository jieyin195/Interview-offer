package 揭尹.再刷剑指offer.No6_从尾到头打印链表;

import java.util.ArrayList;
import java.util.Stack;

import 揭尹.再刷剑指offer.structure.*;
/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/6
 * \* Time: 12:51
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \    输入一个链表的头节点，从尾到头反过来打印出每个节点的值。
 *      由于递归会导致栈溢出，本题建议使用非递归方法。
 */
public class Solution {
    /**
     * 非递归，牛客网上的题目
     */
    public  ArrayList<Integer> printListFromTailToHead( ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode pHead = listNode;
        while(pHead!=null){
            stack.add((Integer) pHead.val);
            pHead=pHead.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;

    }
    /**
     * 递归
     */
    public  ArrayList<Integer> printListFromTailToHead2( ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if(listNode==null)
            return list;
        list.addAll(printListFromTailToHead2(listNode.next));
        list.add(listNode.val);
        return list;
    }

}
