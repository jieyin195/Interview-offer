package 朱磊.DataStructure.二叉树的遍历;

import java.util.ArrayList;

/**
 * @Author: zl
 * @Date: 2019/4/7 23:35
 * @Description: 二分搜索树
 */
public class BST <E extends Comparable<E>>{

    private TreeNode<E> root;
    private int size;

    // 初始化二分查找树
    public BST() {
        root = null;
        size = 0;
    }

    // 添加节点
    public void add(E e){
        root = add(root, e);
    }
    private TreeNode add(TreeNode<E> node, E e){
        if(node == null){
            size++;
            return new TreeNode<>(e);
        }

        if(e.compareTo(node.e) < 0)
            node.left = add(node.left, e);
        if(e.compareTo(node.e) > 0)
            node.right = add(node.right, e);

        return node;
    }

    // 前序遍历
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(TreeNode node){
        if(node == null)
            return;
        System.out.print(node.e + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // 中序遍历
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(TreeNode node){
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.e + " ");
        inOrder(node.right);
    }

    // 后序遍历
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(TreeNode node){
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.e + " ");
    }

    // 获取二叉树节点的个数
    public int getSize(){
        return size;
    }
}
