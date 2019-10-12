package 揭尹.再刷剑指offer.No34_二叉树中和为某一路径的值;

import 揭尹.再刷剑指offer.structure.TreeNode;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/15
 * \* Time: 16:59
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath( TreeNode root, int target) {
        if(root==null)
            return lists;
        list.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null)
             lists.add(new ArrayList<>(list));
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size()-1);
        return lists;
    }
}
