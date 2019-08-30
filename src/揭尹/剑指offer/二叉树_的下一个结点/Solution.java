package 揭尹.剑指offer.二叉树_的下一个结点;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/6/5
 * \* Time: 19:10
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode( int val ) {
            this.val = val;
        }
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null)
            return null;
        TreeLinkNode pNext = null;
        if(pNode.right!=null){
            TreeLinkNode right = pNode.right;
            while(right.left!=null){
                right = right.left;
            }
            pNext = right;
        }else if(pNode.next!=null){
            TreeLinkNode cur = pNode;
            TreeLinkNode parent = pNode.next;
            while(parent!=null && cur == parent.right){
                cur = parent;
                parent = parent.next;
            }
            pNext=parent;
        }
        return pNext;
    }
}
