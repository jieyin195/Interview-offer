package 揭尹.CCF.出现次数最多的数;

import java.util.*;

/**
 * Created by Jline on 2019/4/7.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int s =sc.nextInt();
            if(!linkedHashMap.containsKey(s))
                linkedHashMap.put(s,1);
            else{
                linkedHashMap.put(s,linkedHashMap.get(s)+1);
            }
        }
        Set<Map.Entry<Integer,Integer>> set = linkedHashMap.entrySet();
        ArrayList<Map.Entry<Integer,Integer>> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 ) {
                int num = o2.getValue()-o1.getValue();
                int num2 = num == 0?o1.getKey()-o2.getKey():num;
                return num2;
            }
        });
        System.out.println(arrayList.get(0).getKey());
    }
}
