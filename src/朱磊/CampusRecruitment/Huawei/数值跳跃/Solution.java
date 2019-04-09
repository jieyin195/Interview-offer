package 朱磊.CampusRecruitment.Huawei.数值跳跃;

import java.util.Scanner;

/**
 * @Author: zl
 * @Date: 2019/3/30 10:11
 * @Description: 给出一组正整数，你从第一个数向最后一个数方向跳跃，每次至少跳跃1格，每个数的数值表示你从这个位置可以跳跃的最大长度。
 *              计算如何以最少的跳跃次数调到最后一个数。
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrIn = new int[n];
        for (int i = 0; i < arrIn.length; i++) {
            arrIn[i] = sc.nextInt();
        }
        int count = minJump(arrIn);
        System.out.println(count);
        sc.close();
    }

    private static int minJump(int[] arrIn) {
        // 分别对返回的最少跳跃次数、下一步科跳跃的最大值、角标的移动距离和下一步的具体位置进行初始化
        int count = 0, max = 0, temp = arrIn[0], nextIndex = 0;
        for ( int i = 1; i < arrIn.length; i++) {
            if(temp > arrIn.length) {    // 如果跳跃长度，大于数组长度，直接退出循环，跳跃次数+1
                count++;
                break;
            }
            if(arrIn[i] >= max){ // 保留一次跳跃后的最大值，并保存当前位置的坐标
                max = arrIn[i];
                nextIndex = i;
            }
            if(i == temp){   // 进行跳跃，再移回当前角标，跳跃次数+1
                temp += max;
                i = nextIndex;
                count++;
            }
        }
        return count;
    }
}
