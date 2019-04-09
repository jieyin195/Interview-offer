package 朱磊.DataStructure.二叉树的遍历;


/**
 * @Author: zl
 * @Date: 2019/4/8 9:42
 * @Description: 测试类
 */
public class Test {

    public static void main(String[] args) {

        // 按顺序输入二分查找树，最终退化为一个链表
        BST<Integer> bsTree = new BST<>();
        for (int i = 1; i <= 7; i++) {
            bsTree.add(i);
        }
        bsTree.preOrder();

        System.out.println();
        System.out.println("------------------------");

        AVL<Integer> avlTree = new AVL<>();
        for (int i = 1; i <= 7; i++) {
            avlTree.add(i);
        }
        avlTree.preOrder();
        System.out.println();
        avlTree.inOrder();
        System.out.println();
        avlTree.postOrder();
    }
}
