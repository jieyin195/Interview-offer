package 揭尹.三刷算法题.No35_二叉搜索树与双向链表;
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}

public class Solution {
    Node pre,head;
    public Node treeToDoublyList(Node root) {
        if(root==null)
            return null;
        dfs(root);
        pre.left=head;
        head.right=pre;
        return head;
    }

    private void dfs(Node node) {
        if(node==null)
            return;
        dfs(node.left);
        if(pre!=null)
            pre.right=node;
        else
            head = node;
        node.left=pre;
        pre=node;
        dfs(node.right);
    }
}
