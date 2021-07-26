package 揭尹.三刷算法题.No28_对称的二叉树;

import 揭尹.再刷剑指offer.structure.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return  isSymmetric(root,root);
    }

    private boolean isSymmetric(TreeNode A, TreeNode B) {
        if(A==null&&B==null)
            return true;
        if(A==null||B==null)
            return false;
        if(A.val!=B.val)
            return false;
        return isSymmetric(A.left,B.right)&&isSymmetric(A.right,B.left);
    }
}
