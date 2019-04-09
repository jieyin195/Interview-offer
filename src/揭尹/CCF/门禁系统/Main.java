package 揭尹.CCF.门禁系统;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by Jline on 2019/4/7.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int key=sc.nextInt();
            if(linkedHashMap.containsKey(key)) {
                linkedHashMap.put(key, linkedHashMap.get(key) + 1);
            }
            else {
                linkedHashMap.put(key, 1);
            }
            arrayList.add(linkedHashMap.get(key));
        }

        for(Integer i :arrayList)
            System.out.print(i+" ");
    }
}
