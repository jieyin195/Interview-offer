package 朱磊.CampusRecruitment.Tengxun.携带最少零钱;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zl
 * @Date: 2019/4/5 19:27
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int count = 0;

        if(sum(n, arr) > m)
            count = -1;

        for (int i = n - 1; i >= 0; i--) {
            while (m - arr[i] >= sum(i, arr)){
                m -= arr[i];
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }

    private static int sum(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }


}
