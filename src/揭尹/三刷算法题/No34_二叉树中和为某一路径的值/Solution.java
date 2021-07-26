package 揭尹.三刷算法题.No34_二叉树中和为某一路径的值;

import 揭尹.再刷剑指offer.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root,target);
        return res;
    }

    private void dfs(TreeNode root, int target) {
        if(root==null)
            return;
        path.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(path));
        }
        dfs(root.left,target);
        dfs(root.right,target);
        path.removeLast();
    }
}
