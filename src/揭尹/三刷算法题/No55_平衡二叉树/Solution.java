package 揭尹.三刷算法题.No55_平衡二叉树;

import 揭尹.再刷剑指offer.structure.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return recur(root)!=-1;
    }

    private int recur(TreeNode root) {
        if(root==null)
            return 0;
        int left = recur(root.left);
        if(left==-1)
            return -1;
        int right = recur(root.right);
        if(right==-1)
            return -1;
        return Math.abs(left-right)<2?Math.max(left,right)+1:-1;
    }
}
