package 揭尹.三刷算法题.No8_二叉树的下一个节点;

public class Solution {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null)
            return null;
        //非叶子节点
        if(pNode.right!=null){
            pNode=pNode.right;
            while(pNode.left!=null){
                pNode = pNode.left;
            }
            return pNode;
        }
        //叶子节点
        while(pNode.next!=null){
            if(pNode==pNode.next.left){
                return pNode.next;
            }
            pNode = pNode.next;
        }
        return null;
    }
}
