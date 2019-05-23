package 揭尹.剑指offer.复杂链表的复制;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/20
 * \* Time: 18:02
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \ 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
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
     *解题思路：
     *1、遍历链表，复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
     *2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
     *3、拆分链表，将链表拆分为原链表和复制后的链表
     */
        public RandomListNode Clone(RandomListNode pHead)
        {
            CloneNodes(pHead);
            ConnectSiblingNodes(pHead);
            return ReconnectNodes(pHead);
        }
        private  void CloneNodes(RandomListNode head)
        {
            RandomListNode node = head;
            while (node != null)
            {
                RandomListNode cloned = new RandomListNode(node.label);
                cloned.next = node.next;
                cloned.random = null;

                node.next = cloned;
                node = cloned.next;
            }
        }
        private  void ConnectSiblingNodes(RandomListNode head)
        {
            RandomListNode node = head;
            while (node != null)
            {
                RandomListNode cloned = node.next;
                if (node.random != null)
                {
                    cloned.random = node.random.next;
                }
                node = cloned.next;
            }
        }

        private  RandomListNode ReconnectNodes(RandomListNode head)
        {
            RandomListNode node = head;
            RandomListNode clonedHead = null;
            RandomListNode clonedNode = null;

            if (node != null)
            {
                clonedHead = clonedNode = node.next;
                node.next = clonedNode.next;
                node = node.next;
            }

            while (node != null)
            {
                // 复制链表的连接
                clonedNode.next = node.next;
                clonedNode = clonedNode.next;
                // 原始链表的连接
                node.next = clonedNode.next;
                node = node.next;
            }

            return clonedHead;
        }
    }
