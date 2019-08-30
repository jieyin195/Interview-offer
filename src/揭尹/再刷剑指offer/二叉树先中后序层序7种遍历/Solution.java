package 揭尹.再刷剑指offer.二叉树先中后序层序7种遍历;

import 揭尹.再刷剑指offer.structure.TreeNode;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/6
 * \* Time: 14:02
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    //前序遍历递归版
    public static List<Integer>  preorderRecursively( TreeNode node ){
        List<Integer> list = new ArrayList<>();
        if(node==null)
            return list;
        list.add(node.val);
        list.addAll(preorderRecursively(node.left));
        list.addAll(preorderRecursively(node.right));
        return list;
    }
    //中序遍历递归版
    public static List<Integer> inorderRecursively(TreeNode node){
        List<Integer> list = new ArrayList<>();
        if(node==null)
            return list;
        list.addAll(inorderRecursively(node.left));
        list.add(node.val);
        list.addAll(inorderRecursively(node.right));
        return list;
    }
    //后序遍历递归版
    public static List<Integer> postorderRecursively(TreeNode node){
        List<Integer> list = new ArrayList<>();
        if(node==null)
            return list;
        list.addAll(postorderRecursively(node.left));
        list.addAll(postorderRecursively(node.right));
        list.add(node.val);
        return list;
    }
    //前序遍历非递归版
    public static List<Integer> preorderIteratively(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = node;
        List<Integer> list = new ArrayList<>();
        while(cur!=null || !stack.isEmpty()){
            if(cur!=null){
                list.add(cur.val);
                stack.push(cur);
                cur=cur.left;
            }else{
                cur=stack.pop().right;
            }
        }
        return list;
    }
    //中序遍历非递归版
    public static List<Integer> inorderIteratively(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = node;
        List<Integer> list = new ArrayList<>();
        while(cur!=null || !stack.isEmpty()){
            if(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }else{
                list.add(stack.peek().val);
                cur=stack.pop().right;
            }
        }
        return list;
    }
    //后序遍历非递归版本
    public static List<Integer> postorderIteratively(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = node;
        TreeNode preVisted = null;
        List<Integer> list = new ArrayList<>();
        while(cur!=null || !stack.isEmpty()){
            if(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }else{
                cur=stack.peek().right;
                if(cur!=null && cur!=preVisted){
                    stack.push(cur);
                    cur=cur.left;
                }else{
                    preVisted=stack.pop();
                    list.add(preVisted.val);
                    cur=null;
                }
            }
        }
        return list;
    }
    //层序遍历
    public static List<Integer> levelorder(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode cur = null;
        List<Integer> list = new ArrayList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            cur=queue.poll();
            list.add(cur.val);
            if(cur.left!=null)
                queue.offer(cur.left);
            if(cur.right!=null)
                queue.offer(cur.right);
        }
        return list;
    }
    public static void main(String[] args){
        //            1
        //              \
        //               2
        //              /
        //             3
        //pre->123  in->132   post->321  level->123
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> list_preorderRecursively = preorderRecursively(root);
        System.out.print("preorderRecursively: "+'\t');
        System.out.println(list_preorderRecursively.toString());

        List<Integer> list_inorderRecursively = inorderRecursively(root);
        System.out.print("inorderRecursively: "+'\t');
        System.out.println(list_inorderRecursively.toString());

        List<Integer> list_postorderRecursively = postorderRecursively(root);
        System.out.print("postorderRecursively: "+'\t');
        System.out.println(list_postorderRecursively.toString());
        System.out.println();


        List<Integer> list_preorderIteratively = preorderIteratively(root);
        System.out.print("preorderIteratively: "+'\t');
        System.out.println(list_preorderIteratively.toString());

        List<Integer> list_inorderIteratively = inorderIteratively(root);
        System.out.print("inorderIteratively: "+'\t');
        System.out.println(list_inorderIteratively.toString());

        List<Integer> list_postorderIteratively = postorderIteratively(root);
        System.out.print("postorderIteratively: "+'\t');
        System.out.println(list_postorderIteratively.toString());
        System.out.println();

        List<Integer> list_levelorder = levelorder(root);
        System.out.print("levelorder: "+'\t');
        System.out.println(list_levelorder.toString());
    }
}
