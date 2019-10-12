package 揭尹.再刷剑指offer.No32_2_分行从上到下打印二叉树;

import 揭尹.再刷剑指offer.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/14
 * \* Time: 22:03
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    static void printTreeInLine( TreeNode root ){
        if(root==null)
            return;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        int nextPoint=0;
        int toBepoint=1;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.val);
            if(node.left!=null) {
                queue.offer(node.left);
                nextPoint++;
            }
            if(node.right!=null) {
                queue.offer(node.right);
                nextPoint++;
            }
            toBepoint--;
            if(toBepoint==0){
                System.out.println();
                toBepoint=nextPoint;
                nextPoint=0;
            }
        }
    }
    public static void main(String[] args){
        //            1
        //          /   \
        //         2     3
        //       /  \   / \
        //      4    5 6   7
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        printTreeInLine(root);
    }
}
