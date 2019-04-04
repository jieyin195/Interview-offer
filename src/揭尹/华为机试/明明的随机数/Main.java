package 揭尹.华为机试.明明的随机数;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Jline on 2019/4/4.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < N; i++) {
                treeSet.add(sc.nextInt());
            }
            for (int i : treeSet) {
                System.out.println(i);
            }
        }
    }
}
