package 揭尹.再刷剑指offer.No32_1_从上到下打印二叉树;

import 揭尹.再刷剑指offer.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/14
 * \* Time: 21:33
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom( TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left!=null)
                queue.offer(node.left);
            if(node.right!=null)
                queue.offer(node.right);
        }
        return list;
    }
}
