package 朱磊.DataStructure.二叉树的遍历;

/**
 * @Author: zl
 * @Date: 2019/4/8 14:28
 * @Description:
 */
public class AVL<E extends Comparable<E>> {

    private TreeNode<E> root;
    private int size;

    public AVL() {
        root = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }
    // 获取当前节点的高度
    private int getHeight(TreeNode<E> node){
        if(node == null)
            return 0;
        return node.height;
    }
    // 获取平衡因子，用于判断是否平衡
    private int getBalanceFactor(TreeNode<E> node){
        if(node == null)
            return 0;
        return getHeight(node.left) - getHeight(node.right);
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
        // 更新节点高度
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        // 获取平衡因子
        int balanceFactor = getBalanceFactor(node);
        // LL
        if(balanceFactor > 1 && getBalanceFactor(node.left) >= 0)
            return rightRotate(node);
        // RR
        if(balanceFactor < -1 && getBalanceFactor(node.right) <= 0)
            return leftRotate(node);
        // LR(对子节点左旋转，然后转化为LL的情况)
        if(balanceFactor > 1 && getBalanceFactor(node.left) < 0){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // RL(对子节点右旋转，然后转化为RR的情况)
        if(balanceFactor < -1 && getBalanceFactor(node.right) > 0){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }
    // 左旋转
    private TreeNode leftRotate(TreeNode<E> y) {
        // 建立引用
        TreeNode x = y.right;
        TreeNode T2 = x.left;

        // 开始旋转
        x.left = y;
        y.right = T2;

        // 维护高度(因为y为x的子节点，所以要首先维护y的节点高度)
        y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
        return x;
    }
    // 右旋转
    private TreeNode rightRotate(TreeNode<E> y) {
        // 建立引用
        TreeNode x = y.left;
        TreeNode T2 = x.right;

        // 开始旋转
        x.right = y;
        y.left = T2;

        // 维护高度(因为y为x的子节点，所以要首先维护y的节点高度)
        y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
        return x;
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

}
