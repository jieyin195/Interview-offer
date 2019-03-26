package 朱磊.LeetCode.No4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * @Author: zl
 * @Date: 2019/3/3 14:52
 * @Description:
 */
public class FindMedian {

    public static void main(String[] args) {
        int[] nums1 = {2, 2};
        int[] nums2 = {2, 2};
        System.out.println(violenceSolution(nums1, nums2));
//        System.out.println(collectionSolution(nums1, nums2));
    }

    public static double violenceSolution(int[] nums1, int[] nums2) {
        // 用于标记两个数组元素总数是奇数还是偶数
        int flag = (nums1.length + nums2.length) % 2;
        // 数组1为空的情况
        if(nums1.length == 0){
            if(nums2.length == 1)   return nums2[0];
            if (flag == 0)
                return (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2.0;
            else
                return nums2[nums2.length / 2];
        }
        // 数组2为空的情况
        if(nums2.length == 0){
            if(nums1.length == 1)   return nums1[0];
            if (flag == 0)
                return (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2.0;
            else
                return nums1[nums1.length / 2];
        }
        // 两个数组长度均为1的情况
        if(nums1.length == 1 && nums2.length == 1)
            return (nums1[0] + nums2[0]) / 2.0;
        // 定义新数组的长度
        int[] nums = new int[nums1.length + nums2.length];
        // 两个参数数组的移动指针
        int x = 0, y = 0;
        for (int i = 0; i < nums.length; i++) {
            // 如果一边数组遍历完毕后，继续遍历另一个数组
            if(x < nums1.length && (y == nums2.length || nums1[x] < nums2[y])){
                nums[i] = nums1[x];
                x++;
            }
            else {
                nums[i] = nums2[y];
                y++;
            }
        }
        // 根据新数组的长度进行返回
        if(flag == 1)
            return nums[nums.length / 2];
        else
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
    }

    // set集合碰到重复数字会直接舍弃，暂不适用
//    public static double collectionSolution(int[] nums1, int[] nums2){
//        if(nums1.length == 1 && nums2.length == 1)
//            return (nums1[0] + nums2[0]) / 2.0;
//
//        int flag = (nums1.length + nums2.length) % 2;
//        TreeSet<Integer> set = new TreeSet<>();
//        LinkedList<Integer> list = new LinkedList<>();
//        for (int i: nums1) {
//            set.add(i);
//        }
//        for (int i: nums2) {
//            set.add(i);
//        }
//
//        Iterator i = set.iterator();
//        while (i.hasNext()){
//            list.add((Integer) i.next());
//        }
//
//        if(flag == 1){
//            int index = list.size() / 2;
//            return list.get(index);
//        }
//        else {
//            int index1 = list.size() / 2 ;
//            int index2 = list.size() / 2 - 1;
//            return (list.get(index1) + list.get(index2)) / 2.0;
//        }
//    }
}
