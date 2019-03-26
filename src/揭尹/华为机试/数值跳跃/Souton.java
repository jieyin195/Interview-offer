package 揭尹.华为机试.数值跳跃;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Jline on 2019/3/26.
 */
public class Souton {
    static TreeSet<Integer> treeSet = new TreeSet<>();
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int cout = 0;
        System.out.println(digui(arr,n-1,0,cout));
    }

    public static int digui(int[] arr,int n,int flag,int cout){
        if(n<=0) {
            treeSet.add(cout);
            return 0;
        }
        int s=arr[flag];
        while(s>0){
            digui(arr,n-s,flag+s,++cout);
            s--;
        }
        return treeSet.first();
    }
}
