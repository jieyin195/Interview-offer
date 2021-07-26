package 揭尹.再刷剑指offer.No32_3_之字形打印二叉树;

import 揭尹.再刷剑指offer.structure.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/15
 * \* Time: 9:59
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public  static ArrayList<ArrayList<Integer>> Print( TreeNode root) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if(root==null)
            return lists;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root);

        while(!stack1.isEmpty()||!stack2.isEmpty()){
            ArrayList<Integer> list;
            if(!stack1.isEmpty()){
              list = new ArrayList<>();
                while(!stack1.isEmpty()) {
                    TreeNode node = stack1.pop();
                    list.add(node.val);
                    if (node.left != null)
                        stack2.push(node.left);
                    if (node.right != null)
                        stack2.push(node.right);
                }
                lists.add(list);
            }else if(!stack2.isEmpty()){
                list = new ArrayList<>();
                while(!stack2.isEmpty()){
                    TreeNode node = stack2.pop();
                    list.add(node.val);
                    if(node.right!=null)
                        stack1.push(node.right);
                    if(node.left!=null)
                        stack1.push(node.left);
                }
                lists.add(list);
            }
        }
        return lists;
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
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);
        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);
        System.out.println(Print(root));
    }
}
