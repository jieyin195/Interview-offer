package 朱磊.DataStructure.二叉树的遍历;

/**
 * @Author: zl
 * @Date: 2019/4/7 22:56
 * @Description: 定义二叉树的成员变量及构造方法
 *              BST 不需要使用到height成员
 *              AVL 需要使用到height来维护平衡
 */
public class TreeNode<E> {
    public E e;
    public TreeNode left;
    public TreeNode right;
    public int height;

    public TreeNode(E e) {
        this.e = e;
        left = null;
        right = null;
        height = 1;
    }
}
