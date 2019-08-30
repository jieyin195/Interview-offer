package 揭尹.剑指offer.二叉树的深度;

import java.util.LinkedList;
import java.util.Queue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/27
 * \* Time: 9:34
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
 *  最长路径的长度为树的深度。
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
    /*
    递归写法
     */
    public int TreeDepth1(TreeNode root) {
        if(root==null)
            return 0;
        int leftCount = TreeDepth1(root.left);
        int rightCount = TreeDepth1(root.right);
        return Math.max(leftCount,rightCount)+1;
    }
    /*
    非递归写法
     */
    public int TreeDepth2(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth=0,count=0,nextCount=1;//nextCount代表每层个结点数，比如第一层1个，第二层2个
        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            count++;
            if(treeNode.left!=null)
                queue.add(treeNode.left);
            if(treeNode.right!=null)
                queue.add(treeNode.right);
            if(count==nextCount){
                depth++;
                nextCount=queue.size();
                count=0;
            }
        }
        return depth;
    }
}
