package 揭尹.剑指offer.二叉树_从上往下打印二叉树;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/18
 * \* Time: 22:43
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \  从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode( int val ) {
            this.val = val;

        }
    }

    public ArrayList<Integer> PrintFromTopToBottom( TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if(root==null)
            return list;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.remove(0);
            if(tmp.left!=null){
                queue.add(tmp.left);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
            }
            list.add(tmp.val);
        }
        return list;
    }

}
