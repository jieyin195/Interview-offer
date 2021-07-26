package 揭尹.三刷算法题.No27_二叉树的镜像;

import 揭尹.再刷剑指offer.structure.TreeNode;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
