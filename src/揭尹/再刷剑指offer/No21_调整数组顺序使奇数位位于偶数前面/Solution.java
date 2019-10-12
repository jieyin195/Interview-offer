package 揭尹.再刷剑指offer.No21_调整数组顺序使奇数位位于偶数前面;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/13
 * \* Time: 16:54
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public static void reOrderArray(int [] arr) {
        if(arr==null||arr.length==1)
            return ;
        int left=0;int right=arr.length-1;
        while(left<right){
            while(left<right&&!Even(arr[left]))
                left++;
            while(left<right&&Even(arr[right]))
                right--;
            if(left<right){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }

    }

    private static boolean Even( int n ) {
        return (n&1)==0;
    }
    public static void main(String[] args){
        int[] data = {1,2,3,4,5,7,7};
        reOrderArray(data);
        for(int i=0;i<data.length;i++) {
            System.out.print(data[i]);
            System.out.print('\t');
        }
        System.out.println();
    }
}
