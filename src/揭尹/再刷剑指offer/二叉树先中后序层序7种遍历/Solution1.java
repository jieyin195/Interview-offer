package 揭尹.再刷剑指offer.二叉树先中后序层序7种遍历;

import 揭尹.再刷剑指offer.structure.TreeNode;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/23
 * \* Time: 19:28
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution1 {

    //非递归前序
    public static ArrayList<Integer> preOrder( TreeNode root ){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur =root;
        while(!stack.isEmpty()||cur!=null){
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
    //非递归中序
    public static ArrayList<Integer> inOrder( TreeNode root ){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur =root;
        while(!stack.isEmpty()||cur!=null){
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

    //非递归中序
    public static ArrayList<Integer> postOrder( TreeNode root ){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur =root;
        TreeNode preVisted = null;
        while(!stack.isEmpty()||cur!=null){
            if(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }else{
                cur = stack.peek().right;
                if(cur!=null&&preVisted!=cur){
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

    public static void main( String[] args ) {

    }
}
