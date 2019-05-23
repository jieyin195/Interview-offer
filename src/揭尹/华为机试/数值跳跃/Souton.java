package 揭尹.华为机试.数值跳跃;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Jline on 2019/3/26.
 */
public class Souton {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        baoli(arr);
        //System.out.println();
    }

    /**
     * 递归
     * @param end
     * @param num
     * @return
     */
    public static int jump(int end, int[] num) {
        if (end == 0)
            return 0;
        int i = 0;
        while (num[i] < (end - i))
            i++;
        return 1+jump(i, num);
    }

    public static void baoli(int[] arr){
        int step=0;
        int out =0;
        int step_max=0;
        while(true){

            step++;
            for (int i = 0; i <= out; i++) {
                if(arr[i]+i>step_max)
                    step_max=arr[i]+i;
            }
            out=step_max;
            if(out+1>=arr.length)
                break;

        }
        System.out.println(step);
    }



}
