package 揭尹.三刷算法题.No55_二叉树的深度;

import 揭尹.再刷剑指offer.structure.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
