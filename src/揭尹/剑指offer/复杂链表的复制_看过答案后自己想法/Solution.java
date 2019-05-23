package 揭尹.剑指offer.复杂链表的复制_看过答案后自己想法;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/21
 * \* Time: 10:51
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public  class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    /*
    1.把原始链表中的结点都复制一份，原始结点.next=复制结点，这样循环
    2.把random结点继续复制
     */
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null)
            return null;
        RandomListNode curNode = pHead;

        while(curNode!=null){
            RandomListNode cloneNode = new RandomListNode(curNode.label);
            cloneNode.next=curNode.next;
            curNode.next = cloneNode;
            curNode = cloneNode.next;
        }

        curNode = pHead;
        while(curNode!=null){
            curNode.next.random = curNode.random == null?null:curNode.random.next;
            curNode = curNode.next.next;
        }

        curNode=pHead;
        RandomListNode pCloneHead = pHead.next;
        while(curNode!=null){
            RandomListNode cloneNode = curNode.next;
            curNode.next=cloneNode.next;
            curNode=cloneNode.next;

            cloneNode.next=cloneNode.next==null?null:cloneNode.next.next;
        }
        return pCloneHead;
    }
}
