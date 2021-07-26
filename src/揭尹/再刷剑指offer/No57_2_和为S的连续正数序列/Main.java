package 揭尹.再刷剑指offer.No57_2_和为S的连续正数序列;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] arr = findContinuousSequence(2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]);
        }
    }

    // [left,right]，取right版本
    public static int[][] findContinuousSequence(int target) {
        List<int[]> res = new LinkedList<>();

        // left初值必须为1，不能为0，否则有[0,1,2,3..]的非法答案
        int left = 1;
        // 区别1：right初值为0，不是 不取right版本中 的1，也不是2。
        //        因为代码中，单纯是通过 sum +=right来增加right，所以必须保证right经过1
        //        而取right的代码中，是先right++,sum +=right , 因此right初值只能为0

        int right = 0;
        // 其实还有一种处理办法：right初值=2,sum=left+right=3,先赋值一次。
        // 但是right初值为0，在不取right的版本中也合法，因此推荐这种处理

        int sum = 0;

        while (left <= target / 2) {
            if (sum < target) {
                // 区别2:先增大right,再加上right
                right++;
                sum += right;
            } else if (sum > target) {
                sum -= left;
                left++;
            } else {
                //区别3:长度处理
                int[] cur = new int[right - left + 1];
                for (int i = left; i <= right; i++) {
                    cur[i - left] = i;
                }
                res.add(cur);
                // 当前已符合条件，left++往前推
                sum -= left;
                left++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
