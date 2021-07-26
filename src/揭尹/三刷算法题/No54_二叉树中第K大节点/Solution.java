package 揭尹.三刷算法题.No54_二叉树中第K大节点;

import 揭尹.再刷剑指offer.structure.TreeNode;

public class Solution {
    int count,res;
    public int kthLargest(TreeNode root, int k) {
        count=k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if(root==null)
            return;
        dfs(root.right);
        if(--count==0)
            res=root.val;
        dfs(root.left);
    }
}
