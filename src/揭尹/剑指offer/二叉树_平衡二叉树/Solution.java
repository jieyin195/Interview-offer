package 揭尹.剑指offer.二叉树_平衡二叉树;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/27
 * \* Time: 11:00
 * \* To change this template use File | Settings | File Templates.
 * \* Description:输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * \
 */
public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 递归
     * @param root
     * @return
     */
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
            return true;
        return Math.abs(getMaxDepth(root.left)-getMaxDepth(root.right))<=1&&
                IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }
    private int getMaxDepth(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(getMaxDepth(root.left),getMaxDepth(root.right))+1;
    }

    /**
     * 非递归
     */
    public boolean IsBalanced_Solution1(TreeNode root) {
        return getDepth(root)!=-1;
    }

    private int getDepth( TreeNode root ) {
        if(root==null)
            return 0;
        int left = getDepth(root.left);
        if(left==-1)
            return -1;
        int right = getDepth(root.right);
        if(right==-1)
            return -1;
        return Math.abs(left-right)>1?-1:Math.max(left,right)+1;
    }

}
