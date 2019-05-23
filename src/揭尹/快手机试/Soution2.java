package 揭尹.快手机试;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jline on 2019/3/30.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Soution2 {
    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.equals("None")) {
            System.out.println("False");
            System.exit(0);
        }
        String[] strArr = str.split(",");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(strArr[i]);
        }
        TreeNode root ;
        root =add(arr);
        inorderTraversal(root);
        for (int i = 0; i < arrayList.size()-1; i++) {
            if(arrayList.get(i)>arrayList.get(i+1)) {
                System.out.println("False");
                System.exit(0);
            }
        }
        System.out.println("True");

    }

    public static TreeNode add(int[] array)
    {
        List<TreeNode> nodeList=new LinkedList<TreeNode>();

        for(int nodeIndex=0;nodeIndex<array.length;nodeIndex++){
            nodeList.add(new TreeNode(array[nodeIndex]));
        }
        for(int parentIndex=0;parentIndex<=array.length/2-1;parentIndex++){
            nodeList.get(parentIndex).left =nodeList.get(parentIndex*2+1);
            //防止是非完全二叉树
            if((parentIndex*2+2)<array.length) {
                nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);
            }
        }

        return nodeList.get(0);
    }

    private static void inorderTraversal( TreeNode node ) {
        if( node == null)
            return;
        inorderTraversal(node.left);
        arrayList.add(node.val);
        inorderTraversal(node.right);
    }
}
